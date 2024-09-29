package CompSCi;

import java.util.*;

public class Average {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers to add? ");
        double numOfNums = input.nextInt();
        double num = 0;
        if (numOfNums <=0){
            System.out.println("Error invalid nums. ");
        }
        for (double i = 0; i != numOfNums; i++){
            System.out.println("Enter a number: ");
            num = num + input.nextDouble();


        }
        double average = num / numOfNums;
        System.out.println("The sum is: " + num + "\nThe average is: " + average);




    }
}
