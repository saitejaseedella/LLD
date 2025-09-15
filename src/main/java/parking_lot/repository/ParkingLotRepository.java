package parking_lot.repository;

import parking_lot.models.ParkingLot;

import java.util.HashMap;
import java.util.Optional;

public class ParkingLotRepository {

    HashMap<Long, ParkingLot> parkingLotHashMap = new HashMap<>();

    public Optional<ParkingLot> getParkingLotId(Long parkingLotId){
        if(parkingLotHashMap.containsKey(parkingLotId)){
            return Optional.of(parkingLotHashMap.get(parkingLotId));
        }else {
            return Optional.empty();
        }
    }
    public void save(ParkingLot parkingLot){
        parkingLotHashMap.put(parkingLot.getParkingLotId(),parkingLot);
    }
}
