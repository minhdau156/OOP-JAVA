package Lesson_1;

public class Car {
    private String Color;
    private String Model;
    private Integer Speed;
    private Boolean engineOn;
    public Car(String Color, String Model, Integer Speed) {
        this.Color = Color;
        this.Model = Model;
        this.Speed = Speed;
        this.engineOn = false;
    }
    public void displayDetails(){
        System.out.println("Car Model: " + this.Model);
        System.out.println("Color: " + this.Color);
        System.out.println("Speed: " + this.Speed + "km/h");
        System.out.println("--------------------");
    }
    public void accelerate(int increment){
        this.Speed += increment;
        System.out.println("New Speed: " + this.Speed + "km/h");
    }
    public void paint (String NewColor){
        this.Color = NewColor;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public Integer getSpeed() {
        return Speed;
    }

    public void setSpeed(Integer speed) {
        Speed = speed;
    }

    public Boolean getEngineOn() {
        return engineOn;
    }

    public void setEngineOn(Boolean engineOn) {
        this.engineOn = engineOn;
    }
    private void startEngine(){
        this.engineOn = true;
        System.out.println("Engine started......");
    }
    public void  drive(){
        if(!this.engineOn){
            startEngine();
        }
        System.out.println("Car is driving at " + this.Speed + " km/h");
    }
}
