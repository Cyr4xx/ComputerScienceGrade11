package CompSCi;

import java.util.*;
import java.math.*;

public class LargestValue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] nums = new int[15];
        for (int i = 0; i < nums.length; i++){
            System.out.println("Enter num " + (i+1) + ": ");
            nums[i] = input.nextInt();
        }
        int max = nums[0]; // https://www.geeksforgeeks.org/java-program-for-program-to-find-largest-element-in-an-array/
        for (int i = 1; i < nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
            }

        }
        System.out.println("The greatest number is: " + max);

    }
}
