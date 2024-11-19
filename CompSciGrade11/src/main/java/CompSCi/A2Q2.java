// Peter Migliore
// Tuesday, November 19
// Assignment 3 - Arrays
package CompSCi;

import java.math.*;
import java.util.*;

public class A2Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int numColumns;
        int numRows;
        int answer;
        int whichRow;
        int whichColumn;
        int instance;

        System.out.println("Welcome to the math square program.");
        while (true) {
            System.out.println("Enter the number of columns you would like in your math square: ");
            try {
                numColumns = input.nextInt();
                if (numColumns <= 0) {
                    System.out.println("Negative integers and zero are not allowed."); // Exception and invalid input handling.
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
                    System.out.println("Negative integers and zero are not allowed."); // Exception and invalid input handling.
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
        int[][] table = new int[numRows][numColumns]; // Define 2-D array based on the user input.

        for (int i = 0; i < numRows; i++) {
            for (int k = 0; k < numColumns; k++){
                table[i][k] = random.nextInt(100)+1; // For loop within a for loop to define each number in each row, from top to bottom.
            }
        }
        System.out.println(Arrays.deepToString(table).replace("], ", "||\n")); // Deep to string prints the array in a line, the replace method then adds new lines where the brackets are and closing brackets where the commas are. Deeptostring is built into netbeans, and it shows you how to use it.

        while (true){
            System.out.println("\nMain Menu: Math Square");
            System.out.println("*Note - Enter the exit number at anytime to quit.");
            System.out.println("1. Sum of entire square \n2. Average of entire square \n3. Maximum value in the square \n4. Minimum value in the square \n5. Sum of elements in a chosen row \n6. Sum of elements in a chosen column \n7. Instances of a number in the table \n0. Exit ");
            System.out.println("Select a number: ");

            try {
                answer = input.nextInt();
                if (answer > 7 || answer < 0){
                    System.out.println("That is not an option."); // Exception and invalid input handling.
                    continue;
                }
            } catch (Exception e) {
                input.nextLine();
                System.out.println("Letters are not allowed.");
                continue;
            }
            switch(answer){
                case 1:
                    System.out.println("The sum of the entire square is: " + sumArray(table, numRows, numColumns));
                    break;

                case 2:
                    System.out.println("The average of the entire square is: " + averageArray(table, numRows, numColumns));
                    break;

                case 3:
                    System.out.println("The maximum of the entire square is: " + maxArray(table, numRows, numColumns));
                    break;

                case 4:
                    System.out.println("The minimum of the entire square is: " + minArray(table, numRows, numColumns));
                    break;

                case 5:
                    while (true){
                        System.out.println("Which row would you like the sum of?: ");
                        try {
                            whichRow = input.nextInt();
                            if (whichRow > numRows  || whichRow <= 0){
                                System.out.println("That is not a row.");
                                continue;
                            }else {
                                break;
                            }
                        } catch (Exception e) {
                            input.nextLine();
                            System.out.println("Letters are not allowed.");
                            continue;
                        }
                    }
                    whichRow--; // Subtract 1 each iteration of the loop.
                    System.out.println("The sum of row " + (whichRow + 1) + " is: " + sumRowGiven(table, whichRow, numColumns) );
                    break;


                case 6:
                    while (true){
                        System.out.println("Which column would you like the sum of?: ");
                        try {
                            whichColumn = input.nextInt();
                            if (whichColumn > numColumns  || whichColumn <= 0){ // Exception and invalid input handling.
                                System.out.println("That is not a row.");
                                continue;
                            }else {
                                break;
                            }
                        } catch (Exception e) {
                            input.nextLine();
                            System.out.println("Letters are not allowed.");
                            continue;
                        }
                    }
                    whichColumn--; // Subtract 1 each iteration of the loop.
                    System.out.println("The sum of column " + (whichColumn + 1) + " is: " + sumColumnGiven(table, whichColumn, numRows));
                    break;

                case 7:
                    while(true){
                        System.out.println("Choose a number between 1-100 that you would like to check for in the table: ");
                        try {
                            instance = input.nextInt();
                            if (instance > 100  || instance < 1){
                                System.out.println("That is not an available number."); // Exception and invalid input handling.
                                continue;
                            }else {
                                break;
                            }
                        } catch (Exception e) {
                            input.nextLine();
                            System.out.println("Letters are not allowed.");
                            continue;
                        }
                    }
            System.out.println("The number " + instance + " appears: " + numInstance(table, instance, numRows, numColumns) + " time(s)");
                    break;

            default:
                    System.out.println("Thanks for using the program!");
                    System.exit(0);
                    break;
            }
        }
    }

    public static int sumArray (int[][] array, int rows, int columns){
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < columns; k++) { // Same loop used to define the array, but now the contents are taken and added together.
                sum += array[i][k];
            }
        }
        return sum;
    }

    public static int averageArray (int[][] array, int rows, int columns ){
        int sum = sumArray(array, rows, columns); //round
        double average = (double) sum / (rows * columns); // (double) and (int) are forms of explicit casting which I learned in hyperskill, https://hyperskill.org/learn/step/3510. Explicit casting simply turns one number type into another. In this case it turns the integer "sum" into a double.
        return (int) Math.round(average); // Turning the final answer (average) back into an integer. This allows it to be properly rounded and not simply cut off through integer division.
    }

    public static int maxArray (int[][] array, int rows, int columns){
        int greatest = 0;
        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < columns; k++) { // Uses the same loop to define the array, but now checks each number against the one before it to find the greatest.
                if (array[i][k] > greatest){
                    greatest = array[i][k];
                }
            }
        }
        return greatest;
    }

    public static int minArray (int[][] array, int rows, int columns){
        int least = array[0][0]; // I had to make it start at the first value in the array because otherwise 0 would always be the smallest number.
        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < columns; k++) { // Uses the same loop to define the array, but now checks each number against the one before it to find the least.
                if (array[i][k] < least){
                    least = array[i][k];
                }
            }
        }
        return least;
    }

    public static int sumRowGiven (int[][] array, int row, int columns){
        int sum = 0;
        for (int i = 0; i < columns; i++) {
            sum += array[row][i]; // Simply adds the values in a given row to the sum.
        }
        return sum;
    }

    public static int sumColumnGiven (int[][] array, int column, int rows){
        int sum = 0;
        for (int i = 0; i < rows; i++) { // Simply adds the values in a given column to the sum.
            sum += array[i][column];
        }
        return sum;
    }

    public static int numInstance (int[][] array, int num, int rows, int columns){
        int amount = 0;
        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < columns; k++) { // Uses the loop which defines the array, but checks if the users given number equals a number in the array, if so it adds one to amount.
                if (array[i][k] == num){
                    amount += 1;
                }
            }
        }
        return amount;
    }
}
