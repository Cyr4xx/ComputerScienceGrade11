package CompSCi;

import java.util.*;

public class Multiplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 12: ");
        int num1 = input.nextInt();
        int count = 13;

        for(int i = 0; i != count; i++){
            System.out.println(num1 + " X " + i +" = " + num1 * i);
        }

    }
}
