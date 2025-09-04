package parking_lot.models;

import parking_lot.models.enums.TicketStatus;

import javax.xml.crypto.Data;

public class Ticket extends BaseModel{
    private String ticketNo;
    private Gate gate;
    private Data entryTime;
    private Operator operator;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private TicketStatus ticketStatus;
}
