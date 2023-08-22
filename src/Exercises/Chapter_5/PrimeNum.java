package Exercises.Chapter_5;

import java.util.Scanner;

public class PrimeNum {
    static  boolean isPrime(int num) {
        int divisor = 2;
        while(num % divisor != 0) divisor++;
        if(num == divisor) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        if(isPrime(num)) {
            System.out.println(num + " is Prime.");
        } else {
            System.out.println(num + " is not Prime.");
        }
    }
}
