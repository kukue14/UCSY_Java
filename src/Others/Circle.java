package Others;

import java.util.Scanner;

public class Circle {
    double radius1, radius2;

    public void setRadius(double r1, double r2) {
        radius1 = r1;
        radius2 = r2;
    }

    public double Area(double r2, double r1) {
        double area;
        area = (Math.PI * r2 * r2) - (Math.PI * r1 * r1);
        return area;
    }

    public double circumference(double r2, double r1) {
        double circumference;
        circumference = (2 * Math.PI * r2) - (2 * Math.PI * r1);
        return circumference;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius1, radius2;
        System.out.print("Enter the radius of the larger circle : ");
        radius1 = input.nextDouble();
        System.out.print("Enter the radius of the smaller circle : ");
        radius2 = input.nextDouble();

        Circle cir = new Circle();
        cir.setRadius(radius1, radius2);

        System.out.println("The difference are of the two circles is : " + cir.Area(radius1, radius2));
        System.out.println("The circumference of the two circles is : " + cir.circumference(radius1, radius2));

    }

}
