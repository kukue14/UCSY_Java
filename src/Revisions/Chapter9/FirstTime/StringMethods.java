package Revisions.Chapter9.FirstTime;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hi, How are you? I'm studying Java Programming. And You?";
        String str1 ="";
        String str2 = "University of Computer Studies, Yangon";

        System.out.println(str.charAt(10));
        System.out.println(str.length());
        System.out.println(str.substring(10));
        System.out.println(str.substring(10, 15));
        System.out.println(str.contains("are"));
        System.out.println(str.contains("z"));
//        System.out.println("boolean");
        System.out.println(str1.isBlank());
        System.out.println(str1.isEmpty());
        System.out.println(str.concat(" I'm trying to understand."));
        System.out.println(str.replace('o', 'x'));
        System.out.println(str.replace("you", "u"));

        System.out.println(str.replaceAll("a", "x"));
        System.out.println(str2);
        System.out.println(str2.replaceAll("Computer(.*)", "Computer University"));

        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('a', 15));
        System.out.println(str.indexOf("you"));
        System.out.println(str.indexOf("You"));
        System.out.println(str.indexOf("You", 5));

        System.out.println(str.lastIndexOf("You"));
        System.out.println(str.lastIndexOf("a"));

        System.out.println(str.trim()); // Start space are deleted.

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        System.out.println(String.valueOf(99).length());

        System.out.println(str.startsWith("H"));
        System.out.println(str.startsWith("h"));
        System.out.println(str.endsWith("You"));
        System.out.println(str.endsWith("You?"));

        System.out.println((int) str.charAt(0));
//        System.out.println((int) str1.charAt(0));
        System.out.println((int) str2.charAt(0));

        System.out.println(str.compareTo(str)); // If equal, output is 0.
        System.out.println(str.compareTo(str1)); // If first String is larger than last String, output is positive.
        System.out.println(str.compareTo(str2)); // If first String is smaller than last String, output is negative.

        String text4 = "AABBCAAADEEAA";
        Pattern pattern = Pattern.compile("AA");
        Matcher matcher = pattern.matcher(text4);
        while (matcher.find()) {
            System.out.println("Found at " + matcher.start() + " _ " + matcher.end());
        }
    }
}
