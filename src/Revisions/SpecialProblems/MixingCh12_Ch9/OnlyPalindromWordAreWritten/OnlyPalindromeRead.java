package Revisions.SpecialProblems.MixingCh12_Ch9.OnlyPalindromWordAreWritten;

import java.io.*;

public class OnlyPalindromeRead {
    public static void main(String[] args) {
        try {
            File fobj = new File("D:\\University Of Computer Studies, Yangon\\CS-202\\UCSY_Java\\src\\Revisions\\Chapter12\\SpecialProblems\\MixingCh12_Ch9\\OnlyPalindromWordAreWritten\\Palindromes.txt");
            FileReader fileReader = new FileReader(fobj);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
