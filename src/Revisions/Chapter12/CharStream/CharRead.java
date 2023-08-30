package Revisions.Chapter12.CharStream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CharRead {
    public static void main(String[] args) {
        try {
            File fobj = new File("charStream.txt");
            FileReader fr = new FileReader(fobj);
            char[] character = new char[(int)fobj.length()];
            fr.read(character);
            fr.close();
            for (char aChar : character) {
                System.out.print(aChar);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
