package Revisions.Chapter14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class GUI_Testing2Reader {
    public static void main(String[] args) {
        GUI_Testing2 testing2 = new GUI_Testing2();
        System.out.println(testing2.fileBox.getText());
        try {
            File fobj = new File(testing2.fileBox.getText() + ".txt");
            FileInputStream fileInputStream = new FileInputStream(fobj);
            byte[] byteArray = new byte[(int) fobj.length()];
            fileInputStream.read(byteArray);
            for (byte aByte : byteArray) {
                System.out.println(aByte);
            }
            fileInputStream.close();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
