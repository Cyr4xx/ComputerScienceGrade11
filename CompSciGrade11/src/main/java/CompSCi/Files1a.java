package CompSCi;

import java.io.*;
import java.util.*;

public class Files1a {
    public static void main(String[] args)throws IOException {
        PrintWriter writer = new PrintWriter("num.txt");
        Scanner input = new Scanner(System.in);
        Random ran = new Random();

        System.out.println("Enter Num: ");
        int numOfNums = input.nextInt();

        for (int i = 0; i < numOfNums; i++){
            writer.println(ran.nextInt(100)+1);
        }
        writer.close();
    }
}
