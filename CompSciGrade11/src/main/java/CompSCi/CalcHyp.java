package CompSCi;

import java.util.*;
import java.math.*;

public class CalcHyp {
    public static double getHyp(double side1, double side2){
        double hyp = Math.pow(side1, 2) + Math.pow(side2, 2) ;
        hyp = Math.sqrt(hyp);
        return hyp;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double a = 0;
        double b = 0;
        while (true){
            System.out.println("Enter first side length: ");
            a = input.nextDouble();
            System.out.println("Enter second side length: ");
            b = input.nextDouble();
            if (a <= 0 || b <= 0){
                System.out.println("Invalid input");
                continue;
            }
            System.out.println(getHyp(a, b));
            System.out.println("COntinue?");
            String con = input.next();
            if (con.equals("no")){
                break;
            }
            else {
                continue;
            }



        }
    }










}
    /*public static void greeting(){
        System.out.println("Hellow world!");
        System.out.println("HOw are you doing");
        System.out.println("I am doing great");
    }
    public static void main(String[] args){
        greeting();

    }
}
    /*public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num1 = 5;
        int num2 = 6;
        int num5 = 7;
        System.out.println(getAverage(num1, num2, num5));

    }

    public static double getAverage(int mark1, int mark2, int mark3){
        double avg = 0.0;
        avg = (mark1 + mark2 + mark3)/3;
        return avg;
    }
}
*/