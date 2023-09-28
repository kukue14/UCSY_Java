package Others;

import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random rand = new Random();

        int rand1 = rand.nextInt(10);
        System.out.println(rand1);

        System.out.println(Math.random());
    }

}
