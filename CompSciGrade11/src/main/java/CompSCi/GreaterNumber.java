package CompSCi;

import java.util.*;

public class GreaterNumber {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number: ");
        double num1 = input.nextDouble();
        System.out.println("Please enter your second number: ");
        double num2 = input.nextDouble();
        System.out.println("Please enter your third number: ");
        double num3 = input.nextDouble();

        if (num1 > num2 && num1 > num3){
            System.out.println(num1 + " is the greatest!");
        }
        else if (num1 < num2 && num3 < num2){
            System.out.println(num2 + " is greatest!");
        }
        else if (num3 > num2 && num3 > num1){
            System.out.println(num3 + "is the greatest!");
        }
    }
}
