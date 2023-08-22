import java.text.DecimalFormat;
import java.util.Scanner;

public class No_10_Temperature {
    public static void main(String[] args) {
        double degCelsius, degFahrenheit;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Fahrenheit : ");
        degFahrenheit = input.nextDouble();
        degCelsius = (degFahrenheit - 32) * 5.0 / 9.0;
        DecimalFormat df = new DecimalFormat(".00");
        System.out.println(degFahrenheit + " Fahrenheit is equivalent in " + df.format(degCelsius) + " Celsius.");
    }
}
