package Exercises.Chapter_12.StringReadAndWrite;

import java.io.*;
import java.util.Scanner;

public class StringWrite_No_6 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            File fobj = new File("six.txt");
            FileWriter fw = new FileWriter(fobj);
            PrintWriter pw = new PrintWriter(fw);
            String str;
            while (true) {
                System.out.print("Enter a string : ");
                str=input.next();
                if (str.equalsIgnoreCase("STOP")) break;
                pw.println(str);
            }
            pw.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
