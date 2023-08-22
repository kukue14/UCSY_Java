package Exercises.Chapter_12;

import java.io.File;

public class FilesInFolder {
    public static void main(String[] args) {
        File folderName = new File("C:\\Users\\hp\\Desktop\\ \\Ku_Kue\\CS-202\\UCSY_Java\\src\\Exercises\\Chapter_10");
        String[] result = folderName.list();
        for (String name : result) System.out.println(name);
    }
}
