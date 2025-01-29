package Lesson_1;

public class ElectricCar extends Car {
    private int batteryLevel;
    public ElectricCar(String COlor, String Model, int Speed, int batteryLevel) {
        super(COlor, Model, Speed);
        this.batteryLevel = batteryLevel;

    }
    @Override
    public void displayDetails(){
        super.displayDetails();
    }
}
