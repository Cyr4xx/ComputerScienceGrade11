package CompSCi;

import java.util.*;

public class CheckSign {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a Number: ");
        double number = input.nextDouble();

        if (number >= 0) {
            System.out.println("Your number is positive!");
        }
        else if (number < 0) {
            System.out.println("Your number is negative.");
        }


    }
}
