// Peter Migliore
// Friday, October 11
// A1Q2 Do-While/Switch
package CompSCi;

import java.util.*;
import java.math.*;

public class A1Q2 {
    public static void main(String[] args){
        System.out.println("Welcome to the Super Advanced Calculator Program©");
        Scanner input = new Scanner(System.in);
        int num1 = 0; // Initializes first and second number outside of the loop.
        int num2 = 0;
        String operation = ""; // Initializes the operation and exit variables outside of the loop.
        String answer = "y";
        do{
            System.out.println("Please enter your first integer: ");
            num1 = input.nextInt();
            System.out.println("Please enter your second integer: ");
            num2 = input.nextInt();
            System.out.println("What math operation would you like to perform?: ");
            operation = input.next();
            switch (operation){
                case "+":
                    System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("The difference of " + num1 + " and " + num2 + " is " + (num1 - num2));
                    break;
                case "/":
                    System.out.println("The quotient of " + num1 + " and " + num2 + " is " + (num1 / num2));
                    break;
                case "*":
                    System.out.println("The product of " + num1 + " and " + num2 + " is " + (num1 * num2));
                    break;
                case "^":
                    System.out.println( num1 + " to the power of " + num2 + " is " + (Math.pow(num1, num2)));
                    break;
                default:
                    System.out.println("Invalid input. This program only accepts the operations: +, -, /, *, or ^");
                    break;
            }
            System.out.println("Would you like to continue using the program? (y or n): ");
            answer = input.next();
            if (answer.equals("n")){
                System.out.println("Thanks for using the program.");
                break;
            }
        }while (answer.equals("y"));

    }

}
