package Revisions.SpecialProblems.MixingCh12_Ch9.CheckingPalindrome;

import java.util.Scanner;

public class CheckingPalindrome {

//    Checking Palindrome
    public static boolean isPalindrome(String origin) {
        StringBuffer stringBuffer = new StringBuffer(origin);
        String reverse = stringBuffer.reverse().toString();
        if (origin.equalsIgnoreCase(reverse)) return true;
        else return false;
    }

//    User Input
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a word : ");
            String str = input.nextLine();
            if (str.isEmpty()) break;
            if (isPalindrome(str)) System.out.println("\"" + str + "\"" + " is Palindrome.");
            else System.out.println("\"" + str + "\"" + " isn't Palindrome.");
        }
    }
}
