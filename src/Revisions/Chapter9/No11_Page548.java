package Revisions.Chapter9;

import java.util.Scanner;

public class No11_Page548 {
    public static void main(String[] args) {
        String str;
        int aCount, eCount, iCount, oCount, uCount;
        aCount = eCount = iCount = oCount = uCount = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        str = input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') aCount++;
            if (str.charAt(i) == 'e') eCount++;
            if (str.charAt(i) == 'i') iCount++;
            if (str.charAt(i) == 'u') uCount++;
            if (str.charAt(i) == 'o') oCount++;
        }
        System.out.println("Vowel counts for the sentence\n" + str);
        System.out.println("# of 'a' : " + aCount);
        System.out.println("# of 'e' : " + eCount);
        System.out.println("# of 'i' : " + iCount);
        System.out.println("# of 'o' : " + oCount);
        System.out.println("# of 'u' : " + uCount);
    }
}
