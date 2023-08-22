package Own_Programs;

import java.util.GregorianCalendar;

public class CalculatingCalendar {
    private static final int MONTH = 0;
    private static final int DATE = 0;
    private static final int YEAR = 0;

    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(
                "Today is : " + cal.get(CalculatingCalendar.MONTH) + 1 + "/" + cal.get(CalculatingCalendar.DATE));
    }
}
