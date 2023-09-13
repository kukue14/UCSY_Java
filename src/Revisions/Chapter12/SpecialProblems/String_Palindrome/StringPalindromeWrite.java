package Revisions.Chapter12.SpecialProblems.String_Palindrome;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StringPalindromeWrite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            File fobj = new File("filename.txt");
            FileWriter fw = new FileWriter(fobj);
            PrintWriter pw = new PrintWriter(fw);
            System.out.print("Enter a string : ");
            String str = input.next();
            pw.write(str);
            pw.close();


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
