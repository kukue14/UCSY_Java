package Exercises.Chapter_12.StringReadAndWrite;

import java.io.*;

public class StringRead_No_7 {
    public static void main(String[] args) {
        try {
            File fobj = new File("six.txt");
            FileReader fr = new FileReader(fobj);
            BufferedReader br = new BufferedReader(fr);
            String str;
            String minWord = null, maxWord = null;
            double min = 0, max = 0, avg = 0;
            int index = 0;
            while (true) {
                str = br.readLine();
                if (str==null) break;
                System.out.println(str);
                if (index == 0) min = str.length();

                if (min > str.length()) {
                    minWord = str;
                    min = str.length();
                } else
                if (max < str.length()) {
                    maxWord = str;
                    max = str.length();
                }
                avg += str.length();
                index++;
            }
            br.close();
            System.out.println("The longest word is " + maxWord + " in the length of " + max);
            System.out.println("The shortest word is " + minWord + " in the length of " + min);
            System.out.println("The average of length : " + avg/index);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
