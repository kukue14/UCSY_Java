package Exercises.Chapter_12.ObjectReadAndWrite;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ObjectWrite_No_8 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            File fobj = new File("six.txt");
            FileOutputStream fobjOut = new FileOutputStream(fobj);
            ObjectOutputStream fw = new ObjectOutputStream(fobjOut);
            String str;
            ArrayList<String> arrayStr = new ArrayList<String>();

            while (true) {
                System.out.print("Enter a word : ");
                str = input.next();
                if (str.equalsIgnoreCase("stop")) break;
                arrayStr.add(str);
            }
            fw.writeObject(arrayStr);
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
