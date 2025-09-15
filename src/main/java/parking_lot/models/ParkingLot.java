package parking_lot.models;

import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import parking_lot.models.enums.GateType;
import parking_lot.models.enums.ParkingLotStatus;
import parking_lot.models.enums.SpotAssignmentStrategyType;

import javax.swing.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingLot extends BaseModel{
    private List<ParkingFloor> parkingFloors;
    private ParkingLotStatus parkingLotStatus;
    private List<Gate> gates;
    private ParkingLotManager parkingLotManager;
    private String address;
    private int capacity;
    private Long parkingLotId;
    private SpotAssignmentStrategyType spotAssignmentStrategyType;

}
