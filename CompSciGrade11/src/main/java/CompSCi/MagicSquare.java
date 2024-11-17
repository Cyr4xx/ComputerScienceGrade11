package CompSCi;

import  java.util.*;

public class MagicSquare {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] magicSquare = new int[4][4];
        int row1 = 0;
        int row2 = 0;
        int row3 = 0;
        int row4 = 0;
        int column1 = 0;
        int column2 = 0;
        int column3 = 0;
        int column4 = 0;
        int diagonal1 = 0;
        int diagonal2 = 0;
        boolean magicalTruth = false;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j<4; j++) {
                System.out.println("Row " + (i + 1) + " Column " + (j + 1)+ ":");
                magicSquare[i][j] = input.nextInt();

            }
        }
        for (int l = 0; l < 4; l++){
            row1 += magicSquare[0][l];
            row2 += magicSquare[1][l];
            row3 += magicSquare[2][l];
            row4 += magicSquare[3][l];
            }
        for (int m = 0; m < 4; m++){
            column1 += magicSquare[m][0];
            column2 += magicSquare[m][1];
            column3 += magicSquare[m][2];
            column4 += magicSquare[m][3];
        }
        for (int n = 0; n < 4; n++){
            diagonal1 += magicSquare[n][n];
            diagonal2 += magicSquare[n][n];
        }
        if (row1 == row2 && row2 == row3 && row3 == row4 && column1 == column2 && column3 == column2 && column3 == column4 && column1 == row1 && column1 == diagonal1 && diagonal1 == diagonal2){
            magicalTruth = true;

        }else {
            magicalTruth = false;
        }
        if (magicalTruth == true){
            System.out.println("It is a magic square.");

        } else {
            System.out.println("ITs not a magic square.");
        }
    }
}
