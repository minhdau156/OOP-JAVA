package Final;

import java.util.HashMap;
import java.util.Map;

public class ParkingArea {
    private Map<Integer, ParkingLot> parkingLotMap;
    private int capacity;
    private int numEmpty;

    public ParkingArea(int capacity) {
        this.capacity = capacity;

        this.parkingLotMap = new HashMap();
        for (int i = 1; i <= capacity; i++) {
            parkingLotMap.put(i, new ParkingLot(i));
        }
    }

//    public int getNumEmpty() {}
//    public int getAnEmptyLotId() {}
}
