package Chapter2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class No20_P79 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy");
        System.out.println("Today is " + simpleDateFormat.format(today));
    }
}
