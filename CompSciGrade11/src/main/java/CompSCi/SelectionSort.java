package CompSCi;

import java.util.*;

public class SelectionSort {
    public static int findMinimum(int[] a, int first){
        int minIndex = first;

        for (int i = first + 1; i< a.length; i++){
            if (a[i] < a[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void swap (int[] a, int x, int y){
            int temp = a[x];
            a[x] = a[y];
            a[y] = temp;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        int[] array = new int[50];
        for (int i = 0; i < 50; i++){
            array[i] = ran.nextInt(50)+1;
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length  -1 ; i++){
            int minIndex = findMinimum(array, i);
            if (minIndex != i){
                swap(array, i, minIndex);
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
