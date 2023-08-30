package Exercises.Chapter_13.Shape;

public class UserClass {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(20, 30);
        Circle circle = new Circle(40);
        System.out.println(triangle.calculateArea());
        System.out.println(circle.calculateArea());
    }
}
