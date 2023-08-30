package Revisions.Chapter12.CharStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharWrite {
    public static void main(String[] args) {
        char[] character = {'W', 'e', 'l', 'c', 'o', 'm', 'e'};
        try {
            File fobj = new File("charStream.txt");
            FileWriter fw = new FileWriter(fobj);
            fw.write(character);
            System.out.println(character);
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
