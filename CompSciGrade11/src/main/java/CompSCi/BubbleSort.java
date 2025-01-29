package CompSCi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] a){
        int k = 0;
        Boolean exchangeMade = true;


        while ((k < a.length - 1) && exchangeMade) {
            exchangeMade = false;
            k++;
            for (int j = 0; j < a.length - k; j++){
                if (a[j] > a[j+1]){
                    swap(a, j, j + 1);
                    exchangeMade = true;
                }
            }
        }
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

        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
