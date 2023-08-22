package Exercises.Chapter_5;

import java.util.Scanner;

public class Armstrong {
    public boolean isArmstrong(int num) {
        String str = num + "";
        int origin_num = num;
        int total = 0;
        int digit;
        while (num != 0) {
            digit = num % 10;
            total += Math.pow(digit, str.length());
            num /= 10;
        }

        if (total == origin_num) return true;
        else return false;
    }

    public int getReverse(int num) {
        int total;
        total = 0;
        while(num != 0) {
            int digit = num % 10;
            total = total * 10 + digit;
            num /= 10;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter a number : ");
        num = input.nextInt();
        Armstrong armstrong = new Armstrong();
        if(armstrong.isArmstrong(num)) System.out.println(num + " is Armstrong number.");
        else System.out.println(num + " is not Armstrong number.");

        System.out.println("The reverse value of " + num + " is " + armstrong.getReverse(num));

    }
}
