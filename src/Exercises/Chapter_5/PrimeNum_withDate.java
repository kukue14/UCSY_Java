package Exercises.Chapter_5;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Scanner;

public class PrimeNum_withDate {
    static int NumOfPrime(int end_num) {
        int count = 0;
        for (int i = 2; i <= end_num; i++) {
            int divisor = 2;
            while (i % divisor != 0) divisor++;
            if (i == divisor) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date start = new Date();

        System.out.print("Enter the end number : ");
        int end_num = input.nextInt();
        int count = NumOfPrime(end_num);
        System.out.println(count);
        Date end = new Date();
        System.out.println("Expectation time : " + (end.getTime() - start.getTime()) + " milli Second.");
    }
}
