package Lesson_6;

public class SingletonExample {
    private static SingletonExample instance;
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    private SingletonExample(){
        this.x = 0;
    }
     public static SingletonExample getInstance(){
        if (instance == null) {
            instance = new SingletonExample();

        }
        return instance;
     }
    public void increaseX() {
        this.x += 1;
    }
    public static void main(String[] args) {
        SingletonExample so;
        so = SingletonExample.getInstance();

    }
}
