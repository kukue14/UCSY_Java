import java.util.Random;

public class RollDice {

    int number;

    public void roll() {
        Random rand = new Random();
        number = rand.nextInt(6 - 1 + 1) + 1;
    }

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        RollDice dice1, dice2, dice3;
        dice1 = new RollDice();
        dice2 = new RollDice();
        dice3 = new RollDice();

        dice1.roll();
        dice2.roll();
        dice3.roll();

        System.out.println(dice1.getNumber());
        System.out.println(dice2.getNumber());
        System.out.println(dice3.getNumber());

    }

}
