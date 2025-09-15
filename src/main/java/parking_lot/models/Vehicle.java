package parking_lot.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import parking_lot.models.enums.VehicleType;

@EqualsAndHashCode(callSuper = true)
@Data
public class Vehicle extends BaseModel{

    private String vehicleNo;
    private String ownerName;
    private VehicleType vehicleType;
}
