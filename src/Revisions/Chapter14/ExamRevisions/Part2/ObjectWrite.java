package Revisions.Chapter14.ExamRevisions.Part2;

import java.util.*;
import java.io.*;
	


public class ObjectWrite {
	public static void main(String[] args) {
		try {

			ArrayList<Person1> arrayPerson = new ArrayList<Person1>();

			String name, gender;
			int age;

			File fobj = new File("object.txt");
			FileOutputStream fOut = new FileOutputStream(fobj);
			ObjectOutputStream objOut = new ObjectOutputStream(fOut);

			Scanner input = new Scanner(System.in);
			System.out.print("Enter the quantity of person : ");
			int quantity = input.nextInt();

			for(int i = 0; i < quantity; i++) {
				Scanner input1 = new Scanner(System.in);
				System.out.print("Enter the person name : ");
				name = input1.nextLine();

				Scanner input2 = new Scanner(System.in);
				System.out.print("Enter the person gender : ");
				gender = input2.next();
				System.out.print("Enter the person age : ");
				age = input2.nextInt();
				Person1 person1 = new Person1(name, gender, age);
				arrayPerson.add(person1);
			}

			objOut.writeObject(arrayPerson);
			objOut.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

class Person1 implements Serializable{
	private String name;
	private String gender;
	private int age;

	Person1 (String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

}



