package Revisions.Chapter9.SecondTime;

import java.util.Locale;
import java.util.Scanner;

public class No_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a Sring : ");
            String str = input.nextLine();
            if (str.isEmpty()) break;
            StringBuffer strBuff = new StringBuffer(str);
            for (int i = 0; i < str.length(); i++) {
                String lowecase = String.valueOf(strBuff.charAt(i)).toLowerCase();
                if (String.valueOf(strBuff.charAt(i)).equals(lowecase)) System.out.print(String.valueOf(strBuff.charAt(i)).toUpperCase());
                else System.out.print(String.valueOf(strBuff.charAt(i)).toLowerCase());
            }
            System.out.println();
        }
    }
}
