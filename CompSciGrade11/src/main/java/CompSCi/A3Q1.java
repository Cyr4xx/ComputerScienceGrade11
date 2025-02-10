package CompSCi;

import java.io.*;
import java.util.*;

public class A3Q1 {
    public static void main(String [] args) {


    }


    public static ArrayList<String> readFile (String words) throws IOException{
        ArrayList<String> array = new ArrayList<String>();
        Scanner reader = new Scanner(new File("scarlet.txt"));

        while (reader.hasNext()){
            array.add(reader.next());
        }
        reader.close();
        return array;
    }
    public static int letterInstance (char letter, ArrayList<String> array){
        for (int i = 0; i < array.len)
    }
}
