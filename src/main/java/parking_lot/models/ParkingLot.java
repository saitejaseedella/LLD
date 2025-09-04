package parking_lot.models;

import com.fasterxml.jackson.databind.ser.Serializers;
import parking_lot.models.enums.GateType;
import parking_lot.models.enums.ParkingLotStatus;

import javax.swing.*;
import java.util.List;

public class ParkingLot extends BaseModel{
    private List<ParkingFloor> parkingFloors;
    private ParkingLotStatus parkingLotStatus;
    private List<Gate> gates;
    private ParkingLotManager parkingLotManager;

}
