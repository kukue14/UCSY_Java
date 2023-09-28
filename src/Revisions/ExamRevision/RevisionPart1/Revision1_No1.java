package Revisions.ExamRevision.RevisionPart1;

import java.util.*;

public class Revision1_No1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("Enter the String : ");
			String str = input.nextLine();
			if (str.isEmpty()) break;
			StringTokenizer strToken = new StringTokenizer(str);
			while(strToken.hasMoreTokens()) {
				StringBuffer strBuff = new StringBuffer(strToken.nextToken());
				System.out.print(strBuff.reverse() + " ");
			}
		}
	}
}