package Revisions.Chapter12.SpecialProblems.MixingCh12_Ch9.AllWordsAreWrittenButOnlyPalindromeRead;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class OnlyPalindromRead {

//    Checking Palindrome
    public static boolean isPalindrome(String origin) {
        StringBuffer stringBuffer = new StringBuffer(origin);
        String reverse = String.valueOf(stringBuffer.reverse());
        if (origin.equalsIgnoreCase(reverse)) return true;
        else return false;
    }

//    Reading File
    public static void main(String[] args) {
        try {
            File fobj = new File("D:\\\\University Of Computer Studies, Yangon\\\\CS-202\\\\UCSY_Java\\\\src\\\\Revisions\\\\Chapter12\\\\SpecialProblems\\\\MixingCh12_Ch9\\\\AllWordsAreWrittenButOnlyPalindromeRead\\\\words.txt");
            FileReader fileReader = new FileReader(fobj);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                if (isPalindrome(str)) System.out.println("\"" + str + "\"" + " is Palindrome.");
                else System.out.println("\"" + str + "\"" + " isn't Palindrome.");
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
