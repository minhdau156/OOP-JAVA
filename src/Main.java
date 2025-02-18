import Decorator.ElectricCar;
import Observer.Observer1;
import Observer.Observer2;
import Observer.Subject1;

public class Main {
    public static void main(String[] args) {
        Observer observer1 = new Observer1("observer 1");
        Observer observer2 = new Observer2("observer 2");

        Subject1 subject1 = new Subject1();
        Subject1 subject2 = new Subject1();

        subject1.addObserver(observer1);
        subject2.addObserver(observer1);

        subject1.addObserver(observer2);

        subject1.notifyObservers("Hello");
        subject2.notifyObservers("HGoodbye");
    }
}