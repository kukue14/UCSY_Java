package Others;

import java.sql.Struct;
import java.util.Random;
import java.util.Scanner;

import javax.naming.LimitExceededException;

import org.w3c.dom.Notation;

public class Dice {

    public static void main(String[] args) {
        String rolling, reading;
        String req = "Y";
        int initial_amount, bet_amount, detail_amount, man_amount;
        char line;
        int num;

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Games Rules!");
        System.out.println(
                "1. If your total number is greater than system total number, you will get under the following times of the amounts.");
        System.out.println(
                "2. If your total number is less than system total number, you must pay  times of theamounts.");
        System.out.println("\tDifferences\t\t\tTimes");
        System.out.println("\t      1\t\t\t\t  1");
        System.out.println("\t     2, 3\t\t\t  2");
        System.out.println("\t     4, 5\t\t\t  3");
        System.out.println("\t     6, 7\t\t\t  4");
        System.out.println("\t     8, 9\t\t\t  5");
        System.out.println("\t    10, 11\t\t\t  6");
        System.out.println("\t    12, 13\t\t\t  7");
        System.out.println("\t    14, 15\t\t\t  8");
        System.out.println();
        System.out.println("If the match is draw, ");
        System.out.println(
                "\t1. If your two numbers are greater than the two numbers of the system, you will get the bet amount.");
        System.out.println(
                "\t2. If your two numbers are less than the two numbers of the system, you must pay the bet amount.");
        System.out
                .println("3. If you want to 'stop' after rolling the system, you must pay the half of the bet amount.");
        System.out.println(
                "Note that : Your initial amount and system initial amount are equivalent. If someone lose all money($), the game will stop. \nTo exit, '0' to bet amount.");
        System.out.print("Do you agree terms & policy (Agree/ Disagree) : ");
        reading = input.next();
        if (reading.equalsIgnoreCase("AGREE") || reading.equalsIgnoreCase("YES")) {
            System.out.print("Enter the initial amount: $");
            initial_amount = input.nextInt();
            int system_amount = initial_amount;

            System.out.print("Enter the amount for a bet: $");
            bet_amount = input.nextInt();

            do {
                if (bet_amount == 0)
                    break;

                if (bet_amount > initial_amount) {
                    System.out.println("Your bet amount is more exceed than you have! Sorry!");
                    System.out.print("Enter the amount for a bet: $");
                    bet_amount = input.nextInt();
                    continue;
                } else {
                    int i, system_rolling, system_total = 0;
                    int system_array[] = { 0, 0, 0 };
                    for (i = 0; i < 3; i++) {
                        system_rolling = rand.nextInt(6) + 1;
                        system_total += system_rolling;
                        System.out.println("The " + (i + 1) + " time of the system rolling: " + system_rolling);
                        system_array[i] = system_rolling;
                    }

                    Line('-', 45);
                    System.out.println("\nThe total number of the system : " + system_total);
                    Line('-', 45);

                    System.out.print("\nPlease, roll the dice! Type \"roll\"! If not, type \"stop\". : ");
                    rolling = input.next();
                    if (rolling.equalsIgnoreCase("STOP")) {
                        detail_amount = bet_amount / 2;
                        man_amount = initial_amount - detail_amount;
                        system_amount += detail_amount;
                        System.out.print("\nYou bet " + bet_amount + "$");
                        System.out.println(
                                "\nThe game take $" + detail_amount + " from your original amount $" + initial_amount
                                        + ". \n\nYou have " + man_amount + "$.");
                        System.out.println("The system have " + system_amount + "$.");
                        initial_amount = man_amount;
                        Line('=', 100);
                        System.out.println("Total: " + (man_amount + system_amount));
                        System.out.print("\nEnter the amount for a bet: $");
                        bet_amount = input.nextInt();
                        continue;
                    }
                    int man_rolling, man_total = 0;
                    int man_array[] = { 0, 0, 0 };
                    for (i = 0; i < 3; i++) {
                        man_rolling = rand.nextInt(6) + 1;
                        man_total += man_rolling;
                        System.out.println("The " + (i + 1) + " time of the man rolling: " + man_rolling);
                        man_array[i] = man_rolling;
                    }

                    Line('-', 45);
                    System.out.println("\nThe total number of the man : " + man_total);
                    Line('-', 45);
                    System.out.println();

                    int times;
                    System.out.print("\nYou bet " + bet_amount + "$");
                    if (man_total > system_total) {
                        times = ((man_total - system_total) / 2) + 1;
                        detail_amount = bet_amount * times;
                        man_amount = initial_amount + detail_amount;
                        system_amount -= detail_amount;
                        System.out.println("\nYou get " + detail_amount + "$ on " + times + " times.");

                    } else if (man_total < system_total) {
                        times = ((system_total - man_total) / 2) + 1;
                        detail_amount = bet_amount * times;
                        man_amount = initial_amount - detail_amount;
                        system_amount += detail_amount;
                        System.out.println("\nYou lose " + detail_amount + "$ on " + times + " times.");
                    } else {
                        System.out.println("\nThis match is Draw!");
                        int man_count = 0, system_count = 0;

                        for (i = 0; i < 3; i++) {
                            if (man_array[i] == system_array[i])
                                continue;

                            if (man_array[i] > system_array[i]) {
                                man_count++;
                            } else {
                                system_count++;
                            }
                        }

                        if (man_count > system_count) {
                            System.out.println("You get 2 Stars.");
                            detail_amount = bet_amount;
                            man_amount = initial_amount + detail_amount;
                            system_amount -= detail_amount;
                            System.out.println("\nYou get " + detail_amount + "$");
                        } else if (man_count < system_count) {
                            System.out.println("The system get 2 Stars.");
                            detail_amount = bet_amount;
                            man_amount = initial_amount - detail_amount;
                            system_amount += detail_amount;
                            System.out.println("\nYou lose " + detail_amount + "$");

                        } else {
                            System.out.println("This match is absolutely Draw!");
                            man_amount = initial_amount;
                        }
                    }

                }

                if (system_amount <= 0) {
                    System.out.println("\nYou Win! The system money is gone. Congratulations!");
                    break;
                }

                if (man_amount <= 0) {
                    System.out.println("\nYou lose! Thanks for your donation, Loser!");
                    break;
                }

                System.out.println("Your original amount " + initial_amount + "$.");
                System.out.println("\nYou have " + man_amount + "$.");
                System.out.println("The system have " + system_amount + "$.");

                Line('=', 100);

                System.out.println("Total: " + (man_amount + system_amount));
                initial_amount = man_amount;

                System.out.print("Enter the amount for a bet: $");
                bet_amount = input.nextInt();

                // System.out.print("Do another? (Y/N) : ");
                // req = input.next();
                // } while (req.equalsIgnoreCase("Y"));
            } while (bet_amount != 0);

        } else {
            System.out.println("Thank You!");
        }
    }

    static void Line(char line, int num) {
        for (int j = 1; j <= num; j++) {
            System.out.print(line);
        }
    }

}
