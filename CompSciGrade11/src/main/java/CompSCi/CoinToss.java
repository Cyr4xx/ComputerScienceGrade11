package CompSCi;

import java.util.*;

public class CoinToss {
    public static void main(String[] args){
        Random generator = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("How many times would you like to flip a coin?: ");
        int amount = input.nextInt();
        int flip = 0;
        int tail = 0;
        int head = 0;
        for (int i = 0; i < amount; i++){
            flip = generator.nextInt(2)+1;
            System.out.println(flip);
            if (flip == 1){
                head += 1;
            }
            else if (flip == 2){
                tail += 1;
            }
        }
        System.out.print("You flipped heads: " + head + " times and flipped tails " + tail + " times");
    }
}
