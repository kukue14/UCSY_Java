package Revisions.Chapter2;

import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class No26_P80 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '!') System.out.println();
            else System.out.print(str.charAt(i));
        }
//        int i = str.indexOf('!');
//        System.out.println(str.substring(0, i));
//        System.out.println(str.substring(i+1, str.length()));
    }
}
