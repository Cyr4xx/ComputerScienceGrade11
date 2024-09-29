package CompSCi;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Number greater then zero: ");
        int num = input.nextInt();
        while (num != 1){
            System.out.println(num -= 1);
        }
    }

}
