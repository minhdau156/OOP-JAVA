package Decorator;

public class Car {
    private String color;
    private String model;
    private int speed;


    public Car(String color, String model, int speed) {
        this.color = color;
        this.model = model;
        this.speed = speed;
    }

    public void displayDetails() {
        System.out.println("Car Model: " + this.model);
        System.out.println("Car Color: " + this.color);
        System.out.println("Car Speed: " + this.speed + " km/h");
    }

    public void accelerate(int increment) {
        this.speed += increment;
        System.out.println("New speed: " + this.speed + " km/h");
    }
}
