package CompSCi;

import java.util.*;

public class ScannerClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Whats yo name?");
        String name = input.next();

        System.out.println("What is yo age?");
        int age = input.nextInt();

        System.out.println("hi " + name + "! Nice to meet ya!");


    }
}
