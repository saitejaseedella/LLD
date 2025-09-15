package parking_lot.repository;

import parking_lot.models.Vehicle;

import java.nio.channels.Pipe;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicleRepository {

    private Map<String, Vehicle> vehicleMap = new HashMap<>();

    public Optional<Vehicle> findByVehicleId(String vehicleId){
        if(vehicleMap.containsKey(vehicleId)){
            return Optional.of(vehicleMap.get(vehicleId));
        }else {
            return Optional.empty();
        }
    }

    public void save(Vehicle vehicle){
        vehicleMap.put(vehicle.getVehicleNo(),vehicle);
    }

}
