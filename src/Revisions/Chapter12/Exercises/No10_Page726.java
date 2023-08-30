package Revisions.Chapter12.Exercises;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class No10_Page726 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            File fobj = new File("integers.dat");
            FileOutputStream fOutput = new FileOutputStream(fobj);
            System.out.print("Enter the size of array : ");
            int size = input.nextInt();
            byte[] bytes = new byte[size];
            for (int i = 0; i < size; i++) {
                bytes[i] = (byte) ((int) (Math.random() * 100) + 1);
            }
            fOutput.write(bytes);
            fOutput.close();
            } catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
