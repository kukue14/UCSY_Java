package Exercises.Chapter_12;

import java.io.File;

public class SampleFile {
    public static void main(String[] args) {
        File myfile = new File("SampleFile.txt");
        System.out.println("File: " + myfile.getName() + (myfile.isFile() ? " is a file" : " is a named pipe"));
        System.out.println("Size: " + myfile.length());
        System.out.println("Path: " + myfile.getPath());
        System.out.println("Absolute Path: " + myfile.getAbsolutePath());
        System.out.println("File was last modified: " + myfile.lastModified());
        System.out.println(myfile.exists() ? "File exists" : "File does not exist");
        System.out.println(myfile.canRead() ? "File can be read from" :  "File cannot be read from");
        System.out.println(myfile.isDirectory() ? "File is a directory" : "File is not a directory");
    }
}
