package Exercises.Chapter_10;

import java.util.ArrayList;
import java.util.Scanner;

public class SumIntegersWithArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayNum = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);

        int total = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number : ");
            int num = input.nextInt();
            arrayNum.add(num);
            total += arrayNum.get(i);
        }
        double avg;
        avg = (double) total/arrayNum.size();
        System.out.print("You entered : ");
        for (int aNum : arrayNum) System.out.print(aNum + "\t");
        System.out.println("\nThe average number is : " + avg);
    }
}
