package Decorator;

public class ElectricCar {
    private Car car;
    private int batteryLevel;
    public ElectricCar(String color, String model, int speed, int batteryLevel) {
        this.car = new Car(color, model, speed);
        this.batteryLevel = batteryLevel;
    }

    public void displayDetails() {
        car.displayDetails();
        System.out.println("Battery Level: " + this. batteryLevel + "%");
    }
}
