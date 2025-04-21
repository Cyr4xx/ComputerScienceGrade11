package CompSCi;

import java.io.*;
import java.util.*;

public class SumCalc {
    public static void main(String[] args) throws IOException{
        Scanner reader = new Scanner(new File("dataset_91033.txt"));
        int sum = 0;
        while (reader.hasNext()){
            sum += Integer.parseInt(reader.next());
        }
        System.out.println(sum);
    }
}
