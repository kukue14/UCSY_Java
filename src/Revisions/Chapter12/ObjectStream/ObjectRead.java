package Revisions.Chapter12.ObjectStream;

import Exercises.Chapter_10.Person;

import java.io.*;

public class ObjectRead {
    public static void main(String[] args) {
        try {
            File fobj = new File("objectStream.txt");
            FileInputStream fin = new FileInputStream(fobj);
            ObjectInputStream objInput = new ObjectInputStream(fin);
            Person p = (Person) objInput.readObject();
            System.out.println(p.getName() + " " + p.getAge() + " " + p.getGender());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
