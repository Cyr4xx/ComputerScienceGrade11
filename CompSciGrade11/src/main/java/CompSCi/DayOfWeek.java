package CompSCi;

import java.util.*;

public class DayOfWeek {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What day of the week is it? ");
        String dayOfWeek = input.nextLine();
        dayOfWeek = dayOfWeek.toLowerCase();

        if (dayOfWeek.equals("sunday")){
            System.out.println("That is the first day of the week.");
        }
        if (dayOfWeek.equals("monday")){
            System.out.println("That is the second day of the week.");
        }
        if (dayOfWeek.equals("tuesday")){
            System.out.println("That is the third day of the week.");
        }
        if (dayOfWeek.equals("wednesday")){
            System.out.println("That is the fourth day of the week.");
        }
        if (dayOfWeek.equals("thursday")){
            System.out.println("That is the fifth day of the week.");
        }
        if (dayOfWeek.equals("friday")){
            System.out.println("That is the sixth day of the week.");
        }
        if (dayOfWeek.equals("saturday")){
            System.out.println("That is the seventh day of the week.");
        }
        else {
            System.out.println("Invalid Input. Check your spelling.");
        }
    }


}
