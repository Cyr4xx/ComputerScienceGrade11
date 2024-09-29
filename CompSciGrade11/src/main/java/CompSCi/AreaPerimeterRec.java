package CompSCi;

import java.util.*;

public class AreaPerimeterRec {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Whats the length?: ");
        int length = input.nextInt();
        System.out.println("Whats the width?: ");
        int width = input.nextInt();
        if (length > 0 && width > 0){
            System.out.println("The perimeter of the rectangle: " + (2 * length + 2 * width));
            System.out.println("The area of the rectangle: " + (length * width));
        }
        else {
            System.out.println("No negative numbers or zero.");
            System.exit(0);
        }


    }
}
