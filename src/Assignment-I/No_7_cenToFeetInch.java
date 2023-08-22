
import java.text.DecimalFormat;
import java.util.Scanner;

public class No_7_cenToFeetInch {
    public static void main(String[] args) {
        double centi;
        double inch;
        int feet;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a centimeter : ");
        centi = input.nextDouble();
        DecimalFormat df = new DecimalFormat(".00");

        inch = centi / 2.54;

        if (inch >= 12) {
            feet = (int) (inch / 12);
            inch = (inch % 12);
            System.out.println(centi + "cm is equivalent " + feet + " feet and " + df.format(inch) + " inches.");
        } else {
            System.out.println(centi + "cm is equivalent " + df.format(inch) + " inches.");
        }

    }

}
