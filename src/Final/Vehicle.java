package Final;

import java.util.concurrent.atomic.AtomicInteger;

public class Vehicle {
    static AtomicInteger autoId = new AtomicInteger(1);
    private int id;
    private String licenseId;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }
}
