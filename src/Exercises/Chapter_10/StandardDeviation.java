package Exercises.Chapter_10;

import java.util.Scanner;

public class StandardDeviation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = input.nextInt();
        double[] N = new double[size];
        double sum = 0;
        double xbar = 0;
        for (int i = 0; i < N.length; i++) {
            System.out.print("Enter a real number : ");
            N[i] = input.nextDouble();
            sum += N[i];
        }

        xbar = sum / N.length;
        double result = 0, s = 0;

        for (int i = 0; i < N.length; i++) {
            result += Math.pow((N[i] - xbar), 2);
        }

        s = Math.sqrt(result / N.length);
        System.out.println("Standard Deviation : " + s);

        double max = N[0];
        double min = N[0];
        for (int i = 0; i < N.length; i++) {
            if (max < N[i]) max = N[i];
            if (min > N[i]) min = N[i];
        }
        System.out.println("The maximum number is : " + max);
        System.out.println("The minimum number is : " + min);
    }
}
