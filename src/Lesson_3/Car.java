package Lesson_3;

public class Car extends Vehicle {
    public int numSeats;
    public Car(int id){
        super(id);
    }
    public void parkAsCar(){
        System.out.println("Car is parking");
    }
}
