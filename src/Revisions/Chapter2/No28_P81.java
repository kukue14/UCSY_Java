package Revisions.Chapter2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class No28_P81 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String str = input.next();
        System.out.println("The middle alphabet of " + str + " is " + str.substring(str.length()/2,str.length()/2+1));
    }
}
