package Revisions.Chapter13.Student;

public class Student {
    public final int NUM_OF_TESTS = 3;
    protected String name;
    protected int[] test = new int[NUM_OF_TESTS];
    protected String courseGrade;

    public Student() {
        name = "Unknown";
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
