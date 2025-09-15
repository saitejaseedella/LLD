package parking_lot.repository;

import org.springframework.util.ObjectUtils;
import parking_lot.models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {

    private Map<Long, Gate> gateIdToGateMap = new HashMap<>();

    public Optional<Gate> getGateById(Long gateId){
        if(gateIdToGateMap.containsKey(gateId)){
            return Optional.of(gateIdToGateMap.get(gateId));
        }else {
            return Optional.empty();
        }
    }
}
