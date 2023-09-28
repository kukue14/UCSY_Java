package Others;

import java.util.Scanner;

public class No_28_DivisionWord {
    public static void main(String[] args) {
        String word;
        int wordLength;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word : ");
        word = input.next();
        wordLength = word.length();
        System.out.println(
                "The middle character of " + word + " is " + word.substring(wordLength / 2, (wordLength / 2) + 1));
    }

}
