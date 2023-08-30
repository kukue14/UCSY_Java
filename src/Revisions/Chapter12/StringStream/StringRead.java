package Revisions.Chapter12.StringStream;

import java.io.*;
import java.nio.Buffer;
import java.nio.BufferOverflowException;

public class StringRead {
    public static void main(String[] args) {
        try {
            File fobj = new File("stringStream.txt");
            FileReader fileIn = new FileReader(fobj);
            BufferedReader br = new BufferedReader(fileIn);
            String str;
            while ((str=br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
