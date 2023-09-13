package Revisions.TrCollections.BookAddress;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Person> arrayPerson = new ArrayList<Person>();
    void add() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name, age, address : ");
        String name = input.nextLine();
        String address = input.nextLine();
        int age = input.nextInt();
        Person person = new Person(name, age, address);
        arrayPerson.add(person);
    }
    void display() {
        if (arrayPerson.isEmpty()) System.out.println("Error 404 Not Found");
        for (Person aPerson : arrayPerson) {
            System.out.println(aPerson.getName() + " is " + aPerson.getAge() + " years old and live in " + aPerson.getAddress());
        }
    }
    void search() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name you want to search : ");
        String name = input.nextLine();

//        for (Person aPerson : arrayPerson) {
//            if (name.equalsIgnoreCase(aPerson.getName())) {
//                System.out.println(aPerson.getName() + " is " + aPerson.getAge() + " years old and live in " + aPerson.getAddress());
//                break;
//            }
//        }
        int i;
        for (i = 0; i < arrayPerson.size(); i++) {
            if (name.equalsIgnoreCase(arrayPerson.get(i).getName())) {
                System.out.println(arrayPerson.get(i).getName() + " is " + arrayPerson.get(i).getAge() + " years old and live in " + arrayPerson.get(i).getAddress());
                break;
            }
        }
        if (i == arrayPerson.size()) System.out.println("Not Found!");
    }
}
