import java.text.DecimalFormat;
import java.util.Scanner;

public class No_8_Temperature {
    public static void main(String[] args) {
        double degCelsius, degFahrenheit;
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".00");
        System.out.print("Enter the temperature in degree Celcius : ");
        degCelsius = input.nextDouble();
        degFahrenheit = 1.8 * degCelsius + 32;
        System.out.println(degCelsius + " Celsius is equivalent " + df.format(degFahrenheit) + " Fahrenheit.");
    }

}
