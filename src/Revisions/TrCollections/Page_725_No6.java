package Revisions.TrCollections;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Page_725_No6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            File fobj = new File("C:\\Users\\hp\\Desktop\\ \\Ku_Kue\\CS-202\\UCSY_Java\\src\\Revisions\\TrCollections\\filename.txt");
            FileWriter fileWriter = new FileWriter(fobj);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            while (true) {
                System.out.print("Enter a String : ");
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
