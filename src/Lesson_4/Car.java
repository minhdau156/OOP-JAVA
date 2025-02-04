package Lesson_4;

public class Car extends Vehicle{
    private int direction = 0;

    @Override
    public void park(){
        System.out.println("car is parking");
    }

    public void parkAsVehicle(){
        super.park();
    }
    @Override
    public int getId(int id){
        return id + 1;
    }
}
