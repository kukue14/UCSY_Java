package Revisions.TrCollections.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee implements Serializable {
    public int employeeID;

    public String name;
    public double salary;

    static ArrayList<Employee> arrayEmployee = new ArrayList<>();

    Employee(int employeeID, String name, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
    }

    public static void display() {
        for (Employee aEmployee : arrayEmployee) {
            System.out.println(aEmployee.employeeID + " is " + aEmployee.name + " and get " + aEmployee.salary);
        }

    }

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the quantity of Employee : ");
        int quantity = input1.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.print("Enter the employee's id : ");
            int employeeID = input1.nextInt();
            System.out.print("Enter the employee's name : ");
            String name = input2.nextLine();
            System.out.print("Enter the employee's salary : ");
            double salary = input1.nextDouble();
            Employee employee = new Employee(employeeID, name, salary);
            arrayEmployee.add(employee);
        }


//        Write to file
        try {
            File fobj = new File("employee.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(fobj);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(arrayEmployee);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

//        Read from file
        try {
            System.out.println("This is reading result.");
            File fobj = new File("employee.txt");
            FileInputStream fileInputStream = new FileInputStream(fobj);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<Employee> arrayList = new ArrayList<>();
            arrayList = (ArrayList<Employee>) objectInputStream.readObject();
            display();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
