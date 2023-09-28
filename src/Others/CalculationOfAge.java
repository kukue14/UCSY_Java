package Others;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalculationOfAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        GregorianCalendar now = new GregorianCalendar();
        int days_per_month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int birthDay, birthMonth, birthYear;
        int nowDay, nowMonth, nowYear;
        int day, month, year;

        String birth;

        System.out.print("Enter your birthday in MM/DD/YYYY : ");
        birth = input.next();
        birthDay = Integer.parseInt(birth.substring(3, 5));
        birthMonth = Integer.parseInt(birth.substring(0, 2));
        birthYear = Integer.parseInt(birth.substring(6, 10));

        GregorianCalendar ago = new GregorianCalendar(birthYear, birthMonth, birthDay);

        System.out.println(birthDay);
        System.out.println(birthMonth);
        System.out.println(birthYear);

        day = ago.get(ago.get(Calendar.DAY_OF_YEAR));

    }

}
