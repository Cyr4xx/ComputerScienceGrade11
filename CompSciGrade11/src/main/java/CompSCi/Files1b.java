package CompSCi;

import java.io.*;
import java.util.*;

public class Files1b {
    public static void main(String[] args) throws IOException{
        Scanner reader = new Scanner(new File("num.txt"));

        int count = 0;
        int sum = 0;

        while (reader.hasNext()){
            sum += reader.nextInt();
            count++;
        }
        reader.close();

        Scanner reader2 = new Scanner(new File("num.txt"));
        String concat = "";

        while (reader2.hasNext()){
            concat += reader2.nextLine() + " ";
        }
        System.out.println("The are " + count + " numbers and the sum is: " + sum);
        System.out.println(concat);
    }

}
