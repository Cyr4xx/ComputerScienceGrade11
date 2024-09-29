package CompSCi;

import java.util.Scanner;

public class Words3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String word = "";
        String sentence = "";
        while(true){
            System.out.println("Enter words: ");
            word = input.nextLine();
            if (word.equals("exit")){
                break;
            }
            else{
                sentence += word + " ";

            }

        }
        System.out.println(sentence);
    }
}
