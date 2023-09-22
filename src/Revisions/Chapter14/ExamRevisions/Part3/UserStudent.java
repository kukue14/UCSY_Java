package Revisions.Chapter14.ExamRevisions.Part3;
import java.util.*;
class Student {
	public final int NUM_OF_TESTS = 3;
	protected String name;
	protected int[] test = new int[NUM_OF_TESTS];
	protected String courseGrade;
	
	public Student() {}

	public Student(String name) {
		this.name = name;
	}
	
	public String getCourseGrade() {
		return courseGrade;
	}

	public String getName() {
		return name;
	}
		
	public int getTestScore(int i) {
		return test[i];
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setTestScore(int i, int mark) {
		test[i] = mark;
	}

	public String computeCourseGrade() {
		return courseGrade;
	}
}

class UndergraduateStudent extends Student {
	int total = 0;
	public String computeCourseGrade() {
		for (int i = 0; i < NUM_OF_TESTS; i++) {
			test[i] = getTestScore(i);
			total += test[i];
		}
		if (total >= 70) courseGrade = "Pass";
		else courseGrade = "Fail";
		return courseGrade;
	}
}

class GraduateStudent extends Student {
	int total = 0;
	public String computeCourseGrade() {
		for (int i = 0; i < NUM_OF_TESTS; i++) {
			test[i] = getTestScore(i);
			total += test[i];
		}
		if (total >= 80) courseGrade = "Pass";
		else courseGrade = "Fail";
		return courseGrade;
	}
}

public class UserStudent {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the type of Person : ");
		String type = input.next();

		Scanner input11 = new Scanner(System.in);
		System.out.print("Enter the name of Student : ");
		String name = input11.nextLine();

		Student stu;
		if (type.equalsIgnoreCase("UNDERGRADUATE")) {
			Scanner input1 = new Scanner(System.in);
			stu = new UndergraduateStudent();
			stu.setName(name);
			for (int i = 0; i < stu.NUM_OF_TESTS; i++) {
				System.out.print("Enter the mark of " + name + " : ");
				int mark = input1.nextInt();
				stu.setTestScore(i, mark);
			}
			System.out.println("The name of Student : " + stu.getName());
			System.out.println("The course grade : " + stu.computeCourseGrade());
		} else if (type.equalsIgnoreCase("GRADUATE")) {
			Scanner input1 = new Scanner(System.in);
			stu = new GraduateStudent();
			stu.setName(name);
			for (int i = 0; i < stu.NUM_OF_TESTS; i++) {
				System.out.print("Enter the mark of " + name + " : ");
				int mark = input1.nextInt();
				stu.setTestScore(i, mark);
			}
			System.out.println("The name of Student : " + stu.getName());
			System.out.println("The course grade : " + stu.computeCourseGrade());
		}

	}
}