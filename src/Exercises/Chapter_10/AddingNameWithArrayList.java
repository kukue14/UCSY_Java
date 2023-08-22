package Exercises.Chapter_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddingNameWithArrayList {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        name.add("Ku Kue");
        name.add("Mya Mya");

        while (true) {
            System.out.print("Enter a name : ");
            String inputName = input.nextLine();
            if (inputName.equalsIgnoreCase("stop")) break;
            else {

                int i;
                for (i = 0; i < name.size(); i++) {
                    if (name.get(i).equals(inputName)) {
                        System.out.println("You entered name is already in Array!");
                        break;
                    }
                }
                if (i == name.size()) name.add(inputName);
            }
            for (String aName : name) System.out.println(aName);
        }
    }
}
