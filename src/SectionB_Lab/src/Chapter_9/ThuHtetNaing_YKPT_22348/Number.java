package Chapter_9.ThuHtetNaing_YKPT_22348;

import java.util.Scanner;

public class Number {
    private int num;

    private Number() {

    }

    public boolean isPrime(int num) {
        int divisor = 2;
        while (num % divisor != 0) {
            divisor++;
        }
        if (num == divisor) return true;
        else return false;
    }

    public boolean isAmstrong(int num) {
        int org_num = num;
        int total = 0;
        String numString = num + "";
        int count_num = numString.length();
        while (num != 0) {
            int digit = num % 10;
            int amstrong = (int) Math.pow(digit, count_num);
            total += amstrong;
            num /= 10;
        }
        if (org_num == total) return true;
        else return false;
    }

    public long getFactorial(int num) {
        long total = 1;
        for (int i = 1; i <= num; i++) {
            total *= i;
        }
        return total;
    }

    private int sumDigits(int num) {
        int total = 0;
        while (num != 0) {
            int digit = num % 10;
            num /= 10;
            total += digit;
        }
        return total;
    }

    public int getReverse(int num) {
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = (reverse * 10) + digit;
            num /= 10;
        }
        return reverse;
    }

    public void listFactor(int num) {
        System.out.println(getFactorial(num));
        System.out.println(sumDigits(num));
        System.out.println(getReverse(num));
    }

    public void dispBinary(int num) {
        if (isPrime(num)) System.out.println(num + " is Prime Number.");
        else System.out.println(num + " is not Prime Number.");

        if (isAmstrong(num)) System.out.println(num + " is Amstrong Number.");
        else System.out.println(num + " is not Amstrong Number.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        Number cond = new Number();
        cond.listFactor(number);
        cond.dispBinary(number);

    }
}
