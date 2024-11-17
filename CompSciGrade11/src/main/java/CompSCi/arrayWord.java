package CompSCi;

import java.util.*;

public class arrayWord {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word: ");
        String word1 = input.next();
        list.add(word1);

        System.out.println("Enter second word: ");
        String word2 = input.next();
        list.add(word2);

        System.out.println("Enter third word: ");
        String word3 = input.next();
        list.add(word3);

        System.out.println("Enter fourth word: ");
        String word4 = input.next();
        list.add(word4);

        System.out.println("Enter fifth word: ");
        String word5 = input.next();
        list.add(word5);

        System.out.println(list);

        System.out.println("Please enter the maximum word length: ");
        int maxLength = input.nextInt();

        if (word1.length() > maxLength ){
            list.remove(word1);
        }if (word2.length() > maxLength) {
            list.remove(word2);
        }if (word3.length() > maxLength) {
            list.remove(word3);
        }if (word4.length() > maxLength) {
            list.remove(word4);
        }if (word5.length() > maxLength) {
            list.remove(word5);
        }
        System.out.println("The updated array list is: " + list);
    }
}
