package Revisions.ObjectArrayList;

import java.io.*;
import java.util.ArrayList;

public class UserClassRead {
    public static void main(String[] args) {
        try {
            File fobj = new File("D:\\University Of Computer Studies, Yangon\\CS-202\\UCSY_Java\\src\\Revisions\\TrCollections\\ObjectArrayList\\personData.txt");
            FileInputStream fileInputStream = new FileInputStream(fobj);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<Person> arrayPerson = new ArrayList<Person>();
            arrayPerson.add((Person) objectInputStream.readObject());
            for (Person aPerson : arrayPerson) {
                System.out.println(aPerson);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
