package Final;

import java.util.concurrent.atomic.AtomicInteger;

public class ParkingTicket {
    static AtomicInteger autoId = new AtomicInteger(1);
    private int id;
    private int parkingLotId;
    private int vehicleId;
    private int status;
    private long createTime;
    private int releaseTime;

    public ParkingTicket(int vehicleId, int parkingLotId){
        this.id = autoId.getAndIncrement();
        this.createTime = System.currentTimeMillis();
        this.parkingLotId = parkingLotId;
        this.vehicleId = vehicleId;
    }
    public void park(){}

    public void release(){}
}
