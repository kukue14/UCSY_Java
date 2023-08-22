package Exercises.Chapter_10;

public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public static void main(String[] args) {
        Person[] personA = new Person[5];
        Person p1 = new Person("Ku Kue", 19, 'M');
        Person p2 = new Person("Mya Mya", 20, 'F');
        Person p3 = new Person("Mg Mg", 19, 'M');
        Person p4 = new Person("Zaw Zaw", 18, 'M');
        Person p5 = new Person("Hla Hla", 21, 'F');
        personA[0] = p1;
        personA[1] = p2;
        personA[2] = p3;
        personA[3] = p4;
        personA[4] = p5;
        for (int i = 0; i < personA.length; i++) {
            System.out.println("Name : " + personA[i].getName() + " /Age : " + personA[i].getAge() + " /Gender : " + personA[i].getGender());
        }

        Person youngestP, oldestP;
        youngestP = oldestP = personA[0];
        for (int i = 0; i < personA.length; i++) {
            if (personA[i].getAge() > oldestP.getAge()) oldestP = personA[i];
            if (personA[i].getAge() < youngestP.getAge()) youngestP = personA[i];
        }

        System.out.println("Youngest Person : " + youngestP.getName() + " /Age : " + youngestP.getAge() + " /Gender : " + youngestP.getGender());
        System.out.println("Oldest Person : " + oldestP.getName() + " /Age : " + oldestP.getAge() + " /Gender : " + oldestP.getGender());
    }
}

