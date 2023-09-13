package Revisions.TrCollections.Palindrome;

import javax.management.StringValueExp;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WordsInStringPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = input.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        while (stringTokenizer.hasMoreElements()) {
            String origin = stringTokenizer.nextToken();
            StringBuffer stringBuffer = new StringBuffer(origin);
            String reverse = String.valueOf(stringBuffer.reverse());
            if (origin.equalsIgnoreCase(reverse)) System.out.println(origin + " is the Palindrome");
            else System.out.println(origin + " is not Palindrome");
        }
    }
}
