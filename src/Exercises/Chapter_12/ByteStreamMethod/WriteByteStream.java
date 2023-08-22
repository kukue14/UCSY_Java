package Exercises.Chapter_12.ByteStreamMethod;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteByteStream {
    public static void main(String[] args) {
        File file = new File("SampleFile.txt");
        byte[] byteNum = {10,20,30,40,50};

        try {
            FileOutputStream out = new FileOutputStream(file);
            out.write(byteNum);
            out.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
