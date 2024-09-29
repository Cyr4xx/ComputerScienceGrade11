package CompSCi;

import java.util.*;
import java.math.*;

public class Test {
    public static void main(String[] args){
        Random generator = new Random();
        int randomValue; // Can initalize variables without defining a value. ex. you dont need an = sign
        for (int i = 1; i<= 10; i++){
            randomValue = generator.nextInt(20) + 10;
            System.out.println(randomValue);

        }

    }
}
