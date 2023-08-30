package Revisions.Chapter13.Student;

import Exercises.Chapter_13.Exercise2.UndergraduateStudent;

public class UnderGraduateStudent extends Student {
    int mark1, mark2, mark3;
    UnderGraduateStudent(String name, int mark1, int mark2, int mark3) {
        super(name);
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
    public String computeCourseGrade() {
        if (((mark1+mark2+mark3)/3) >= 70) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}
