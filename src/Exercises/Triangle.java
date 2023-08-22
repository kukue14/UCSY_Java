package Exercises;

import java.util.Scanner;

public class Triangle {
    double area;
    int parameter;
    int a, b, c;
    final boolean INVALID_DIMENSION = false;

    private boolean isValid(double a, double b, double c) {
        if((a + b > c) && (a + c > b) && (b + c > a)) {
            return true;
        } else {
            return false;
        }
    }

    private double getArea(int a, int b, int c) {
        double s = (double) (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }

    private int getParameter(int a, int b, int c) {
        parameter = a + b + c;
        return parameter;
    }

    public static void main(String[] args) {
        int side_a, side_b, side_c;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three sides of triangle : ");
        side_a = input.nextInt();
        side_b = input.nextInt();
        side_c = input.nextInt();
        Triangle trg = new Triangle();
        boolean v = trg.isValid(side_a, side_b, side_c);
        if(v == trg.INVALID_DIMENSION) {
            System.out.println("Invalid Dimensions.");
        } else {
            System.out.println("Area is : " + trg.getArea(side_a, side_b, side_c));
            System.out.println("Parameter is : " + trg.getParameter(side_a, side_b, side_c));
        }
    }
}
