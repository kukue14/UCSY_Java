package Revisions.ExamRevision.RevisionPart2;

public class Revision2_No4 {
	public static void main(String[] args) {
		double[][] payScale = { {10.50, 12.00, 14.50, 16.75, 18.00},
					{20.50, 22.25, 24.00, 26.25, 28.00},
					{34.00, 36.50, 38.00, 40.35, 43.00},
					{50.00, 60.00, 70.00, 80.00, 99.99} };

		int[] gradeAvg = new int[payScale.length];
		int[] stepAvg = new int[payScale[1].length];
		int gradeTotal = 0;

		for (int row = 0; row < payScale.length; row++) {
			for (int col = 0; col < payScale[row].length; col++) {
				gradeTotal += payScale[row][col];
			}
			gradeAvg[row] = gradeTotal/payScale[col].length;
		}
		for (int i = 0; i < payScale.length; i++) System.out.println("The average of each grade level are : " + gradeAvg[i]);

		for (int col = 0; col < payScale[1].length; col++) {
			for (int row = 0; row < payScale.length; row++) {
				gradeTotal += payScale[row][col];
			}
			stepAvg[col] = gradeTotal/payScale.length;
		}
		for (int i = 0; i < payScale[1].length; i++) System.out.println("The average of each step level are : " + stepAvg[i]);
	}
}