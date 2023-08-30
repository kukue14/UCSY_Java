package Exercises.Chapter_13.Exercise2;

public class Student {
    final int NUMBER_OF_TEST = 3;
    String name;
    int test[] = new int[NUMBER_OF_TEST];
    String courseGrade;

    public Student() {
        name = "Unknown";
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTestScore(int index) {
        return test[index];
    }

    public void setTestScore(int index, int marks) {
        test[index] = marks;
    }


    public String getCourseGrade() {
        return courseGrade;
    }

    public String computeCourseGrade() {
        return courseGrade;
    }
}
