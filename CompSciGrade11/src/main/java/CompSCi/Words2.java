package CompSCi;

import java.util.Scanner;

public class Words2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String word = "";
        String sentence = "";
        System.out.println("How many words do you want to enter?");
        int numOfWord = input.nextInt();
        if (numOfWord <= 0){
            System.out.println("Incorrect input.");
            System.exit(0);
        }
        for (int i = -1; i != numOfWord; i++){
            System.out.print("Enter word: ");
            word = input.nextLine();
            sentence += word + " ";

        }
        System.out.println(sentence);


    }
}
