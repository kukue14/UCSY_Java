public class No_1 {
    public static void main(String[] args) {
        int i = 3, j = 4, k = 5;
        float x = 34.5f, y = 12.25f;

        // a
        System.out.println((x + 1.5) / 250.0 * (i / j));

        // b
        System.out.println(x + 1.5 / 250.0 * i / j);

        // c
        System.out.println(-x * -y * (i + j) / k);

        // d
        System.out.println((i / 5) * y);

        // e
        System.out.println(Math.min(i, Math.min(j, k)));

        // f
        // System.out.println(Math.exp(3, 2));

        // g
        System.out.println(y % x);

        // h
        System.out.println(Math.pow(3, 2));

        // i
        System.out.println((int) y % k);

        // j
        System.out.println(i / 5 * y);

    }
}
