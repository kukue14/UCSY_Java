package Exercises;

import java.util.Scanner;

public class No_13_Sales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total_sales, total_hour, hour, commission, overTime;

        System.out.print("Enter the total hour : ");
        total_hour = input.nextDouble();

        System.out.print("Enter the total sales : ");
        total_sales = input.nextDouble();

        if (total_hour > 8) {
            hour = 8;
            overTime = total_hour - hour;
        } else {
            hour = total_hour;
            overTime = 0;
        }

        if (total_sales >= 1.00 && total_sales <= 99.99) {
            commission = (5/100) * total_sales;
        } else if(total_sales >= 100.00 && total_sales <=299.99) {
            commission = (10/100) * total_sales;
        } else {
            commission = (15/100) * total_sales;
        }

        double usage = hour * 7.25 + (overTime * (7.25 + 7.25/2)) + commission;
        System.out.println("The total Salary is : " + usage);



    }
}
