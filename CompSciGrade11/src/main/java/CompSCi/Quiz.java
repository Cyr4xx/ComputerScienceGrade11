package CompSCi;

import java.util.*;

public class Quiz {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("whats your name?");
        String name = input.nextLine();
        System.out.println("Whats your dob");
        int dob = input.nextInt();
        String nameME = "Peter";
        int dobMe = 2008;
        if (nameME.equals(name)){
            System.out.println("We have the same name.");
        }
        if (dob == dobMe){
            System.out.println("You are the same age as me.");
        }
        else if (dob > dobMe){
            System.out.println("You are older then me.");
        }
        else if (dob < dobMe){
            System.out.println("You are younger then me.");
        }


    }
}
