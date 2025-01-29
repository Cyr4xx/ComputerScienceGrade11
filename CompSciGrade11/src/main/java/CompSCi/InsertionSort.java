package CompSCi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] a) {
        int itemToInsert;
        int index;
        boolean stillLooking;

        for (int k = 1; k < a.length; k++) {
            itemToInsert = a[k];
            index = k - 1;
            stillLooking = true;

            while ((index >= 0) && stillLooking) {
                if (itemToInsert < a[index]) {
                    a[index + 1] = a[index];
                    index--;
                } else {
                    stillLooking = false;
                }
                a[index + 1] = itemToInsert;
            }
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        int[] array = new int[50];
        for (int i = 0; i < 50; i++){
            array[i] = ran.nextInt(50)+1;
        }
        System.out.println(Arrays.toString(array));

        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
