package Revisions.Chapter9.SecondTime;

import java.util.Scanner;
import java.util.StringTokenizer;

public class No_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           while (true) {
               System.out.print("Enter a String : ");
               String str = input.nextLine();
               if (str.isEmpty()) break;
               StringTokenizer strToken = new StringTokenizer(str);
               while (strToken.hasMoreTokens()) {
                   StringBuffer strBuff = new StringBuffer(strToken.nextToken());
                   System.out.print(strBuff.reverse() + " ");
               }
               System.out.println();
           }
    }
}
