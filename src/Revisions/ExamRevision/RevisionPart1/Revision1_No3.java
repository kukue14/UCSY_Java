package Revisions.ExamRevision.RevisionPart1;

import java.util.*;

public class Revision1_No3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a number to get factorial : ");
			int num = input.nextInt();
			if (num == -1) break;
			int factNum = 1;
			for (int i = 1; i <= num; i++) {
				factNum *= i;
			}
			System.out.println("The factorial number of " + num + " is " + factNum);
		}
	}
}