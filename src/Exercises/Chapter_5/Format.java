package Exercises.Chapter_5;

public class Format {
    public static void main(String[] args) {
        int i;
        for (i = 10; i < 50; i++) {
            if (i % 10 == 9) {
                System.out.print(i + "\n");
            } else {
                System.out.print(i + "\t");
            }
        }
    }
}
