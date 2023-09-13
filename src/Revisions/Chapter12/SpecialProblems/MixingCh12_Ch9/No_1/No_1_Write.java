package Revisions.Chapter12.SpecialProblems.MixingCh12_Ch9.No_1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class No_1_Write {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        ArrayList<String> arrayStr = new ArrayList<String>();
        try {
            File fobj = new File("D:\\University Of Computer Studies, Yangon\\CS-202\\UCSY_Java\\src\\Revisions\\Chapter12\\SpecialProblems\\MixingCh12_Ch9\\No_1\\file1.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(fobj);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            while (true) {
                System.out.print("Enter a word : ");
                str = input.next();
                if (str.equalsIgnoreCase("STOP")) break;
                arrayStr.add(str);
            }
            objectOutputStream.writeObject(arrayStr);
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
