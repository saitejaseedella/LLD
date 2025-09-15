package parking_lot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import parking_lot.models.Gate;
import parking_lot.models.Operator;
import parking_lot.models.ParkingSpot;
import parking_lot.models.Vehicle;
import parking_lot.models.enums.TicketStatus;
import parking_lot.models.enums.VehicleType;

import java.awt.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IssueTicketRequestDto {
    private VehicleType vehicleType;
    private String vehicleNumber;
    private String vehicleOwnerName;
    private Long gateId;
    private Long parkingLotId;
}
