package parking_lot.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import parking_lot.models.enums.TicketStatus;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Ticket extends BaseModel{
    private String ticketNo;
    private Gate gate;
    private Long entryTime;
    private Operator operator;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private TicketStatus ticketStatus;
}
