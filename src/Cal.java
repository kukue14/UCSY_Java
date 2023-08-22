
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Cal {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        int month = gc.get(Calendar.MONTH) + 1;
        System.out.println("Today is " + month);
    }

}
