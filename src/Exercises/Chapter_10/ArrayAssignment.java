package Exercises.Chapter_10;

public class ArrayAssignment {
    public static void main(String[] args) {
        int[][] twoDArray = {
                {1,2,3,5,3,2,3,4},
                {5,6,8,9,6,5,4,6},
                {7,8,9,6,5,4,6,5},
                {1,2,4,6,4,6,7,8},
                {6,7,5,4,3,7,8,9},
        };
        
        int avg;
        int sum = 0;
        int max = twoDArray[0][0];
        int min = twoDArray[0][0];
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                sum += twoDArray[i][j];
                System.out.print(twoDArray[i][j] + "\t");
                if (max < twoDArray[i][j]) max = twoDArray[i][j];
                if (min > twoDArray[i][j]) min = twoDArray[i][j];
            }
            System.out.println();
        }
        avg = sum / (twoDArray.length*twoDArray[0].length);
        System.out.println("The total is : " + sum);
        System.out.println("The average number is : " + avg);
        System.out.println("The maximum number is : " + max);
        System.out.println("The minimum number is : " + min);
    }
}
