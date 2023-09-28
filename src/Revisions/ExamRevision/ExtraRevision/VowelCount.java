package Revisions.ExamRevision.ExtraRevision;

import java.util.*;

public class VowelCount {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = input.nextLine();
		int aCount, eCount, iCount, oCount, uCount;
		aCount = eCount = iCount = oCount = uCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'A') aCount++;
			if (str.charAt(i) == 'e' || str.charAt(i) == 'E') eCount++;
			if (str.charAt(i) == 'i' || str.charAt(i) == 'I') iCount++;
			if (str.charAt(i) == 'o' || str.charAt(i) == 'O') oCount++;
			if (str.charAt(i) == 'u' || str.charAt(i) == 'U') uCount++;
		}
		System.out.println("The number of 'a' : " + aCount);
		System.out.println("The number of 'e' : " + eCount);
		System.out.println("The number of 'i' : " + iCount);
		System.out.println("The number of 'o' : " + oCount);
		System.out.println("The number of 'u' : " + uCount);
	}
}