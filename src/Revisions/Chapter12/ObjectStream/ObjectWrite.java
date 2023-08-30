package Revisions.Chapter12.ObjectStream;

import Exercises.Chapter_10.Person;

import java.io.*;

public class ObjectWrite {
    public static void main(String[] args) {
        try {
            File fobj = new File("objectStream.txt");
            FileOutputStream fo = new FileOutputStream(fobj);
            ObjectOutputStream objOutput = new ObjectOutputStream(fo);
            Person person = new Person("Ku Kue",  19, 'm');
            objOutput.writeObject(person);
            objOutput.close();
            System.out.println(person.getName() + person.getAge() + person.getGender());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
