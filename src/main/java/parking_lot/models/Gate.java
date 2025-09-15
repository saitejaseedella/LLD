package parking_lot.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import parking_lot.models.enums.GateStatus;
import parking_lot.models.enums.GateType;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gate extends BaseModel{
    private GateType gateType;
    private Operator operator;
    private int gateNo;
    private GateStatus gateStatus;
    private ParkingFloor parkingFloor;
}
