package CompSCi;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        String sentence = "";
        while (counter != 5) {
            String words = input.nextLine(); // Must define the variable before putting in loop.
            counter ++;
            sentence = sentence + " " + words; // Must define the variable before putting in loop.
        }
        System.out.println(sentence);

    }
}
