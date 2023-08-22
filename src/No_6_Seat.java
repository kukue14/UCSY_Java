import java.util.Scanner;

public class No_6_Seat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfA_Seats, numberOfB_Seats, numberOfC_Seats;
        int pricePerA_Seat, pricePerB_Seat, pricePerC_Seat;
        int totalSales;
        System.out.print("Enter the number of \"A\" type Seats : ");
        numberOfA_Seats = input.nextInt();
        System.out.print("Enter the number of \"B\" type Seats : ");
        numberOfB_Seats = input.nextInt();
        System.out.print("Enter the number of \"C\" type Sets : ");
        numberOfC_Seats = input.nextInt();

        System.out.print("Enter the Price of \"A\" type Seat : ");
        pricePerA_Seat = input.nextInt();
        System.out.print("Enter the Price of \"B\" type Seat : ");
        pricePerB_Seat = input.nextInt();
        System.out.print("Enter the Price of \"C\" type Seat : ");
        pricePerC_Seat = input.nextInt();

        totalSales = Calculation(numberOfA_Seats, pricePerA_Seat, numberOfB_Seats, pricePerB_Seat,
                numberOfC_Seats, pricePerC_Seat);
        System.out.println("The total sales : " + totalSales);
    }

    public static int Calculation(int noA, int priceA, int noB, int priceB, int noC, int priceC) {
        int totalSales = noA * priceA + noB * priceB + noC * priceC;
        return totalSales;

    }

}
