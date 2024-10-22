package CompSCi;

import java.util.*;

public class Averages3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        int sum = 0;
        int average = 0;
        for (int i = 0; i < nums.length; i++){
            System.out.println("Enter number " + (i + 1) +": ");
            nums[i] = input.nextInt();
            sum += nums[i];

        }

        System.out.println("The sum is: " + sum + "\n" + "The average is: " + sum / nums.length);

    }
}
