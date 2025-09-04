package parking_lot.models;

import parking_lot.models.enums.BillStatus;

import java.util.List;

public class Bill extends BaseModel{
    private String billNo;
    private Ticket ticket;
    private Operator operator;
    private Gate gate;
    private List<Payment> payments;
    private double amount;
    private BillStatus billStatus;
}
