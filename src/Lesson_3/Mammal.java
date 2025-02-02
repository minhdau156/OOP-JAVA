package Lesson_3;

public class Mammal extends Animal{
    private int numLegs;
    private String food;

    public Mammal(int  numLegs, String food, String environmental, int weight, int length){
        super(environmental, weight, length);
        this.numLegs = numLegs;
        this.food = food;
    }
}
