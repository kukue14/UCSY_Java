package Revisions.ExamRevision.ExtraRevision;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PattenAndMatcher {
    public static void main(String[] args) {
        final String STOP = "STOP";
        final String VALID_PATTERN = "[a-zA-Z]{6,}[0-9#@!$]";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password : ");
        String password = input.nextLine();
        Pattern pattern = Pattern.compile(VALID_PATTERN);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) System.out.println("Valid");
        else System.out.println("Invalid");
    }
}
