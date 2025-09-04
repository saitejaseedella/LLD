package parking_lot.models;

import parking_lot.models.enums.GateStatus;
import parking_lot.models.enums.GateType;

public class Gate extends BaseModel{
    private GateType gateType;
    private Operator operator;
    private int gateNo;
    private GateStatus gateStatus;
}
