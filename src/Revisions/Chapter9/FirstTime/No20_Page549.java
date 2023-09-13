package Revisions.Chapter9.FirstTime;

import java.util.Scanner;
import java.util.StringTokenizer;

public class No20_Page549 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = input.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        while (stringTokenizer.hasMoreTokens()) {
            StringBuffer stringBuffer = new StringBuffer(stringTokenizer.nextToken());
            System.out.print(stringBuffer.reverse() + " ");
        }
    }
}
