package Revisions.Chapter12.SpecialProblems.MixingCh12_Ch9.OnlyPalindromWordAreWritten;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OnlyPalindromWordAreWritten {

//    Checking Palindrom
    public static boolean isPalindrome(String origin) {
        StringBuffer stringBuffer = new StringBuffer(origin);
        String reverse = String.valueOf(stringBuffer.reverse());
        if (reverse.equalsIgnoreCase(origin)) return true;
        else return false;
    }

//    Typing in File
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            File fobj = new File("D:\\University Of Computer Studies, Yangon\\CS-202\\UCSY_Java\\src\\Revisions\\Chapter12\\SpecialProblems\\MixingCh12_Ch9\\OnlyPalindromWordAreWritten\\Palindromes.txt");
            FileWriter fileWriter = new FileWriter(fobj);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            while (true) {
                System.out.print("Enter a word : ");
                String str = input.next();
                if (str.equalsIgnoreCase("STOP")) break;
                if (isPalindrome(str)) {
                    printWriter.println(str);
                }
            }
            printWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
