package Lesson_2;

public class Circle {
    public final Double Pi = 3.14;
    public Double radius;
    public Double area(){
        Double area = Pi * this.radius * this.radius;
        return area;
    };
    public static void main(String[] args){
        Circle circle = new Circle();
        circle.radius = (double) 3;
        System.out.println(circle.area());
    }
}
