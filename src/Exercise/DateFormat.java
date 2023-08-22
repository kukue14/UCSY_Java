package Exercise;

import java.util.*;
import java.text.SimpleDateFormat;

public class DateFormat {
    public static void main(String[] args) {
        Date todayDate;
        todayDate = new Date();
        System.out.println(todayDate);

        SimpleDateFormat df;
        df = new SimpleDateFormat("dd MMMM YYYY");
        System.out.println(df.format(todayDate));
    }
}
