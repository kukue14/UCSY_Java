import java.text.DecimalFormat;
import java.util.Scanner;

public class No_12_BMI {
    public static void main(String[] args) {
        int weight, height;
        double bmi;

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".00");
        System.out.print("Enter your weight in kilogram in integer : ");
        weight = input.nextInt();
        System.out.print("Enter your height in centimeter in integer : ");
        height = input.nextInt();

        // calculating BMI
        bmi = (weight / Math.pow(height / 100.0, 2));

        System.out.print("Your body mass index is : " + df.format(bmi) + " bmi and");
        if (bmi > 25) {
            System.out.print(" it is over normal ");
        } else if (bmi < 20) {
            System.out.print(" it is under normal ");
        } else {
            System.out.print(" it is normal ");
        }
        System.out.println("(20bmi to 25bmi).");
    }

}
