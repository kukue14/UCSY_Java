package Revisions.SpecialProblems.MixingCh12_Ch9.TransposeWords;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TransposeWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = input.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(str);

        while (stringTokenizer.hasMoreTokens()) {
            StringBuffer stringBuffer = new StringBuffer(stringTokenizer.nextToken());
            System.out.print(String.valueOf(stringBuffer.reverse()).trim() + " ");
        }
    }
}
