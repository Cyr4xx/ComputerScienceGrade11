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
        double num1 = 0; // Initializes first and second number outside the loop.
        double num2 = 0;
        String operation = ""; // Initializes the operation and exit variables outside the loop.
        String answer = "y";
        do{
            System.out.println("Please enter your first integer: ");
            num1 = input.nextInt();
            System.out.println("Please enter your second integer: ");
            num2 = input.nextInt();
            System.out.println("What math operation would you like to perform? +, -, /, *(multiplication), or ^(to the power of): ");
            operation = input.next();
            switch (operation){
                case "+":
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case "-":
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case "/":
                    System.out.println( num1 + " / " + num2 + " = " + (num1 / num2));
                    break;
                case "*":
                    System.out.println( num1 + " X " + num2 + " = " + (num1 * num2));
                    break;
                case "^":
                    System.out.println( num1 + " ^ " + num2 + " = " + (Math.pow(num1, num2)));
                    break;
                default:
                    System.out.println("Invalid input. This program only accepts the operations: +, -, /, *, or ^");
                    continue;
            }
            System.out.println("Would you like to quit the program? ( q ): ");
            answer = input.next();
            if (answer.equals("q")){
                System.out.println("Thanks for using the program.");
                break;
            }
        }while (!answer.equals("q"));

    }

}
// comments
// Start program with option to quit
// user input needs to be integers
// check your calculations properly
// use a do while loop
// use switch statmenet
// Must be java file
