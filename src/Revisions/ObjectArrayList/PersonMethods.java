package Revisions.ObjectArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMethods {
    ArrayList<Person> arrayPerson = new ArrayList<Person>();

    public Person add() {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        System.out.print("Enter the person ID : ");
        String personId = input.next();
        System.out.print("Enter the person Name : ");
        String personName = input1.nextLine();
        System.out.print("Enter the salary : ");
        double salary = input1.nextDouble();
        Person person1 = new Person(personId, personName, salary);
        arrayPerson.add(person1);
    return person1;
    }

    public void display() {
        for (Person aPerson : arrayPerson) {
            System.out.println("The person ID : " + aPerson.getPersonId());
            System.out.println("The person Name : " + aPerson.getPersonName());
            System.out.println("The salary : " + aPerson.getSalary());
        }
    }
}
