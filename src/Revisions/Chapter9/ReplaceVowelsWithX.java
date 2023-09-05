package Revisions.Chapter9;

import java.util.Scanner;

public class ReplaceVowelsWithX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = input.nextLine();

//        Traditional
//        for (int i = 0; i < str.length(); i++) {
//            if (
//                    str.charAt(i) == 'a' || str.charAt(i) == 'A' ||
//                    str.charAt(i) == 'e' || str.charAt(i) == 'B' ||
//                    str.charAt(i) == 'i' || str.charAt(i) == 'I' ||
//                    str.charAt(i) == 'u' || str.charAt(i) == 'U' ||
//                    str.charAt(i) == 'o' || str.charAt(i) == 'O'
//            ) {
//                str = str.replace(str.charAt(i), 'X');
//            }
//        }
//        System.out.print("After replaced : " + str);

        final String VALID_PATTERN = "[aeiouAEIOU]";
        if (str.matches(VALID_PATTERN)) {
            str = str.replaceAll(VALID_PATTERN,"X");
        }
        System.out.println(str);
    }
}
