package Lesson_2;

public class Person {
    public String name;
    private int age;
    protected String address;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void showInfo(){
        String name = "Duy";
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
    }
    public static void main(String[] args) {
        Person minh = new Person("Minh", 20, "Le Loi");
        minh.showInfo();
    }
}
