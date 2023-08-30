package Exercises.Chapter_13.Exercise2;

public class UserClass {
    public static void main(String[] args) {
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Ku Kue", 90, 95, 100);
        String result = undergraduateStudent.computeCourseGrade();

        GraduateStudent graduateStudent = new GraduateStudent("Mg Mg", 90, 80, 98);
        String resultLite = graduateStudent.computeCourseGrade();

        System.out.println(undergraduateStudent.getName() + " " + result);
        System.out.println(graduateStudent.getName() + " " +  resultLite);
    }
}
