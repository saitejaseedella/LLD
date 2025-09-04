package parking_lot.models;

import parking_lot.models.enums.ParkingSpotStatus;
import parking_lot.models.enums.VehicleType;

public class ParkingSpot extends BaseModel{
    private ParkingSpotStatus parkingSpotStatus;
    private ParkingFloor parkingFloor;
    private int spotNo;
    private VehicleType vehicleType;
}
