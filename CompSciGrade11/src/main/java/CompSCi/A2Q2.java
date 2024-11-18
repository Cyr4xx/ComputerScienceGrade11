// Peter Migliore
// Tuesday, November 19
// Assignment 3 - Arrays
package CompSCi;

import java.util.*;

public class A2Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int numColumns;
        int numRows;
        System.out.println("Welcome to the math square program.");
        while (true) {
            System.out.println("Enter the number of columns: ");
            try {
                numColumns = input.nextInt();
                if (numColumns <= 0) {
                    System.out.println("Letters are not allowed.");
                    continue;
                } else {
                    break;
                }
            } catch (Exception e) {
                input.nextLine();
                System.out.println("Letters are not allowed.");
                continue;
            }
        }

        while (true) {
            System.out.println("Enter the number of rows: ");
            try {
                numRows = input.nextInt();
                if (numRows <= 0) {
                    System.out.println("Letters are not allowed.");
                    continue;
                } else {
                    break;
                }
            } catch (Exception e) {
                input.nextLine();
                System.out.println("Letters are not allowed.");
                continue;
            }
        }
        int[][] table = new int[numRows][numColumns];

        for (int i = 0; i < numRows; i++) {
            for (int k = 0; k < numColumns; k++){
                table[i][k] = random.nextInt(100)+1;
            }
        }
        System.out.println(Arrays.deepToString(table).replace("],", " \n")); // Deep to string prints the array in a line, the replace method then adds new lines where the brackets are.

        while (true){
            
        }


    }
}
