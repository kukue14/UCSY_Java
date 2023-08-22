package Exercises.Chapter_8;

import java.util.Scanner;

public class Ex_11_VowelsCounts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence;
        int ca,ce,ci,co,cu;
        ca=ce=ci=co=cu =0;
        while (true) {
            System.out.print("Enter a sentence : ");
//        sentence = new StringBuffer(input.nextLine());
            sentence = input.nextLine();
            if (sentence.length()==0) break;
            for (int i = 0; i<sentence.length(); i++) {
                String character = sentence.charAt(i) + "";
                if(character.equalsIgnoreCase("A")) ca++;
                else if(character.equalsIgnoreCase("E")) ce++;
                else if(character.equalsIgnoreCase("I")) ci++;
                else if(character.equalsIgnoreCase("O")) co++;
                else if(character.equalsIgnoreCase("U")) cu++;
            }
            System.out.println("# of a : " + ca);
            System.out.println("# of e : " + ce);
            System.out.println("# of i : " + ci);
            System.out.println("# of o : " + co);
            System.out.println("# of u : " + cu);
        }
    }
}
