package Exercises.Chapter_8;

import java.util.Scanner;

public class ChangingCaseEachOther {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuffer sentence;
        while(true) {
            System.out.print("Enter a sentence : ");
            sentence = new StringBuffer(input.nextLine());
            if(sentence.length()==0) break;
            for(int i = 0; i<sentence.length(); i++) {
                if(Character.isLowerCase(sentence.charAt(i))) {
                    sentence.setCharAt(i, Character.toUpperCase(sentence.charAt(i)));
                } else {
                    sentence.setCharAt(i, Character.toLowerCase(sentence.charAt(i)));
                }
            }
            System.out.println("Changed Line : " + sentence);
        }
    }
}
