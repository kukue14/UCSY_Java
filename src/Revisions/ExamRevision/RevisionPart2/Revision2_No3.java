package Revisions.ExamRevision.RevisionPart2;

import java.util.*;
import java.io.*;

class Person1 implements Serializable{
	String name;
	int age;
	String gender;
	
	public Person1() {
		name = "Unknonw";
		age = 0;
		gender = "Unknown";
	}
		
	public Person1(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {	
		return age;
	}

	public String getGender() {
		return gender;
	}
}

public class Revision2_No3 {
	public static void main(String[] args) {
		ArrayList<Person1> arrayPerson1 = new ArrayList<Person1>();
		
		try {
			File fobj = new File("Revision2_No3.txt");
			FileOutputStream fOutStream = new FileOutputStream(fobj);
			ObjectOutputStream objOutStream = new ObjectOutputStream(fOutStream);
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the number of people : ");
			int num = input.nextInt();
			if (num == 0) num = 3;
			for(int i = 0; i < num; i++) {
				Scanner input1 = new Scanner(System.in);
				System.out.print("Enter name : ");
				String name = input1.nextLine();
				System.out.print("Enter age : ");
				int age = input1.nextInt();
				Scanner input2 = new Scanner(System.in);
				System.out.print("Enter gender : ");
				String gender = input2.next();
				Person1 person1 = new Person1(name, age, gender);
				arrayPerson1.add(person1);
			}
			objOutStream.writeObject(arrayPerson1);
			objOutStream.close();

			FileInputStream fInStream = new FileInputStream(fobj);
			ObjectInputStream objInStream = new ObjectInputStream(fInStream);
			ArrayList<Person1> readArray = new ArrayList<Person1>();
			readArray = (ArrayList<Person1>) objInStream.readObject();
			int youngest, oldest;
			youngest = oldest = 0;
			String youngestPerson, oldestPerson, gender1, gender2;
			youngestPerson = oldestPerson = gender1 = gender2 = "";
 			int index = 0;
			for (Person1 aPerson : readArray) {
				int readAge = aPerson.getAge();
				String readName = aPerson.getName();
				String readGender = aPerson.getGender();

				if (index == 0) youngest = readAge;
				if (youngest >= readAge) {
					youngest = readAge;
					youngestPerson = readName;
					gender1 = readGender;
				}

				if (oldest < readAge) {
					oldest = readAge;
					oldestPerson = readName;
					gender2 = readGender;
				}
				index++;
			}
			objInStream.close();
			System.out.println("The youngest person is " + youngestPerson + " and is " + gender1 + " and is " + youngest + " years old.");
			System.out.println("The oldest person is " + oldestPerson + " and is " + gender2 + " and is " + oldest + " years old.");

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}
