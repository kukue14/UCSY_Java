package Exercises.Chapter_12.CharStream;

import java.io.*;

public class ReadCharStream {
    public static void main(String[] args) {
        File file = new File("SampleFile.txt");
        try {
            FileReader reader = new FileReader(file);
            char[] data = new char[(int)file.length()];
            reader.read(data);
            for (char i : data) System.out.println(i);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
