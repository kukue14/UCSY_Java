package Exercises.Chapter_12.CharStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCharStream {
    public static void main(String[] args) {
        File file = new File("SampleFile.txt");
        char[] character = {'a','r','w','q'};

        try {
            FileWriter writer = new FileWriter(file);
            writer.write(character);
            writer.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
