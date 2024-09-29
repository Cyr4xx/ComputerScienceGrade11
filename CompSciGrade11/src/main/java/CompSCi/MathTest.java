package CompSCi;

import java.util.*;
import java.math.*;

public class MathTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first positive value: ");
        int num1 = input.nextInt();
        System.out.println("Enter second positive value: ");
        int num2 = input.nextInt();
        if (num1 <= 0 || num2 <= 0){
            System.out.println("Invalid input.");
            System.exit(0);
        }
        System.out.println("The max between the two numbers is: " + Math.max(num1, num2));
        System.out.println("The minimum between the two numbers is: " + Math.min(num1, num2));
        System.out.println("The exponential value is: " + Math.pow(num1, num2));
        System.out.println("The square root of the first number is: " + Math.sqrt(num1));
        System.out.println("The square root of the second number is: " + Math.sqrt(num2));




    }
}
