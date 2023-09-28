package Revisions.SpecialProblems.MixingCh12_Ch9.No_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class No_1_Read {
    public static void main(String[] args) {
        ArrayList<String> arrayStr = new ArrayList<String>();
        try {
            File fobj = new File("D:\\University Of Computer Studies, Yangon\\CS-202\\UCSY_Java\\src\\Revisions\\Chapter12\\SpecialProblems\\MixingCh12_Ch9\\No_1\\file1.txt");
            FileInputStream fileInputStream = new FileInputStream(fobj);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            arrayStr = (ArrayList<String>) objectInputStream.readObject();
            objectInputStream.close();

//            Finding shortest and longest word
            String shortestStr = "", longestStr = "";
            double shortestInt = 0, longestInt = 0;
            int index = 0;
            double total = 0, avg;
            for (String aStr : arrayStr) {
                if (index == 0) shortestInt = aStr.length();

                if (shortestInt > aStr.length()) {
                    shortestInt = aStr.length();
                    shortestStr = aStr;
                }

                if (longestInt < aStr.length()) {
                    longestInt = aStr.length();
                    longestStr = aStr;
                }

                total += aStr.length();
                index++;
            }
            System.out.println("The shortest word is " + shortestStr + " with the length of " + shortestInt + " characters.");
            System.out.println("The longest word is " + longestStr + " with the length of " + longestInt + " characters.");
            System.out.println("The average character number is : " + (total/index));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
