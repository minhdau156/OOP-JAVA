package Lesson_3;

public class Bird extends Animal{
    public String color;
    public Boolean canFly;

    public Bird(String color, Boolean canFly, String environmental, int weight, int length){
        super(environmental, weight, length);
        this.color = color;
        this.canFly = canFly;
    }
}
