package Exercise;

import java.util.Scanner;

public class inputoutputtest {
	public static void main(String[] args) {
		String name;
		byte age;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your name : ");
		name = input.nextLine();
		System.out.print("Enter your age : ");
		age = input.nextByte();
		System.out.println("Your name is " + name + " who is " + age + " years old.");

	}
}
