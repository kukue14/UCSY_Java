package Revisions.Chapter12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerIO {
    public static void main(String[] args) {
        try {
            File file = new File("stringStream.txt");
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                System.out.println(input.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



    }
}
