package Revisions.ExamRevision.RevisionPart2;

import java.util.*;
class Person {
	String name;
	int age;
	String gender;
	String address;
	
	public Person() {	
		name = "Unknown";
		age = 0;
		gender = "Unknown";
		address = "Unknown";
	}
	
	public Person(String name, int age, String gender, String address) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
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

	public String getAddress() {
		return address;
	}
}


class AddressBook {	
	
	public AddressBook() {
	}

	ArrayList<Person> arrayPerson = new ArrayList<Person>();
	
	public void add() {		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name : ");
		String name = input.nextLine();
		System.out.print("Enter age : ");
		int age = input.nextInt();
		
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter gender : ");
		String gender = input1.nextLine();
		System.out.print("Enter address : ");
		String address = input1.nextLine();
		
		Person person = new Person(name, age, gender, address);
		arrayPerson.add(person);		
	}

	public void display() {
		for (int i = 0; i < arrayPerson.size(); i++) {
			System.out.println(arrayPerson.get(i).getName() + " is a " + arrayPerson.get(i).getGender() + " of " + arrayPerson.get(i).getAge() + " years old and live in " + arrayPerson.get(i).getAddress());
		}
	}

	public void search() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name to search : ");
		String searchName = input.nextLine();	
		int searchCount = 0;
		for (int i = 0; i < arrayPerson.size(); i++) {	
			if (arrayPerson.get(i).getName().equalsIgnoreCase(searchName)) {
			System.out.println(arrayPerson.get(i).getName() + " is a " + arrayPerson.get(i).getGender() + " of " + arrayPerson.get(i).getAge() + " years old and live in " + arrayPerson.get(i).getAddress());
			} else searchCount++;
		}
		if (searchCount == arrayPerson.size()) System.out.println("Not Found!");
	}
}

public class Revision2_No1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AddressBook addressBook = new AddressBook();
		System.out.print("Enter the number of person : ");
		int num = input.nextInt();
		if (num == 0) num = 3;
		for (int i = 0; i < num; i++) {	
			addressBook.add();
		}
		
		addressBook.display();
		addressBook.search();
	}
}
