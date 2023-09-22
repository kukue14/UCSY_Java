package Revisions.Chapter14.ExamRevisions.Part2;

public class PayScale {
	public static void main(String[] args) {
		double[][] payScale = { {10.50, 12.00, 14.50, 16.75, 18.00},
					{20.50, 22.25, 24.00, 26.25, 28.00},	
					{34.00, 36.50, 38.00, 40.35, 43.00},
					{50.00, 60.00, 70.00, 80.00, 99.99} };
		
		double[] avgGrade = new double[payScale.length];

		for (int row = 0; row < payScale.length; row++) {
			for (int col = 0; col < payScale[row].length; col++) {
				avgGrade[row] += payScale[row][col];
			}
			avgGrade[row] = avgGrade[row] / payScale.length;
		}

		for (int i = 0; i < payScale.length; i++) {
			System.out.println("The average of grade on " + (i + 1) + " is " + avgGrade[i]);
		}

		double[] avgPay = new double[payScale[1].length];

		for (int col = 0; col < payScale[1].length; col++) {
			for (int row = 0; row < payScale.length; row++) {
				avgPay[col] += payScale[row][col];
			}
			avgPay[col] = avgPay[col] / payScale.length;
		}

		for (int i = 0; i < payScale[1].length; i++) {
			System.out.println("The average of pay on " + (i + 1) + " is " + avgPay[i]);
		}
	}
}