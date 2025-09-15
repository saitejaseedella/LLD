package parking_lot.strategies;

import parking_lot.models.Gate;
import parking_lot.models.ParkingSpot;
import parking_lot.models.enums.VehicleType;

public interface SpotAssignmentStrategy {

    ParkingSpot assignSpot(VehicleType vehicleType, Gate gate);
}
