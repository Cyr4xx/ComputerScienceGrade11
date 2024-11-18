// Peter Migliore
// Thursday, November 7
// Assignment 3 - Arrays
package CompSCi;

import java.util.*;

public class A2Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the super advanced ultimate card shuffling program!");
        int answer = -1;
        int numHands = 0;
        int numCards = 0;

        String[] cardSuites = new String[52];
        cardSuites[0] = "Spades";
        cardSuites[1] = "Spades";
        cardSuites[2] = "Spades";
        cardSuites[3] = "Spades";
        cardSuites[4] = "Spades";
        cardSuites[5] = "Spades";
        cardSuites[6] = "Spades";
        cardSuites[7] = "Spades";
        cardSuites[8] = "Spades";
        cardSuites[9] = "Spades";
        cardSuites[10] = "Spades";
        cardSuites[11] = "Spades";
        cardSuites[12] = "Spades";
        cardSuites[13] = "Diamonds";
        cardSuites[14] = "Diamonds";
        cardSuites[15] = "Diamonds";
        cardSuites[16] = "Diamonds";
        cardSuites[17] = "Diamonds";
        cardSuites[18] = "Diamonds";
        cardSuites[19] = "Diamonds";
        cardSuites[20] = "Diamonds";
        cardSuites[21] = "Diamonds";
        cardSuites[22] = "Diamonds";
        cardSuites[23] = "Diamonds";
        cardSuites[24] = "Diamonds";
        cardSuites[25] = "Diamonds";
        cardSuites[26] = "Hearts";
        cardSuites[27] = "Hearts";
        cardSuites[28] = "Hearts";
        cardSuites[29] = "Hearts";
        cardSuites[30] = "Hearts";
        cardSuites[31] = "Hearts";
        cardSuites[32] = "Hearts";
        cardSuites[33] = "Hearts";
        cardSuites[34] = "Hearts";
        cardSuites[35] = "Hearts";
        cardSuites[36] = "Hearts";
        cardSuites[37] = "Hearts";
        cardSuites[38] = "Hearts";
        cardSuites[39] = "Clubs";
        cardSuites[40] = "Clubs";
        cardSuites[41] = "Clubs";
        cardSuites[42] = "Clubs";
        cardSuites[43] = "Clubs";
        cardSuites[44] = "Clubs";
        cardSuites[45] = "Clubs";
        cardSuites[46] = "Clubs";
        cardSuites[47] = "Clubs";
        cardSuites[48] = "Clubs";
        cardSuites[49] = "Clubs";
        cardSuites[50] = "Clubs";
        cardSuites[51] = "Clubs";

        String[] cardValue = new String[52];
        cardValue[0] = "2";
        cardValue[1] = "3";
        cardValue[2] = "4";
        cardValue[3] = "5";
        cardValue[4] = "6";
        cardValue[5] = "7";
        cardValue[6] = "8";
        cardValue[7] = "9";
        cardValue[8] = "10";
        cardValue[9] = "Jack";
        cardValue[10] = "Queen";
        cardValue[11] = "King";
        cardValue[12] = "Ace";
        cardValue[13] = "2";
        cardValue[14] = "3";
        cardValue[15] = "4";
        cardValue[16] = "5";
        cardValue[17] = "6";
        cardValue[18] = "7";
        cardValue[19] = "8";
        cardValue[20] = "9";
        cardValue[21] = "10";
        cardValue[22] = "Jack";
        cardValue[23] = "Queen";
        cardValue[24] = "King";
        cardValue[25] = "Ace";
        cardValue[26] = "2";
        cardValue[27] = "3";
        cardValue[28] = "4";
        cardValue[29] = "5";
        cardValue[30] = "6";
        cardValue[31] = "7";
        cardValue[32] = "8";
        cardValue[33] = "9";
        cardValue[34] = "10";
        cardValue[35] = "Jack";
        cardValue[36] = "Queen";
        cardValue[37] = "King";
        cardValue[38] = "Ace";
        cardValue[39] = "2";
        cardValue[40] = "3";
        cardValue[41] = "4";
        cardValue[42] = "5";
        cardValue[43] = "6";
        cardValue[44] = "7";
        cardValue[45] = "8";
        cardValue[46] = "9";
        cardValue[47] = "10";
        cardValue[48] = "Jack";
        cardValue[49] = "Queen";
        cardValue[50] = "King";
        cardValue[51] = "Ace";



        while (true) {
            System.out.println("Main Menu: Ultimate Card Shuffler");
            System.out.println("*Note - Enter the exit number at anytime to quit.");
            System.out.println("1. Print out the deck of 52 \n2. Shuffle the deck \n3. Hand Dealer \n0. Exit");
            System.out.println("Select a number: ");

            try {
                answer = input.nextInt();
            } catch (Exception e) {
                input.nextLine();
                System.out.println("Letters are not allowed.");
                continue;
            }


            switch (answer) {
                case 1:
                    System.out.println("\nThe deck is: " + deckPrint(cardValue, cardSuites));
                    answer = -1;
                    break;
                case 2:
                    System.out.println("\nThe deck is now: " + shuffle(cardValue, cardSuites));
                    answer = -1;
                    break;
                case 3:
                    System.out.println("Welcome to the dealer!");
                    while (true){
                        System.out.println("Enter the number of hands you would like to draw: "); //put this into its own loop
                        try {
                            numHands = input.nextInt();
                            if (numHands <= 0) {
                                System.out.println("Invalid input."); // If input is less then or equal to 0, returns an error.
                                continue;
                            }if (numHands >= 53){
                                System.out.println("Not enough cards in a deck.");
                            }else {
                                break;
                            }
                        } catch (Exception e) {
                            input.nextLine();
                            System.out.println("That is not an integer."); // If a letter is entered its caught by this exception handler.
                            continue;
                        }
                    }

                    while (true){
                        System.out.println("Enter the number of cards you would like in each hand: "); //put this into its own loop
                        try {
                            numCards = input.nextInt();
                            if (numCards <= 0) {
                                System.out.println("No negative integers or zero.");
                                continue;
                            }
                            if (numCards >= 53){
                                System.out.println("Not enough cards in a deck.");
                                continue;
                            }else {
                                break;
                            }
                        } catch (Exception e) {
                            input.nextLine();
                            System.out.println("That is not an integer.");
                            continue;
                        }

                    }
                    if (numHands * numCards >= 53){
                        System.out.println("Not enough cards in a deck.");
                        continue;
                    }
                    System.out.println(dealer(numHands, numCards, cardValue, cardSuites));
                    answer = -1;
                    break;
                case 0:
                    System.out.println("Thanks for using the program!");
                    System.exit(0);
                default:
                    System.out.println("That is not an available answer.");
                    break;
            }
            System.out.println("\n"); // Helps the menu look nicer.
        }
    }

    public static String deckPrint(String[] value, String[] suite) {
        String deck = "";
        for (int i = 0; i < 52; i++) {
            deck += value[i] + " of " + suite[i] + " | "; // Uses += to turn the two arrays into a long list.
        }
        return deck;
    }

    public static String shuffle(String[] value, String[] suite) { // https://en.wikipedia.org/wiki/Fisher–Yates_shuffle#The_modern_algorithm
        Random random = new Random();
        for (int i = value.length - 1; i >= 0; i--) { // This shuffling method is known as the Drustenfeld Shuffle, a widely accepted shuffling method for arrays. The for loop starts at the last value in the array, loops until its finished moving through the array from end to beginning by using i--.
            int ranIndex = random.nextInt(i + 1); // Generates a random number, between 0 and the list length, to pick a random card or suite in the array to switch around.

            String temporaryValue = value[i]; // Stores the current card value or suite before its switched.
            value[i] = value[ranIndex]; // Moves the random card value or suite to the where the current card value or suite is.
            value[ranIndex] = temporaryValue; // Moves the temporary value or suite of card to a random place in the array.

            String temporarySuite = suite[i]; // Repeat the same process but now for the suites. Doing both at the same time prevents duplicate cards.
            suite[i] = suite[ranIndex];
            suite[ranIndex] = temporarySuite;
        }
        return deckPrint(value, suite);
    }

    public static String dealer(int hands, int cards, String[] value, String[] suites) {
        Random random = new Random();
        String hand = ""; // Initializes variable.
        boolean[] used = new boolean[52];
        String[] amount = new String[cards];

        for (int i = 0; i != hands; i++) {
            int total = 0; // Resets the total after each hand.
            hand += "\nHand #" + (i + 1) + ":\n";
            for (int j = 0; j != cards; j++) { // Iterates until it reaches the amount of cards wanted.
                int deal = 0;
                while(used[deal] == true){
                    deal = random.nextInt(52);
                }

                used[deal] = true;
                amount[j] = value[deal];
                hand += value[deal] + " of " + suites[deal] +"\n";

                if (j == cards -  1){
                    for (int k = 0; k != amount.length; k++){
                        if (amount[k].equals("Jack") || amount[k].equals("Queen") || amount[k].equals("King")){
                            total += 10;
                        } else if (amount[k].equals("Ace")) {
                            total += 11;
                        } else {
                            total += Integer.parseInt(amount[k]); // https://stackoverflow.com/questions/5585779/how-do-i-convert-a-string-to-an-int-in-java Parse int essentially just turns a number stored as a string into an integer.
                        }
                    }
                    hand += "Total = " + total + "\n";
                }
            }
        }
        return hand;
    }
}
