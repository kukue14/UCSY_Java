package Revisions.Chapter12.ByteStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByterWrite {
    public static void main(String[] args) {
        byte[] bytes = {1,2,3,5,5,45,3};
        try {
            File fobj = new File("byteStream.txt");
            FileOutputStream fo = new FileOutputStream(fobj);
            fo.write(bytes);
            fo.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
