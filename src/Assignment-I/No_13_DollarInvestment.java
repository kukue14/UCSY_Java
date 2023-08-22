import java.text.DecimalFormat;
import java.util.Scanner;

public class No_13_DollarInvestment {
    public static void main(String[] args) {
        double dollar, investment;
        int year, percent;

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".000");
        System.out.print("Enter your investment in Dollar : $");
        dollar = input.nextDouble();
        System.out.print("Enter percentage interest rate : ");
        percent = input.nextInt();
        System.out.print("Enter years : ");
        year = input.nextInt();

        investment = dollar * Math.pow((1 + percent / 100.0), year);

        System.out.println("If you inverest " + dollar + "$ with " + percent + "% in " + year
                + "years, your investment will grow to " + df.format(investment) + "$.");

    }

}
