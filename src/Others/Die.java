package Others;

import java.util.Random;

public class Die {
    private int number;
    private static final int MIN = 1;
    private static final int MAX = 6;
    private static final int NO_NUMBER = 0;

    public Die() {
        number = NO_NUMBER;
    }

    public void roll() {
        Random rand = new Random();
        number = rand.nextInt(MAX - MIN + 1) + MIN;
    }

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        Die dice1, dice2, dice3;
        dice1 = new Die();
        dice2 = new Die();
        dice3 = new Die();

        dice1.roll();
        dice2.roll();
        dice3.roll();

        System.out.println("Dice1 " + dice1.getNumber());
        System.out.println("Dice2 " + dice2.getNumber());
        System.out.println("Dice3 " + dice3.getNumber());

    }
}
