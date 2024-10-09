// Peter Migliore
// Tuesday, October 15
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
            switch(numOfRound) {
                case 1:
                    for (int x = 1; x < numOfRound + 1; x++){
                        dice1 = generator.nextInt(6) + 1;
                        dice2 = generator.nextInt(6) + 1;
                        valOfDie = "Round " + x + "- Dice 1: " + dice1 + " Dice 2: " + dice2;
                        sumOfDie +=  dice1 + dice2;
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

                default:
                    System.out.println("Invalid number of rounds.");
                    break;

            }

            System.out.println("Would you like to exit or roll again? (y or n): ");

            answer = input.next();
            if (answer.equals("n")){// https://stackoverflow.com/questions/8484668/java-does-not-equal-not-working This explains how we can use the "!" does not equal flag for checking strings.
                System.out.println("Thanks for using the program!");

            } else if (!answer.equals("y") && !answer.equals("n") ) {
                System.out.println("Invalid Input.");
                answer = "y";

            }
        }
    }
}
