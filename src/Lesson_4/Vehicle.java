package Lesson_4;

public class Vehicle {
    private int id;
    private String color;

    int getId(int id){
        return id;
    }
    String getId(String id){
        return id;
    }
    public void park(){
        System.out.println("Vehicle is parking");
    }
    public void park(int slotId){
        System.out.println("Vehicle is parking at " + slotId);
    }
}
