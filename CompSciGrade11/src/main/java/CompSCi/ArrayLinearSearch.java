package CompSCi;

import java.util.*;

public class ArrayLinearSearch {
    public static int Fortnite (int[] a, int d){
        /** int left = 0;
        int right = a.length -1;
        while (left <= right){
            int midpoint = (left + right) / 2;
            if (a[midpoint] == d){
                return midpoint;
            } else if (a[midpoint] < d) {
                left = midpoint+1;
            } else {
                right = midpoint - 1;
            }
            return -1;
**/
        for (int i = 0; i<a.length; i++){
            if (a[i] == d){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Random ran = new Random();
        Scanner input = new Scanner(System.in);
        int[] array = new int[100];
        for ( int i = 0; i < array.length; i++){
            array[i] = ran.nextInt(50)+1;
        }
        int answer = input.nextInt();


        System.out.println(Arrays.toString(array));
        System.out.println(Fortnite(array, answer));
    }
}
