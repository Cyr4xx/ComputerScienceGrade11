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
        System.out.println("How many rounds of two-dice would you like to roll? (Please pick a number from 1 - 5): ");
        int numOfRound = input.nextInt();
        int sumOfDie = 0;
        String valOfDie = "";
        int dice1 = 0;
        int dice2 = 0;

        while(true){
            switch(numOfRound) {
                case 1:
                    for (int x = 0; x < numOfRound; x++){
                        dice1 = generator.nextInt(6);
                        dice2 = generator.nextInt(6);
                        valOfDie += " " + dice1 + " " + dice2;
                        sumOfDie +=  dice1 + dice2;
                    }
                    break;

                case 2:
                    for (int x = 0; x < numOfRound; x++){
                        dice1 = generator.nextInt(6);
                        dice2 = generator.nextInt(6);
                        valOfDie += " " + dice1 + " " + dice2;
                        sumOfDie +=  dice1 + dice2;
                    }

                    break;
                case 3:
                    for (int x = 0; x < numOfRound; x++){
                        dice1 = generator.nextInt(6);
                        dice2 = generator.nextInt(6);
                        valOfDie += " " + dice1 + " " + dice2;
                        sumOfDie +=  dice1 + dice2;
                    }

                    break;

                case 4:
                    for (int x = 1; x < numOfRound + 1; x++){
                        dice1 = generator.nextInt(6);
                        dice2 = generator.nextInt(6);
                        valOfDie = " Round " + x + " " + dice1 + " " + dice2;
                        sumOfDie +=  dice1 + dice2;
                        System.out.println(valOfDie);
                    }
                    System.out.println("The sum is " + sumOfDie);
                    break;
                case 5:
                    for (int x = 0; x < numOfRound; x++){
                        dice1 = generator.nextInt(6);
                        dice2 = generator.nextInt(6);
                        valOfDie += " " + dice1 + " " + dice2;
                        sumOfDie +=  dice1 + dice2;
                    }

                    break;
                default:
                    System.out.println("Invalid number of rounds.");
                    System.exit(0);

            }
            break;
        }



    }
}
