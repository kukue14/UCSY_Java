package Revisions.Chapter9.SecondTime;

import java.util.Scanner;

public class No_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cA, cE, cI, cO, cU;
        cA = cE = cI = cO = cU = 0;
        while (true) {
            System.out.println("Vowel counts for the sentence\n");
            String str = input.nextLine();
            if (str.isEmpty()) break;
            StringBuffer strBuff = new StringBuffer(str);
            for (int i = 0; i < str.length(); i++) {
                if (strBuff.charAt(i) == 'a') cA++;
                if (strBuff.charAt(i) == 'e') cE++;
                if (strBuff.charAt(i) == 'i') cI++;
                if (strBuff.charAt(i) == 'o') cO++;
                if (strBuff.charAt(i) == 'u') cU++;
            }
            System.out.println( "# of 'a' : " + cA +
                                "\n# of 'e' : " + cE +
                                "\n# of 'i' : " + cI +
                                "\n# of 'o' : " + cO +
                                "\n# of 'u' : " + cU);
        }
    }
}
