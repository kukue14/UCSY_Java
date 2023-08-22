package Chapter_9;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        while (true) {
            System.out.print("Enter a String : ");
            str = input.nextLine();
            if (str.length() == 0) break;
            StringBuffer strBuffer = new StringBuffer(str);
            strBuffer.reverse();
            System.out.println("String reverse is : " + strBuffer.toString());
        }


    }
}
