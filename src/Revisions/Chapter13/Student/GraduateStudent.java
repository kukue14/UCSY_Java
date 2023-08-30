package Revisions.Chapter13.Student;

public class GraduateStudent extends Student{
    int mark1, mark2, mark3;
    GraduateStudent(String name, int mark1, int mark2, int mark3) {
        super(name);
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public String computeCourseGrade() {
        if (((mark1+mark2+mark3)/3) >= 80) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}
