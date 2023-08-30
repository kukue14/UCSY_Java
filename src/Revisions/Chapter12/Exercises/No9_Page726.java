package Revisions.Chapter12.Exercises;

import java.io.*;
import java.util.ArrayList;

public class No9_Page726 {
    public static void main(String[] args) {
        try {
            File fobj = new File("no6_page725_Obj.txt");
            FileInputStream fr = new FileInputStream(fobj);
            ObjectInputStream br = new ObjectInputStream(fr);
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList = (ArrayList<String>) br.readObject();
            for (String aStr : arrayList) {
                System.out.println(aStr);
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
