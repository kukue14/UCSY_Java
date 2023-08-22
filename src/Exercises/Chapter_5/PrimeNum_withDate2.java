package Exercises.Chapter_5;

import java.util.Date;
import java.util.Scanner;

public class PrimeNum_withDate2 {
    static boolean isPrime(int num) {
        int divisor = 2;
        while(num % divisor != 0) divisor++;
        if(num == divisor) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date start = new Date();
        int count = 0;
        System.out.print("Enter the end number : ");
        int end_num = input.nextInt();
        for(int i = 2; i<=end_num; i++) {
            if(isPrime(i)) count++;
        }
        Date end = new Date();
        System.out.println(count);
        System.out.println("Expectation time : " + (end.getTime() - start.getTime()) + " milli Second.");
    }
}
