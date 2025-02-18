package Observer;

public class Observer1 implements Observer {
    private String name;
    public Observer1(String name) {
        this.name = name;
    }
    @Override
    public void update(String massage) {
        System.out.println(this.name + " received massage : " + massage);
    }
}
