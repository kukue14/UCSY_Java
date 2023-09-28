package Revisions.SpecialProblems.String_Obj;

import java.io.*;
import java.util.ArrayList;

public class StringArrayListRead {
    public static void main(String[] args) {
        try {
            File fobj = new File("file.txt");
            FileInputStream fileInputStream = new FileInputStream(fobj);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList = (ArrayList<String>) objectInputStream.readObject();
            for (String aStr : arrayList) {
                System.out.println(aStr);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
