package parking_lot.models;

import lombok.Data;
import parking_lot.models.enums.VehicleType;

@Data
public class Vehicle extends BaseModel{

    private String no;
    private Owner owner;
    private VehicleType vehicleType;
}
