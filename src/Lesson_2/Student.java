package Lesson_2;

public class Student {
    public static int studentCount = 0;
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        studentCount++;
    }
    public static void main(String[] args) {
        Student s1 = new Student("John", 20);
        System.out.println(Student.studentCount);
        Student s2 = new Student("John", 22);
        System.out.println(Student.studentCount);
        Student s3 = new Student("John", 23);
        System.out.println(Student.studentCount);
        Student s4 = new Student("John", 23);
        System.out.println(Student.studentCount);
    }
}
