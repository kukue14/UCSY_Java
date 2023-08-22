package Exercises.Chapter_5;

import java.util.Scanner;

public class PerfectNum {
    static boolean isPerfect(int num) {
        int total = 1;
        for(int i = 2; i < num; i++) {
            if(num % i == 0) total += i;
        }
        if(total == num) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        if(isPerfect(num)) System.out.println(num + " is perfect number.");
        else System.out.println(num + " is not perfect number.");

    }
}
