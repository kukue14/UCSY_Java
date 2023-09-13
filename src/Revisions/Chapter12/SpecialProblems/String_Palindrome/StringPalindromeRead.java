package Revisions.Chapter12.SpecialProblems.String_Palindrome;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StringPalindromeRead {
    public static void main(String[] args) {
        try {
            File fobj = new File("filename.txt");
            FileReader fr = new FileReader(fobj);
            BufferedReader bfr = new BufferedReader(fr);
            String str = bfr.readLine();
            if (isPalindrome(str)) System.out.println("This is palindrome.");
            else System.out.println("This is not palindrome.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean isPalindrome(String str) {
        StringBuffer strBuffer = new StringBuffer(str);
        if (strBuffer.reverse().toString().equals(str)) return true;
        else return false;
    }
}
