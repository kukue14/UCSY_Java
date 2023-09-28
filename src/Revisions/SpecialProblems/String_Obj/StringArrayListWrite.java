package Revisions.SpecialProblems.String_Obj;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StringArrayListWrite {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            File fobj = new File("file.txt");
            FileOutputStream fileOutput = new FileOutputStream(fobj);
            ObjectOutputStream objOutput = new ObjectOutputStream(fileOutput);
            ArrayList<String> arrayList = new ArrayList<String>();
            while (true) {
                System.out.print("Enter a string : ");
                String str = input.nextLine();
                if (str.equalsIgnoreCase("STOP")) break;
                arrayList.add(str);
            }

            objOutput.writeObject(arrayList);
            objOutput.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
