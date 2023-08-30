package Revisions.Chapter12.Exercises;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class No6_Page725 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            File fobj = new File("no6_page725.txt");
            FileWriter fw = new FileWriter(fobj);
            PrintWriter pw = new PrintWriter(fw);
            while (true) {
                System.out.print("Enter a word : ");
                String str = input.next();
                if (str.equalsIgnoreCase("stop")) break;
                pw.println(str);
            }
            pw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
