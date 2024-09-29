package CompSCi;

import java.util.*;

public class Average2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int average = 0;
        int sentinel = 0;
        int numOfNums = 0;
        for (int i = 0; i != -2; i++){
            System.out.println("Enter a number to find the average/sum: ");
            sentinel = input.nextInt();
            if (sentinel == -1) {
                numOfNums += i;
                break;
            }
            else{
                average += sentinel;
            }
        }
        System.out.println("The average is: " + average / numOfNums + "\nThe sum is: " + average);


    }
}
