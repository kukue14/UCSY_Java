package Exercises.Chapter_10;

public class TestAddressBook {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook(5);
        Person p1 = new Person("Ma Ma", 18, 'F');
        Person p2 = new Person("Mg Mg", 19, 'M');
        Person p3 = new Person("Zaw Zaw", 20, 'M');
        Person p4 = new Person("Aung Aung", 21, 'M');
        Person p5 = new Person("Hla Hla", 19, 'F');
        Person p6 = new Person("Ku Kue", 19, 'M');
        addressBook.add(p1);
        addressBook.add(p2);
        addressBook.add(p3);
        addressBook.add(p4);
        addressBook.add(p5);
//        addressBook.add(p6);

//        addressBook.delete("Ma Mya");
//        addressBook.delete("Ma Ma");


        try {
            Person r = addressBook.search("Aung Bo");
            System.out.println(r.getName() + " / " + r.getAge() + " / " + r.getGender());
        } catch (NullPointerException e) {
            System.out.println("Name is not found!");
        }

        try {
            Person r[] = addressBook.search(18);
            for (Person p : r) {
                System.out.println(p.getName() + " / " + p.getAge() + " / " + p.getGender());
            }
        } catch (NullPointerException e) {
            System.out.println("Age is not found!");
        }

        try {
            Person r[] = addressBook.search('M');
            for (Person p : r) {
                System.out.println(p.getName() + " / " + p.getAge() + " / " + p.getGender());
            }
        } catch (NullPointerException e) {
            System.out.println("Gender is not found!");
        }

    }
}
