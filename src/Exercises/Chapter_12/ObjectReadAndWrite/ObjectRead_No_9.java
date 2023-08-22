package Exercises.Chapter_12.ObjectReadAndWrite;

import java.io.*;
import java.util.ArrayList;

public class ObjectRead_No_9 {
    public static void main(String[] args) {
        try {
            File fobj = new File("six.txt");
            FileInputStream finputStr = new FileInputStream(fobj);
            ObjectInputStream objStr = new ObjectInputStream(finputStr);
            ArrayList<String> arrayStr = new ArrayList<String>();
            arrayStr = (ArrayList<String>) objStr.readObject();
            String minWord= null, maxWord= null;
            double min = arrayStr.get(0).length(), max = 0, avg = 0;
            for (String aStr : arrayStr) {
                System.out.println(aStr);
                if(min > aStr.length()) {
                    minWord = aStr;
                    min = aStr.length();
                }

                if (max < aStr.length()){
                    maxWord = aStr;
                    max = aStr.length();
                }
                avg += aStr.length();
            }
            objStr.close();
            System.out.println("The longest word is " + maxWord + " in the length of " + max);
            System.out.println("The shortest word is " + minWord + " in the length of " + min);
            System.out.println("The average is " + avg/arrayStr.size());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
