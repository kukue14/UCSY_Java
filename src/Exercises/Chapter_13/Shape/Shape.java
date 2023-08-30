package Exercises.Chapter_13.Shape;

public abstract class Shape {
    private String color;
    Shape (String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public abstract double calculateArea();
}
