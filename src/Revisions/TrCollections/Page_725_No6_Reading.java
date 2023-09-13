package Revisions.TrCollections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;

public class Page_725_No6_Reading {
    public static void main(String[] args) {
        try {
            File fobj = new File("C:\\Users\\hp\\Desktop\\ \\Ku_Kue\\CS-202\\UCSY_Java\\src\\Revisions\\TrCollections\\filename.txt");
            FileReader fileReader = new FileReader(fobj);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str;
            while (true) {
                if ((str = bufferedReader.readLine()) == null) break;
                System.out.println(str);
            }
            bufferedReader.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
