package CompSCi;

import java.util.*;

public class Names {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++){
            System.out.println("Enter name " + (i+1) + ": ");
            names[i] += input.next();


        }
        System.out.println(Arrays.deepToString(names)); // https://stackoverflow.com/questions/409784/whats-the-simplest-way-to-print-a-java-array
    }
}
