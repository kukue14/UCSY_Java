package Revisions.ExamRevision.RevisionPart1;

import java.util.*;

public class Revision1_No2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a word : ");
			String word = input.next();
			if (word.isEmpty()) break;
			StringBuffer strBuff = new StringBuffer(word);
			String reverse = String.valueOf(strBuff.reverse());
			if (word.equalsIgnoreCase(reverse)) System.out.println(word + " is Palindrome.");
			else System.out.println(word + " is not Palindrome.");
		}
	}
}