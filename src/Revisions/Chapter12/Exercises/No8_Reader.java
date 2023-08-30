package Revisions.Chapter12.Exercises;

import com.sun.source.tree.IfTree;

import java.io.*;
import java.util.ArrayList;

public class No8_Reader {
//    public static void main(String[] args) {
//        try {
//            File fobj = new File("no6_page725.txt");
//            FileInputStream finput = new FileInputStream(fobj);
//            ObjectInputStream objInput = new ObjectInputStream(finput);
//            ArrayList<String> arrayStr = new ArrayList<String>();
//            arrayStr = (ArrayList<String>) objInput.readObject();
//            for (String aStr : arrayStr) {
//                System.out.println(aStr);
//            }
//            System.out.println(arrayStr);
//            objInput.close();
//        }catch (IOException e) {
//            System.out.println(e.getMessage());
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public static void main(String[] args) {
        try {
            File fobj = new File("no6_page725.txt");
            FileInputStream fin = new FileInputStream(fobj);
            ObjectInputStream objInput = new ObjectInputStream(fin);
            ArrayList<String> arrayStr = new ArrayList<String>();
            arrayStr = (ArrayList<String>) objInput.readObject();
            for (String aStr : arrayStr) {
                System.out.println(aStr);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
