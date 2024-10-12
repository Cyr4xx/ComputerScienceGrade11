// Peter Migliore
// Friday, October 11
// A1Q1 Do-While/Switch
package CompSCi;

import java.util.*;

public class A1Q1 {
    public static void main(String[] args){
        System.out.println("Welcome to the Double Dice Rolling Simulator!");
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        int numOfRound = 0;
        int sumOfDie = 0;
        String valOfDie = "";
        int dice1 = 0;
        int dice2 = 0;
        String answer = "y";

        while(answer.equals("y")){
            System.out.println("How many rounds of two-dice would you like to roll? (Please pick a number from 1 - 5): ");
            numOfRound = input.nextInt();
            if (numOfRound > 5 || numOfRound < 1){
                System.out.println("Invalid Input.");
                continue;

            }
            switch(numOfRound) {
                case 1:
                    for (int x = 1; x < numOfRound + 1; x++){ // Iderates the for-loop based on the amount of rounds the user chose.
                        dice1 = generator.nextInt(6) + 1; // Runs the random number calculator for both die, +1 makes the generator count from 1 instead of 0.
                        dice2 = generator.nextInt(6) + 1;
                        valOfDie = "Round " + x + "- Dice 1: " + dice1 + " Dice 2: " + dice2; // Prints the value of each dice roll.
                        sumOfDie +=  dice1 + dice2; // Adds up the dice roll.
                        System.out.println(valOfDie);
                    }
                    System.out.println("The sum is " + sumOfDie);
                    break;

                case 2:
                    for (int x = 1; x < numOfRound + 1; x++){
                        dice1 = generator.nextInt(6) + 1;
                        dice2 = generator.nextInt(6) + 1;
                        valOfDie = "Round " + x + "- Dice 1: " + dice1 + " Dice 2: " + dice2;
                        sumOfDie +=  dice1 + dice2;
                        System.out.println(valOfDie);
                    }
                    System.out.println("The sum is " + sumOfDie);
                    break;

                case 3:
                    for (int x = 1; x < numOfRound + 1; x++){
                        dice1 = generator.nextInt(6) + 1;
                        dice2 = generator.nextInt(6) + 1;
                        valOfDie = "Round " + x + "- Dice 1: " + dice1 + " Dice 2: " + dice2;
                        sumOfDie +=  dice1 + dice2;
                        System.out.println(valOfDie);
                    }
                    System.out.println("The sum is " + sumOfDie);
                    break;

                case 4:
                    for (int x = 1; x < numOfRound + 1; x++){
                        dice1 = generator.nextInt(6) + 1;
                        dice2 = generator.nextInt(6) + 1;
                        valOfDie = "Round " + x + "- Dice 1: " + dice1 + " Dice 2: " + dice2;
                        sumOfDie +=  dice1 + dice2;
                        System.out.println(valOfDie);
                    }
                    System.out.println("The sum is " + sumOfDie);
                    break;

                case 5:
                    for (int x = 1; x < numOfRound + 1; x++){
                        dice1 = generator.nextInt(6) + 1;
                        dice2 = generator.nextInt(6) + 1;
                        valOfDie = "Round " + x + "- Dice 1: " + dice1 + " Dice 2: " + dice2;
                        sumOfDie +=  dice1 + dice2;
                        System.out.println(valOfDie);
                    }
                    System.out.println("The sum is " + sumOfDie);
                    break;

            }
            while(true){
                System.out.println("Would you like to exit or roll again? (y or n): ");
                answer = input.next();
                if (answer.equals("n")){ // Checks if the users input equals n or y or something else and runs the according code.
                    System.out.println("Thanks for using the program!");
                    break;
                } else if (!answer.equals("y") && !answer.equals("n") ) { // https://stackoverflow.com/questions/8484668/java-does-not-equal-not-working This explains how we can use the "!" does not equal flag for checking strings.
                    System.out.println("Invalid Input.");
                    answer = "y";
                } else if (answer.equals("y")) {
                    break;
                }
            }
        }
    }
}
