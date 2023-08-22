package Exercises.Chapter_10;

import Exercises.Chapter_5.Format;

import java.sql.SQLOutput;

public class TwoDimensionArray {
    public static void main(String[] args) {
        int[][] twoD = {
                {1,2,3,4,4,5,3,2},
                {2,3,4,5,2,6,7,4},
                {4,3,2,6,7,6,9,7},
                {2,9,7,0,5,3,5,3}
        };

        int rowSum = 0;
        int colSum = 0;
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + "\t");
                rowSum += twoD[i][j];
            }
            System.out.print(" | " + rowSum);
            rowSum = 0;
            System.out.println();
        }
        for (int k = 0; k < twoD[0].length; k++) System.out.print("-\t");
        System.out.println();
        for (int i = 0; i < twoD[0].length; i++) {
            for (int j = 0; j < twoD.length; j++) {
                colSum += twoD[j][i];
            }
            System.out.print(colSum + "\t");
            colSum = 0;
        }
    }
}
