package Chapter_9;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        while (true) {
            System.out.print("\nEnter a line : ");
            str = input.nextLine();
            if(str.length()==0) break;
            StringTokenizer tok = new StringTokenizer(str);
            while (tok.hasMoreTokens()) {
                String one_word = tok.nextToken();
                StringBuffer strBuffer = new StringBuffer(one_word);
                strBuffer.reverse();
                System.out.print(strBuffer + " ");
            }

        }
    }
}
