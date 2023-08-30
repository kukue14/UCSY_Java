package Revisions.Chapter12.StringStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StringWrite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            File fobj = new File("stringStream.txt");
            FileWriter fw = new FileWriter(fobj);
            PrintWriter pw = new PrintWriter(fw);
            System.out.print("Enter a String: ");
            String str = input.nextLine();
            pw.println(str);
            pw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
