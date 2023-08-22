import java.text.DecimalFormat;
import java.util.Scanner;

public class No_14_VolumeOfSphere {
    public static void main(String[] args) {
        double radius, volume;
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".000");
        System.out.print("Enter a radius of the sphere : ");
        radius = input.nextDouble();

        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println(
                "The volume of the " + radius + " radius sphere is : " + df.format(volume)
                        + " cubic unit.");

    }

}
