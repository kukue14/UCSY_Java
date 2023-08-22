package Exercises;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        int mid;
        String str;
        System.out.print("Enter a word : ");
        Scanner input = new Scanner(System.in);
        str = input.next();
        mid = str.length() / 2;
        System.out.println(str.substring(mid, mid + 1));
    }
}
