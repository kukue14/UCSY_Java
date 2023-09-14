package Revisions.ObjectArrayList;

public class Person {
    public double salary;
    public String personId;
    public String personName;


    Person() {
        this.personId = "Unknown";
        this.personName = "Unknown";
        this.salary = 0.0;
    }

    Person(String personName, String personId, double salary) {
        this.personId = personId;
        this.personName = personName;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getPersonId() {
        return personId;
    }

    public String getPersonName() {
        return personName;
    }

}
