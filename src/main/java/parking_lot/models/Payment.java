package parking_lot.models;

import parking_lot.models.enums.PaymentMode;
import parking_lot.models.enums.PaymentStatus;

public class Payment {
    private String refNo;
    private String amount;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
}
