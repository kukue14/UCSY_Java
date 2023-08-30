package Exercises.Chapter_13.Exercise1;

import java.util.*;

public class UserClass {
    public static void main(String[] args) {
        ArrayList<Pets> arrayPets = new ArrayList<Pets>();
        Pets pets = null;
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the name of pet : ");
            String name = input.nextLine();

            Scanner inputLite = new Scanner(System.in);
            System.out.print("Enter the type of pet : ");
            char type = input.next().charAt(0);

            if(name.equalsIgnoreCase("STOP")) break;
            if (type == 'c') {
                pets = new Cat(name, type);
            } else if(type == 'd') {
                pets = new Dog(name, type);
            } else {
                System.out.println("Unvalid Type!");
            }
            arrayPets.add(pets);

        }

//        Before Sorting

        for (Pets r : arrayPets) {
            System.out.println(r.getName() + " is a " + r.getType());
        }

//        After Sorting
        for (Pets r : arrayPets) {
            if (r.getType() == 'd') System.out.println(r.getName() + " is a " + r.getType());
        }

        for (Pets r : arrayPets) {
            if (r.getType() == 'c') System.out.println(r.getName() + " is a " + r.getType());
        }

//        [OR]

        Collections.sort(arrayPets, new sortByType());
        System.out.println("After sorting");
        for (Pets aPets : arrayPets) {
            System.out.println("Name is : " + aPets.getName());
            System.out.println("Type is : " + aPets.getType());
        }
    }
}

//Ascending
class sortByType implements Comparator<Pets> {
    public int compare(Pets o1, Pets o2) {
        return o1.getType() - o2.getType();
    }
}

//Desending
class sortByType2 implements Comparator<Pets> {
    public int compare(Pets o1, Pets o2) {
        return o2.getType() - o1.getType();
    }
}
