package Others;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalculationOfBirthday {
    public static void main(String[] args) {

        // Creationg Objects
        Scanner input = new Scanner(System.in);
        GregorianCalendar present = new GregorianCalendar();

        // variable declarations
        int birthDay, birthMonth, birthYear;
        int nowDay, nowMonth, nowYear;
        String birthString;

        // Requesting
        System.out.print("Enter your birhtday in MM/DD/YYYY : ");
        birthString = input.next();

        // Inserting datas
        birthDay = Integer.parseInt(birthString.substring(3, 5));
        birthMonth = Integer.parseInt(birthString.substring(0, 2));
        birthYear = Integer.parseInt(birthString.substring(6, 10));

        nowDay = present.get(Calendar.DATE);
        nowMonth = present.get(Calendar.MONTH) + 1;
        nowYear = present.get(Calendar.YEAR);

        GregorianCalendar birth = new GregorianCalendar(birthYear, birthMonth, birthDay);
        GregorianCalendar birthLite = new GregorianCalendar(birthYear, 11, 31);

        int day, month, year;

        year = (nowYear - 1) - birthYear;

        month = (12 - birthMonth) + (nowMonth - 1);
        if (month >= 12) {
            year += month / 12;
            month %= 12;
        }
        day = present.get(Calendar.DAY_OF_MONTH)
                + (birthLite.get(Calendar.DAY_OF_MONTH) - birth.get(Calendar.DAY_OF_MONTH));
        if (day >= 31) {
            month += day / 31;
            day %= 31;
        }

        System.out.println(nowMonth + "/" + nowDay + "/" + nowYear + " and your birthday " + birthString
                + " is different in " + year + " years " + month + " months and " + day + " days.");
    }

}
