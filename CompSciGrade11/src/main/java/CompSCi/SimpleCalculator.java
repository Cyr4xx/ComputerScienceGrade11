package CompSCi;

import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Whats your first number?");
        double num1 = input.nextInt();
        System.out.println("Whats your second number?");
        double num2 = input.nextInt();
        System.out.println("The sum of both numbers is: " + (num1 + num2));
        System.out.println("The difference of both numbers is: " + (num1 - num2));
        System.out.println("The product of both numbers is: " + (num1 * num2));
        System.out.println("The quotient of both numbers is: " + (num1/num2));
        System.out.println("The modulo of both numbers is: " + (num1 % num2));
    }
}
