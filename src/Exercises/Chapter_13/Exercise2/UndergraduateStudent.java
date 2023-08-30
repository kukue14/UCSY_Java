package Exercises.Chapter_13.Exercise2;

public class UndergraduateStudent extends Student{
    public UndergraduateStudent(String name, int m1, int m2, int m3) {
        super(name);
        setTestScore(0, m1);
        setTestScore(1, m2);
        setTestScore(2, m3);
    }

    public String computeCourseGrade() {
        if (((getTestScore(0) + getTestScore(1) + getTestScore(2))/3) >= 70) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}
