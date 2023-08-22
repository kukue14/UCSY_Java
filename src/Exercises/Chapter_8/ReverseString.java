package Exercises.Chapter_8;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a string : ");
            StringBuffer str = new StringBuffer(input.nextLine());
            if(str.length() == 0) break;
            StringBuffer reverseStr = str.reverse();
            System.out.println(reverseStr);
        }

    }
}
