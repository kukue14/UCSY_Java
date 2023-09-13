package Revisions.TrCollections.ObjectArrayList;

import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Person {
    public double salary;
    public String personId;
    public String personName;
    Person() {
        this.personId = "Unknown";
        this.personName = "Unknown";
        this.salary = 0.0;
    }
    Person(String personName, String personId, double salary) {
        this.personId = personId;
        this.personName = personName;
        this.salary = salary;
    }

    public void display() {
        System.out.println("The person ID : " + personId);
        System.out.println("The person Name : " + personName);
        System.out.println("The salary : " + salary);
    }

    public static void main(String[] args) {
        double salary;
        String personId;
        String personName;
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter the person ID : ");
        personId = input.next();
        System.out.print("Enter the person Name : ");
        personName = input1.nextLine();
        System.out.print("Enter the salary : ");
        salary = input1.nextDouble();

        Person person = new Person(personName, personId, salary);

        ArrayList<Person> arrayPerson = new ArrayList<Person>();
        arrayPerson.add(person);
        try {
            File fobj = new File("");
            FileOutputStream fileOutputStream = new FileOutputStream(fobj);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(arrayPerson);
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
