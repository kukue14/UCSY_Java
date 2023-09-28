package Revisions.ExamRevision.ExtraRevision;

import java.util.*;

public class Methods {
	public static boolean isAmstrong(int num) {
		int org = num;
		String countNum = String.valueOf(num);
		int amstrong = 0;
		while (num != 0) {
			int eachNum = num % 10;
			amstrong += (int) Math.pow(eachNum, countNum.length());
			num /= 10;
		}
		if (amstrong == org) return true;
		else return false;
	}

	public static boolean isPrime(int num) {
		int divisor = 2;
		while (divisor != num) {
			if (num % divisor == 0) break;
			else divisor++;
		}
		if (divisor == num) return true;
		else return false;
	}

	public static int reverseNum(int num) {
		int reverseNum = 0;
		while (num != 0) {
			int eachNum = num % 10;
			reverseNum = (reverseNum * 10) + eachNum;
			num /= 10;
		}
		return reverseNum;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {		
			System.out.print("Enter a number : ");
			int num = input.nextInt();
			if (num == 0) break;
			if (num < 10 || !isAmstrong(num)) System.out.println(num + " is not amstrong number.");
			else System.out.println(num + " is amstrong number.");
			if (isPrime(num)) System.out.println(num + " is prime number.");
			else System.out.println(num + " is not prime number.");
			System.out.println("The reverse of " + num + " is " + reverseNum(num));
		}
		
	}
}