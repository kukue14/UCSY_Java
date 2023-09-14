package Revisions.ObjectArrayList;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UserClass implements Serializable {
    public static void main(String[] args) {
        double salary;
        String personId;
        String personName;
        PersonMethods personMethods = new PersonMethods();
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter the quantity of person : ");
        int quantity = input.nextInt();
        for (int i = 0; i < quantity; i++) {
            try {
                ArrayList<Person> person = new ArrayList<Person>();
                person.add(personMethods.add());
                File fobj = new File("D:\\University Of Computer Studies, Yangon\\CS-202\\UCSY_Java\\src\\Revisions\\TrCollections\\ObjectArrayList\\personData.ser");
                FileOutputStream fileOutputStream = new FileOutputStream(fobj);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(person);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        personMethods.display();


    }
}
