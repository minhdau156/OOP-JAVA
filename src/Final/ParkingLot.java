package Final;

public class ParkingLot {
    private int id;
    private int status;

    public ParkingLot(int id) {
        this.id = id;
        this.status = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
