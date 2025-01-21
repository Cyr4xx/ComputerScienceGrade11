package CompSCi;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);

        // Input number
        int n = scanner.nextInt();

        // Start a loop from 1 to n (inclusive)
        for (int i = 1; i <= n; i++) {

            if (i % 5 == 0) {
                continue;
            }
            if (i % 7 == 0) {
                System.out.println(i + ": stopped");
            } else {
                System.out.println(i);
            }
        }
    }

}
