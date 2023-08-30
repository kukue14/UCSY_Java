package Revisions.Chapter13.Student;

import Exercises.Chapter_13.Exercise2.GraduateStudent;
import Exercises.Chapter_13.Exercise2.UndergraduateStudent;

public class UserClass {
    public static void main(String[] args) {
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Ku Kue", 100, 95, 98);
        GraduateStudent graduateStudent = new GraduateStudent("Mg Mg", 90, 40,30);
        System.out.println(undergraduateStudent.getName() + " " + undergraduateStudent.computeCourseGrade());
        System.out.println(graduateStudent.getName() + " " + graduateStudent.computeCourseGrade());
    }
}
