package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject1 implements Subject {
    private ArrayList<Observer> observersList = new ArrayList<Observer>();

    @Override
    public void addObserver(Observer observer) {
        observersList.add(observer);
    }

    public void notifyObservers(String massage) {
        for (Observer observer : observersList) {
            observer.update(massage);
        }
    }
}
