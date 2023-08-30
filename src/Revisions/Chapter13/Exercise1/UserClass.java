package Revisions.Chapter13.Exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class UserClass {
    public static void main(String[] args) {
        String name;
        char type;
        ArrayList<Pets> arrayPets = new ArrayList<Pets>();
        Pets pets = null;
        while (true) {
            Scanner input1 = new Scanner(System.in);
            System.out.print("Enter the name of pet : ");
            name = input1.nextLine();
            Scanner input2 = new Scanner(System.in);
            System.out.print("Enter the type of pet : ");
            type = input2.next().charAt(0);
            if (name.equalsIgnoreCase("STOP")) break;
            if (type == 'c') {
                pets = new Cat(name,type);
            } else if (type == 'd') {
                pets = new Dog(name, type);
            } else {
                System.out.println("Unvalid type of pet!");
            }
            arrayPets.add(pets);
        }
        for (Pets aStr : arrayPets) {
            System.out.println(aStr.name + " is a " + aStr.type);
        }
    }
}
