import java.text.DecimalFormat;
import java.util.Scanner;

public class No_15_Velocity {
    public static void main(String[] args) {
        final double G = 6.67 * Math.pow(10, -11); // cubic meter per kilogram square of the second
        final double ME = 5.98 * Math.pow(10, 24); // kg
        double radius, velocity;

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".0000");
        System.out.print("Enter the radius (meter) of the satellite from the center of the earth : ");
        radius = input.nextDouble();

        velocity = Math.sqrt(G * ME / radius);
        System.out.println("The velocity of the satellite in " + radius + " meter radius is : " + df.format(velocity)
                + " meter per second.");
    }
}
