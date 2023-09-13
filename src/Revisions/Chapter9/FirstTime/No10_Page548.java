package Revisions.Chapter9.FirstTime;

import java.util.Scanner;

public class No10_Page548 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = input.nextLine();
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse());
    }
}
