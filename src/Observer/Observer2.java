package Observer;

public class Observer2 implements Observer {
    private String name;
    public Observer2(String name) {
        this.name = name;
    }
    @Override
    public void update(String massage) {
        System.out.println("Length of massage" + massage.length());
    }
}
