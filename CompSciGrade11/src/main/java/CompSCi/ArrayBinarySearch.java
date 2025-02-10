package CompSCi;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class ArrayBinarySearch {
    public static int Fortnite (String[] a, String d) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int midpoint = (left + right) / 2;
            int result = (a[midpoint].compareToIgnoreCase(d));
            if (result == 0) {
                return midpoint ;
            } else if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }

        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(new File("words.txt"));
        Scanner input = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<String>();


        while (reader.hasNext()){
            list.add(reader.next());
        }
        reader.close();
        String[] wordss = list.toArray(new String[0]);
        String word = input.next();
        Arrays.sort(wordss);
        System.out.println(Fortnite(wordss, word));
    }
}
