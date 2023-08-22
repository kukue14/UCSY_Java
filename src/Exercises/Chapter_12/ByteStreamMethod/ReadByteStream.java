package Exercises.Chapter_12.ByteStreamMethod;

import Exercises.Chapter_12.SampleFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadByteStream {
    public static void main(String[] args) {
        File file = new File("SampleFile.txt");
        try {
            FileInputStream in = new FileInputStream(file);
            byte[] data = new byte[(int)file.length()];
            in.read(data);
            in.close();
            for (int i : data) System.out.println(i);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
