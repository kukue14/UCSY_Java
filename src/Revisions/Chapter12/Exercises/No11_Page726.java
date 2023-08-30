package Revisions.Chapter12.Exercises;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class No11_Page726 {
    public static void main(String[] args) {
        try {
            File fobj = new File("integers.dat");
            FileInputStream fInput = new FileInputStream(fobj);
            byte[] bytes = new byte[(int)fobj.length()];
            fInput.read(bytes);
            for (int i = 0; i < fobj.length(); i++) {
                System.out.println(bytes[i]);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
