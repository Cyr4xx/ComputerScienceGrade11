package CompSCi;

import java.util.*;

public class DriversLicense {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What's your license expiry? ");
        String expiry = input.nextLine();
        System.out.println("What's your address?");
        String address = input.nextLine();
        System.out.println("What's your sex?");
        String sex = input.nextLine();
        System.out.println("What's your date of birth?");
        String dob = input.nextLine();
        System.out.println("What's your name?");
        String name = input.nextLine();

        System.out.println(name + "\n" + dob + "\n" + expiry + "\n" + address + "\n" + sex);




    }

}
