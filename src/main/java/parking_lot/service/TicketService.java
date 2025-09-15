package parking_lot.service;

import org.springframework.util.ObjectUtils;
import parking_lot.dto.IssueTicketResponseDto;
import parking_lot.exceptions.CustomExceptions;
import parking_lot.factory.SpotAssignmentFactory;
import parking_lot.models.*;
import parking_lot.models.enums.SpotAssignmentStrategyType;
import parking_lot.models.enums.TicketStatus;
import parking_lot.models.enums.VehicleType;
import parking_lot.repository.GateRepository;
import parking_lot.repository.ParkingLotRepository;
import parking_lot.repository.VehicleRepository;
import parking_lot.strategies.SpotAssignmentStrategy;

import java.nio.channels.AcceptPendingException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class TicketService {

    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;

    public TicketService(GateRepository gateRepository,VehicleRepository vehicleRepository,ParkingLotRepository parkingLotRepository){
        this.gateRepository=gateRepository;
        this.vehicleRepository=vehicleRepository;
        this.parkingLotRepository=parkingLotRepository;
    }

   public Ticket issueTicket(Long gateId,
                             String vehicleNumber,
                             String ownerName,
                             VehicleType vehicleType,
                             Long parkingLotId
                             ) throws CustomExceptions {
       Ticket ticket = new Ticket();
       ticket.setEntryTime(System.currentTimeMillis());

       Optional<Gate> optionalGate = gateRepository.getGateById(gateId);
       if(optionalGate.isEmpty()){
            throw new CustomExceptions("Gate Not Found" + gateId);
       }
       Gate gate = optionalGate.get();
       ticket.setGate(gate);
       ticket.setOperator(gate.getOperator());

       Optional<Vehicle> optionalVehicle = vehicleRepository.findByVehicleId(vehicleNumber);
        Vehicle savedVehicle;
       if(optionalVehicle.isEmpty()){
            Vehicle vehicle = new Vehicle();
            vehicle.setVehicleNo(vehicleNumber);
            vehicle.setOwnerName(ownerName);
            vehicle.setVehicleType(vehicleType);
            vehicleRepository.save(vehicle);
            savedVehicle = vehicle;
       }else{
           savedVehicle = optionalVehicle.get();
       }
        ticket.setVehicle(savedVehicle);
       ticket.setTicketStatus(TicketStatus.VALID);
       ticket.setTicketNo("TICKET_"+ gateId +"_"+ vehicleNumber);

       Optional<ParkingLot> optionalParkingLot = parkingLotRepository.getParkingLotId(parkingLotId);
       if(optionalParkingLot.isEmpty()){
           throw new CustomExceptions("parking lot not fond"+parkingLotId);
       }

       ParkingLot parkingLot = optionalParkingLot.get();

       SpotAssignmentStrategyType spotAssignmentStrategyType = parkingLot.getSpotAssignmentStrategyType();

    SpotAssignmentStrategy spotAssignmentStrategy = SpotAssignmentFactory.getSportAssignmentStrategy(spotAssignmentStrategyType);
    ParkingSpot parkingSpot = spotAssignmentStrategy.assignSpot(vehicleType,gate);

        ticket.setParkingSpot(parkingSpot);
      return ticket;
   }
}
