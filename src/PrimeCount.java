import java.util.Scanner;

public class PrimeCount {
    public static boolean isPrime(int num) {
        int divisor = 2;
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (num % divisor != 0) divisor++;
            else count++;
        }
        if (divisor == num) return true;
        else return false;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int size = input.nextInt();
        int primes[] = new int[size];
        int loop = 0;
        int i = 0;

        int numbers = 2;
        while (true) {
            if (isPrime(numbers)) {
                primes[i] = numbers;
                loop++;
                i++;
            }
            numbers++;
            if (loop == size) break;
        }

        for (int j = 0; j < size; j++) {
            System.out.println("This is prime : " + primes[j]);
        }
    }
}
