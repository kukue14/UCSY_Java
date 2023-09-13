package Revisions.Chapter12.SpecialProblems.MixingCh12_Ch9.AllWordsAreWrittenButOnlyPalindromeRead;

import java.io.*;
import java.util.Scanner;

public class AllWordsAreWritten {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            File fobj = new File("D:\\University Of Computer Studies, Yangon\\CS-202\\UCSY_Java\\src\\Revisions\\Chapter12\\SpecialProblems\\MixingCh12_Ch9\\AllWordsAreWrittenButOnlyPalindromeRead\\words.txt");
            FileWriter fileWriter = new FileWriter(fobj);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            while (true) {
                System.out.print("Enter a word : ");
                String str = input.next();
                if (str.equalsIgnoreCase("STOP")) break;
                printWriter.println(str);
            }
            printWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
