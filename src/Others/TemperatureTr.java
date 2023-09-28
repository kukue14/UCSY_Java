package Others;

import java.util.Scanner;

public class TemperatureTr {
    double f, c;

    public double toFahrenheit() {
        return f;
    }

    public double toCelsius() {
        return c;
    }

    public void setFahrenheit(double fah) {
        f = fah;
    }

    public void setCelsius(double fah) {
        c = (f - 32) * (5.0 / 9.0);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TemperatureTr obj = new TemperatureTr();
        System.out.println("Enter the temperature in degree Fachrenheit : ");
        double temp = input.nextDouble();
        obj.setCelsius(temp);
        obj.setFahrenheit(temp);
        System.out.println(
                "The termperature " + temp + " is equvalent in " + obj.toFahrenheit() + " Celsius. " + obj.toCelsius());
    }

}
