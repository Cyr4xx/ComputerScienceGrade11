package CompSCi;

import  java.util.*;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        double n = input.nextDouble();
        System.out.println(sequence(n));
        System.out.println(sequence(n)/n);
    }

    public static double sequence(double n) {
        if (n > 1){
            return n + sequence(n-1);
        }
        else{
            return n;
        }
    }
}
