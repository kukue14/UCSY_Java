package Revisions.Chapter14.ExamRevisions.Part2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectRead {
    public static void main(String[] args) {
        try {
            File fobj2 = new File("object.txt");
            FileInputStream fIn = new FileInputStream(fobj2);
            ObjectInputStream objIn = new ObjectInputStream(fIn);
            ArrayList<Person1> arrayPerson2 = new ArrayList<Person1>();
            arrayPerson2 = (ArrayList<Person1>)  objIn.readObject();
            objIn.close();

            String oldestName = "", youngestName = "";
            int oldestAge = 0, youngestAge = 0;
            int index = 0;
            for (Person1 aPerson : arrayPerson2) {
                int personAge = aPerson.getAge();
                String personName = aPerson.getName();

                if (index == 0) youngestAge = personAge;
                if (youngestAge >= personAge) {
                    youngestAge = personAge;
                    youngestName = personName;
                }

                if (oldestAge <= personAge) {
                    oldestAge = personAge;
                    oldestName = personName;
                }
                index++;
            }
            System.out.println("The youngest person is " + youngestName + " and is " + youngestAge + " years old.");
            System.out.println("The youngest person is " + oldestName + " and is " + oldestAge + " years old.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
