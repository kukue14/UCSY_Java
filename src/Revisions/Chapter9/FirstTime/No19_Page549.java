package Revisions.Chapter9.FirstTime;

import java.util.Scanner;

public class No19_Page549 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = input.nextLine();
        String mainStr = "";
        for (int i = 0; i < str.length(); i++) {
            String tempStr = String.valueOf(str.charAt(i));
            if (tempStr.equals(tempStr.toLowerCase())) {
                tempStr = tempStr.toUpperCase();
            } else {
                tempStr = tempStr.toLowerCase();
            }
            mainStr += tempStr;
        }
        System.out.println(mainStr);
    }
}
