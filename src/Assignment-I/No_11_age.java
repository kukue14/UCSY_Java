import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class No_11_age {
    public static void main(String[] args) {
        int birthYear, age;
        GregorianCalendar gc = new GregorianCalendar();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth year : ");
        birthYear = input.nextInt();
        age = gc.get(Calendar.YEAR) - birthYear;
        System.out.println("You were born in " + birthYear + " and will be (are) " + age + " this year.");
    }

}
