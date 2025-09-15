package parking_lot.factory;

import parking_lot.models.enums.SpotAssignmentStrategyType;
import parking_lot.strategies.NearestSpotAssignmentStrategy;
import parking_lot.strategies.SpotAssignmentStrategy;

public class SpotAssignmentFactory {

    public static SpotAssignmentStrategy getSportAssignmentStrategy(SpotAssignmentStrategyType spotAssignmentStrategyType){
        switch (spotAssignmentStrategyType){
            case NEAREST -> {
                return new NearestSpotAssignmentStrategy();
            }
            default -> {
                return null;
            }
        }
    }
}
