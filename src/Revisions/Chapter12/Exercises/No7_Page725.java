package Revisions.Chapter12.Exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class No7_Page725 {
    public static void main(String[] args) {
        try {
            File fobj = new File("no6_page725.txt");
            FileReader fr = new FileReader(fobj);
            BufferedReader br = new BufferedReader(fr);
            String str;
            String shortestWord = null, longestWord = null;
            double min = 0, max = 0 , avg = 0;
            int index = 0;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
                if (index == 0) min = str.length();
                if(min > str.length()) {
                    min = str.length();
                    shortestWord = str;
                }

                if(max < str.length()) {
                    max = str.length();
                    longestWord = str;
                }

                avg += str.length();
                index++;
            }
            br.close();
            System.out.println("The longest word : " + longestWord);
            System.out.println("The shortest word : " + shortestWord);
            System.out.println("Average : " + avg/index);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
