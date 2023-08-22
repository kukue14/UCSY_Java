package Exercises.Chapter_5;

import java.util.Scanner;

public class Ex_7 {
    void sum_cube_digit(int num) {
        int origin = num;
        int total = 0, digit;
        String str = " ";
        while (num != 0) {
            digit = num % 10;
            num = num / 10;
            total += Math.pow(digit, 3);
            if (origin == num) str = digit + "^3" + str;
            else str = digit + "^3+" + str;
        }
        System.out.println(origin + " = " + str + " = " + total);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min, max;
        System.out.println("Enter a min and max : ");
        min = input.nextInt();
        max = input.nextInt();
        Ex_7 abcd = new Ex_7();
        for (int i = min; i <= max; i++) {
            abcd.sum_cube_digit(i);
        }

    }
}
