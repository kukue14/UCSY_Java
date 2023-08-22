package Exercises;

import java.util.Scanner;

public class Mark {
	public static void main(String[] args) {
		int mark1, mark2, mark3;
		int total;

		Scanner input = new Scanner(System.in);

		// Requesting marks
		System.out.print("Enter your mark 1 : ");
		mark1 = input.nextInt();
		System.out.print("Enter your mark 2 : ");
		mark2 = input.nextInt();
		System.out.print("Enter your mark 3 : ");
		mark3 = input.nextInt();

		// Calculation of total mark
		total = mark1 + mark2 + mark3;
		System.out.print("Your total mark is : " + total + " marks.");


	}
}
