package CompSCi;

import java.util.*;

public class IfStatement {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        if (age >= 16) {
            System.out.println("You can get your G1! ");
        }
        if (age < 16) {
            System.out.println("You are too young to drive.");
        }

    }
}
