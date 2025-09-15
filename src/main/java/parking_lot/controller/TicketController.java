package parking_lot.controller;

import lombok.RequiredArgsConstructor;
import parking_lot.dto.IssueTicketRequestDto;
import parking_lot.dto.IssueTicketResponseDto;
import parking_lot.dto.ResponseStatus;
import parking_lot.models.Ticket;
import parking_lot.repository.VehicleRepository;
import parking_lot.service.TicketService;

public class TicketController {

    private TicketService ticketService;


    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto ticketRequest){
        IssueTicketResponseDto issueTicketResponseDto = new IssueTicketResponseDto();
        try{
            Ticket ticket =ticketService.issueTicket(ticketRequest.getGateId(),ticketRequest.getVehicleNumber(),
                    ticketRequest.getVehicleOwnerName(),ticketRequest.getVehicleType(),ticketRequest.getParkingLotId());
            issueTicketResponseDto.setTicket(ticket);
            issueTicketResponseDto.setResponseStatus(ResponseStatus.SUCCESS);
        }catch (Exception e){
            issueTicketResponseDto.setResponseStatus(ResponseStatus.FAILED);
        }

        return issueTicketResponseDto;
    }
}
