import java.util.Scanner;

public class No_9_bodyWeight {
    public static void main(String[] args) {
        double weight, calories;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in pound : ");
        weight = input.nextDouble();
        calories = weight * 19;
        System.out.println(weight + " pound of a person needs " + calories + " calories.");
    }

}
