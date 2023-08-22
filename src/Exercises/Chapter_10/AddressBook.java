package Exercises.Chapter_10;

public class AddressBook {
    private Person[] pA;
    private static final int defaultSize = 10;
    private int count = 0;

    AddressBook() {
        this(defaultSize);
    }

    AddressBook(int size) {
        pA = new Person[size];
    }

    void add(Person newPerson) {
        if (count == pA.length) System.out.println("Person " + count + " is added!");
        else {
            pA[count] = newPerson;
            count++;
        }
    }

    void delete(String name) {
        if (count == 0) System.out.println("Person Array is Empty!");
        else { int i;
            for (i = 0; i < count; i++) {
                if (pA[i].getName().equals(name)) {
                    pA[i] = null;
                    count--;
                    System.out.println("Successfully Delete!");
                    break;
                }
            }
            if(i==count) System.out.println("Name is not found!");
        }
    }

    Person search(String name) {
        Person result = null;
        if (count == 0) System.out.println("Person array is empty.");
        else {
            for (int i = 0; i < count; i++) {
                if (pA[i].getName().equals(name)) result = pA[i];
            }
        }
        return result;
    }

    Person[] search(int age) {
        Person result[] = new Person[count];
        int index = 0;
        if (count == 0) System.out.println("Person array is empty.");
        else {
            for (int i = 0; i < count; i++) {
                if (pA[i].getGender() == age) result[index++] = pA[i];
            }
        }
        return result;
    }

    Person[] search(char gender) {
        Person result[] = new Person[count];
        int index = 0;
        if (count == 0) System.out.println("Person array is empty.");
        else {
            for (int i = 0; i < count; i++) {
                if (pA[i].getGender() == gender) result[index++] = pA[i];
            }
        }
        return result;
    }
}
