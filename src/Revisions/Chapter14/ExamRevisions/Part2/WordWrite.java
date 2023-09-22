package Revisions.Chapter14.ExamRevisions.Part2;

import java.util.*;
import java.io.*;

public class WordWrite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            File fobj = new File("word.txt");
            FileWriter fWriter = new FileWriter(fobj);
            PrintWriter pWriter = new PrintWriter(fWriter);

            // Write
            while (true) {
                System.out.print("Enter a word : ");
                String word = input.next();
                if (word.equalsIgnoreCase("STOP")) break;
                pWriter.println(word);
            }
            pWriter.close();

            // Read
            File fobj2 = new File("word.txt");
            FileReader fReader = new FileReader(fobj2);
            BufferedReader bReader = new BufferedReader(fReader);

            String readWord;
            String longestWord = "", shortestWord = "";
            int longChar = 0, shortChar = 0;
            int index = 0;
            int total = 0;

            while (true) {
                readWord = bReader.readLine();
                if (readWord == null) break;
                if (index == 0) shortChar = readWord.length();

                if (shortChar >= readWord.length()) {
                    shortestWord = readWord;
                    shortChar = readWord.length();
                } else if (longChar < readWord.length()) {
                    longestWord = readWord;
                    longChar = readWord.length();
                }
                total += readWord.length();
                index++;
            }

            System.out.println("The longest word is : " + longestWord);
            System.out.println("The shortest word is : " + shortestWord);
            System.out.println("The average word length is : " + (total / index));


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}