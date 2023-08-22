package Exercises.Chapter_8;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inSentence;
        System.out.print("Sentence : ");
        inSentence = input.next();
        Replace(inSentence);
        isPalindrome(inSentence);
        vowelsCount(inSentence);

    }

    public static void isPalindrome(String inSentence) {
        StringBuffer strBuffer = new StringBuffer(inSentence);
        strBuffer.reverse();
        System.out.println(strBuffer);
        if(inSentence.equals(strBuffer.toString())) System.out.println(inSentence + " is Palindrome because of " + strBuffer);
        else System.out.println(inSentence + " is not Palindrome.");
    }
    public static void Replace(String inSentence) {
        StringBuffer tempStringBuffer;
        String letter;
        tempStringBuffer = new StringBuffer(inSentence);
        for(int index=0; index < inSentence.length(); index++) {
            letter=inSentence.charAt(index) + "";
//            letter = String.valueOf(inSentence.charAt(index));
            if(letter.equalsIgnoreCase("A") || letter.equalsIgnoreCase("E") || letter.equalsIgnoreCase("I") || letter.equalsIgnoreCase("O") || letter.equalsIgnoreCase("U")) {
                tempStringBuffer.setCharAt(index, 'X');
            }
        }
        System.out.println("Replaced String : " + tempStringBuffer);
    }

    public static void vowelsCount(String inSentence) {
        String letter;
        int count=0;
        for(int index=0; index < inSentence.length(); index++) {
            letter=inSentence.charAt(index) + "";
//            letter = String.valueOf(inSentence.charAt(index));
            if(letter.equalsIgnoreCase("A") || letter.equalsIgnoreCase("E") || letter.equalsIgnoreCase("I") || letter.equalsIgnoreCase("O") || letter.equalsIgnoreCase("U")) {
                count++;
            }
        }
        System.out.println("Vowels count : " + count);
    }
}
