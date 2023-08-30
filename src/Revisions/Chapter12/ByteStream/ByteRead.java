package Revisions.Chapter12.ByteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteRead {
    public static void main(String[] args) {
        try {
            File fobj = new File("byteStream.txt");
            FileInputStream fi = new FileInputStream(fobj);
            byte[] bytes = new byte[(int)fobj.length()];
            fi.read(bytes);
            for (byte aByte : bytes) {
                System.out.println(aByte);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
