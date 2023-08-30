package Revisions.Chapter12.Exercises;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class No8_Page726 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            File fobj = new File("no6_page725_Obj.txt");
            FileOutputStream fw = new FileOutputStream(fobj);
            ObjectOutputStream pw = new ObjectOutputStream(fw);
            ArrayList<String> arrayList = new ArrayList<String>();
            while (true) {
                System.out.print("Enter a word : ");
                String str = input.next();
                if (str.equalsIgnoreCase("stop")) break;
                arrayList.add(str);
            }
            pw.writeObject(arrayList);
            pw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
