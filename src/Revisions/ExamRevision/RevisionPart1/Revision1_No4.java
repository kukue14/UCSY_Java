package Revisions.ExamRevision.RevisionPart1;

import java.util.*;

public class Revision1_No4 {
	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 1;
		int n3;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = input.nextInt();
		System.out.println("F1 = " + n1);
		System.out.println("F2 = " + n2);
		for (int i = 3; i <= num; i++) {
			n3 = n1 + n2;
			System.out.println("F" + (i) + " = F" + (i-1) + " + F" + (i-2) + " = " + n2 + " + " + n1 + " = " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
}