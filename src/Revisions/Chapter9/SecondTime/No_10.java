package Revisions.Chapter9.SecondTime;

import java.util.Scanner;

public class No_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a String : ");
            String str = input.nextLine();
            if (str.isEmpty()) break;
            StringBuffer strBuff = new StringBuffer(str);
            System.out.println(strBuff.reverse());
        }
    }
}
