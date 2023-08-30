package Exercises.Chapter_13.Shape;

public class Circle {
    private double radius;
    Circle (double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return (Math.PI*radius*radius);
    }
}
