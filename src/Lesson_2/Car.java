package Lesson_2;

public class Car {
    public final String model = "toyota";
    public static int totalCars = 0;
    public Car(){
        totalCars += 1;
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println("So object car da duoc tao : " + Car.totalCars);
        Car c2 = new Car();
        System.out.println("So object car da duoc tao : " + Car.totalCars);
        Person duy = new Person("Duy", 30, "TP HCM");
        System.out.println("Tuoi cua " + duy.name + " la: " + duy.getAge());
    }

}
