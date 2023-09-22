package Revisions.Chapter14.ExamRevisions.Part2;

import java.util.*;


public class Person {
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
    ArrayList<Person> arrayPerson = new ArrayList<Person>();

    public void add() {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter the person name : ");
        String name = input1.nextLine();
        System.out.print("Enter the person age : ");
        int age = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the person gender : ");
        String gender = input2.next();

        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter the person address : ");
        String address = input3.nextLine();
        Person person = new Person(name, age, gender, address);
        arrayPerson.add(person);
    }

    public void display() {
        for (Person aPerson : arrayPerson) {
            System.out.print(aPerson.getName() + " is " + aPerson.getAge() + " years old and is " + aPerson.getGender() + " and live in " + aPerson.getAddress());
        }
    }

    public void search() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the name to search : ");
        String name = input.nextLine();
        int search = 0;
        for (int i = 0; i < arrayPerson.size(); i++) {
            Person index = arrayPerson.get(i);
            if (name.equals(index.getName())) {
                System.out.print(index.getName() + " is " + index.getAge() + " years old and is " + index.getGender() + " and live in " + index.getAddress());
                search++;
            }
        }
        if (search == 0) System.out.println("Not Found!");
    }

}

class UserName {
    public static void main(String[] args) {
        AddressBook adBook = new AddressBook();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the quantity of person : ");
        int quantity = input.nextInt();
        if (quantity == 0) quantity = 3;
        for (int i = 0; i < quantity; i++) {
            adBook.add();
        }
        adBook.display();
        adBook.search();
    }
}