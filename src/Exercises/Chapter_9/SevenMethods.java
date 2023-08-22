package Exercises.Chapter_9;

import java.awt.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SevenMethods {

    private void showReversedString(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println("String reverse : " + stringBuffer.reverse());
    }

    private void showReversedWordString(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        System.out.print("Reversed word string : " );
        while (stringTokenizer.hasMoreTokens()) {
            StringBuffer stringBuffer = new StringBuffer(stringTokenizer.nextToken());
            System.out.print(stringBuffer.reverse());
        }
    }

    private void checkedPalindrome(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        if (stringBuffer.reverse().toString().equals(str)) System.out.println(str + " is Palindrome.");
        else System.out.println(str + " is not Palindrome.");
    }

    private void showWordCount(String str) {
        int wordCount = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        while (stringTokenizer.hasMoreTokens()) {
            wordCount++;
            stringTokenizer.nextToken();
        }
        System.out.println("The number of word : " + wordCount);
    }

    private void showCharCount(String str) {
        int charCount = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        while (stringTokenizer.hasMoreTokens()) {
            charCount += stringTokenizer.nextToken().length();
        }
        System.out.println("The number of character(exclusive space) : " + charCount);
    }

    private void replaceVowelX(String str) {
        System.out.println("Replaced X : " + str.replaceAll("[aeiouAEIOU]", "X"));
    }

    private void showVowelCount(String str) {
        int vowelCount = 0;
        Pattern pattern = Pattern.compile("[aeiouAEIOU]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            vowelCount++;
        }
        System.out.println("The number of Vowel : " + vowelCount);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SevenMethods methods = new SevenMethods();
        String str;

        while (true) {
            System.out.print("Enter a string : ");
            str = input.nextLine();
            if(str.isEmpty()) break;
            methods.showReversedString(str);
            methods.showReversedWordString(str);
            methods.checkedPalindrome(str);
            methods.showWordCount(str);
            methods.showCharCount(str);
            methods.replaceVowelX(str);
            methods.showVowelCount(str);

        }
    }
}
