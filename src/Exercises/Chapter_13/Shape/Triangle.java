package Exercises.Chapter_13.Shape;

public class Triangle {
    private double base;
    private double height;
    Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }
    public double calculateArea() {
        return ((height*base)/2);
    }
}
