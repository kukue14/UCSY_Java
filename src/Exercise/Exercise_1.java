package Exercise;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        int i, end;
        String str;
        System.out.print("Enter a String : ");
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        i = str.indexOf("!");
        end = str.length() - 1;
        System.out.println(str.substring(0, i));
        System.out.println(str.substring(i + 1, end + 1));
    }
}
