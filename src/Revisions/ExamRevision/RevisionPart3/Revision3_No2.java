package Revisions.ExamRevision.RevisionPart3;

import java.util.*;

class Student {
    public final int NUM_OF_TESTS = 3;
    protected String name;
    protected int[] test = new int[NUM_OF_TESTS];
    protected String courseGrade;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getCourseGrade() {
        return courseGrade;
    }

    public String getName() {
        return name;
    }

    public int getTestScore(int index) {
        return test[index];
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTestScore(int index, int mark) {
        test[index] = mark;
    }

    public String computeCourseGrade() {
        return courseGrade;
    }
}

class UndergraduateStudent extends Student {
    int total = 0;

    public String computeCourseGrade() {
        for (int i = 0; i < NUM_OF_TESTS; i++)
            total += getTestScore(i);
        if ((total / NUM_OF_TESTS) >= 70) courseGrade = "Pass";
        else courseGrade = "Fail";
        return courseGrade;
    }
}

class GraduateStudent extends Student {
    int total = 0;

    public String computeCourseGrade() {
        for (int i = 0; i < super.NUM_OF_TESTS; i++)
            total += getTestScore(i);
        if ((total / NUM_OF_TESTS) >= 80) courseGrade = "Pass";
        else courseGrade = "Fail";
        return courseGrade;
    }
}

public class Revision3_No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the type of student (U for Undergraduate Student, G for Graduate Student) : ");
        String type = input.next();

        Scanner inputLite = new Scanner(System.in);
        System.out.print("Enter the student name : ");
        String name = inputLite.nextLine();
        Student student;
        if (type.equalsIgnoreCase("U")) {
            student = new UndergraduateStudent();
            student.setName(name);
            Scanner input1 = new Scanner(System.in);
            for (int i = 0; i < student.NUM_OF_TESTS; i++) {
                System.out.print("Enter the mark : ");
                int mark = input1.nextInt();
                student.setTestScore(i, mark);
            }
            System.out.println(student.computeCourseGrade());
        } else if (type.equalsIgnoreCase("G")) {
            student = new GraduateStudent();
            student.setName(name);
            Scanner input1 = new Scanner(System.in);
            for (int i = 0; i < student.NUM_OF_TESTS; i++) {
                System.out.print("Enter the mark : ");
                int mark = input1.nextInt();
                student.setTestScore(i, mark);
            }
            System.out.println(student.computeCourseGrade());
        }


    }
}