package Revisions.TrCollections.BookAddress;

import java.util.ArrayList;
import java.util.Scanner;

public class UserClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the quantity of Person : ");
        int quantity = input.nextInt();
        AddressBook addressBook = new AddressBook();
        for (int i = 0; i < quantity; i++) {
            addressBook.add();
        }

        addressBook.display();
        addressBook.search();
    }
}
