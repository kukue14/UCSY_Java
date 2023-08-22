package Exercises;

public class Student_Main {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setEmail("example@gmail.com");
        stu.setName("Someone");
        System.out.println("This is e-mail : " + stu.getEmail());
        System.out.println("This is name : " + stu.getName());
    }
}
