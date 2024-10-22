package CompSCi;

import java.math.*;
import java.util.*;

public class FindMin {
    public static int getMin(int num1, int num2, int num3){
        int min = 0;
        if (num1 < num2 && num1 < num3){
            min = num1;
        } else if (num2 < num1 && num2 < num3){
            min = num2;
        }else {
            min = num3;
        }
        return min;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        while(true){
            System.out.println("Enter each number");
            num1 = input.nextInt();
            num2 = input.nextInt();
            num3 = input.nextInt();
            if (num1 <= 0 || num2 <= 0 || num3 <=0){
                System.out.println("Error, no zero or less");
                continue;
            }
            System.out.println(getMin(num1, num2, num3));
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
