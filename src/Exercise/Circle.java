package Exercise;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        final double PI = 3.14159;
        double radius, area, circumferance;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius of a circle : ");
        radius = input.nextDouble();
        area = PI * radius * radius;
        circumferance = 2 * PI * radius;
        System.out.println("The radius of the circle : " + radius);
        System.out.println("The area of the circle : " + area);
        System.out.println("The circumferance of the circle : " + circumferance);

        int i = 1111111;
    }
}
