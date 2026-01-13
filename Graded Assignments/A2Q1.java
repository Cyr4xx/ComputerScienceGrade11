// Peter Migliore
// Tuesday, November 19
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

        String[] cardSuits = new String[52];
        cardSuits[0] = "Spades";
        cardSuits[1] = "Spades";
        cardSuits[2] = "Spades";
        cardSuits[3] = "Spades";
        cardSuits[4] = "Spades";
        cardSuits[5] = "Spades";
        cardSuits[6] = "Spades";
        cardSuits[7] = "Spades";
        cardSuits[8] = "Spades";
        cardSuits[9] = "Spades";
        cardSuits[10] = "Spades";
        cardSuits[11] = "Spades";
        cardSuits[12] = "Spades";
        cardSuits[13] = "Diamonds";
        cardSuits[14] = "Diamonds";
        cardSuits[15] = "Diamonds";
        cardSuits[16] = "Diamonds";
        cardSuits[17] = "Diamonds";
        cardSuits[18] = "Diamonds";
        cardSuits[19] = "Diamonds";
        cardSuits[20] = "Diamonds";
        cardSuits[21] = "Diamonds";
        cardSuits[22] = "Diamonds";
        cardSuits[23] = "Diamonds";
        cardSuits[24] = "Diamonds";
        cardSuits[25] = "Diamonds";
        cardSuits[26] = "Hearts";
        cardSuits[27] = "Hearts";
        cardSuits[28] = "Hearts";
        cardSuits[29] = "Hearts";
        cardSuits[30] = "Hearts";
        cardSuits[31] = "Hearts";
        cardSuits[32] = "Hearts";
        cardSuits[33] = "Hearts";
        cardSuits[34] = "Hearts";
        cardSuits[35] = "Hearts";
        cardSuits[36] = "Hearts";
        cardSuits[37] = "Hearts";
        cardSuits[38] = "Hearts";
        cardSuits[39] = "Clubs";
        cardSuits[40] = "Clubs";
        cardSuits[41] = "Clubs";
        cardSuits[42] = "Clubs";
        cardSuits[43] = "Clubs";
        cardSuits[44] = "Clubs";
        cardSuits[45] = "Clubs";
        cardSuits[46] = "Clubs";
        cardSuits[47] = "Clubs";
        cardSuits[48] = "Clubs";
        cardSuits[49] = "Clubs";
        cardSuits[50] = "Clubs";
        cardSuits[51] = "Clubs";

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
                    System.out.println("\nThe deck is: " + deckPrint(cardValue, cardSuits));
                    answer = -1; // Prevents a weird error that causes an error to pop up after the next loop iteration.
                    break;
                case 2:
                    System.out.println("\nThe deck is now: " + shuffle(cardValue, cardSuits));
                    answer = -1;
                    break;
                case 3:
                    while (true){
                        System.out.println("Welcome to the dealer!");
                        while (true){
                            System.out.println("Enter the number of hands you would like to draw: ");
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
                            System.out.println("Enter the number of cards you would like in each hand: ");
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
                        }else {
                            break;
                        }
                    }
                    System.out.println(dealer(numHands, numCards, cardValue, cardSuits));
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

    public static String shuffle(String[] value, String[] suit) { // https://en.wikipedia.org/wiki/Fisher–Yates_shuffle#The_modern_algorithm
        Random random = new Random();
        for (int i = value.length - 1; i >= 0; i--) { // This shuffling method is known as the Drustenfeld Shuffle, a widely accepted shuffling method for arrays. The for loop starts at the last value in the array, loops until its finished moving through the array from end to beginning by using i--.
            int ranIndex = random.nextInt(i + 1); // Generates a random number, between 0 and the list length, to pick a random card or suite in the array to switch around.

            String temporaryValue = value[i]; // Stores the current card value or suite before its switched.
            value[i] = value[ranIndex]; // Moves the random card value or suite to the where the current card value or suite is.
            value[ranIndex] = temporaryValue; // Moves the temporary value or suite of card to a random place in the array.

            String temporarySuit = suit[i]; // Repeat the same process but now for the suits. Doing both at the same time prevents duplicate cards.
            suit[i] = suit[ranIndex];
            suit[ranIndex] = temporarySuit;
        }
        return deckPrint(value, suit);
    }

    public static String dealer(int hands, int cards, String[] value, String[] suits) {
        Random random = new Random();
        String hand = ""; // Initializes variable.
        boolean[] used = new boolean[52]; // This array tracks what cards have been used with true if used and false if not used.
        String[] amount = new String[cards]; // Holds the value of each card, the length of this array is based on how many cards the user wants to draw.

        for (int i = 0; i != hands; i++) {
            int total = 0; // Resets the total after each hand.
            hand += "\nHand #" + (i + 1) + ":\n"; // States which hand this is in the final string.
            for (int j = 0; j != cards; j++) { // Iterates until it reaches the amount of cards wanted.
                int deal = 0;
                while(used[deal] == true){ // Continues the loop until reaching a card that has been used
                    deal = random.nextInt(52);
                }

                used[deal] = true; // Sets the random generated card as used in the boolean used cards array.
                amount[j] = value[deal]; // Sets amount array to card value.
                hand += value[deal] + " of " + suits[deal] +"\n"; // Adds the complete card name to the final string.

                if (j == cards -  1){
                    for (int k = 0; k != amount.length; k++){
                        if (amount[k].equals("Jack") || amount[k].equals("Queen") || amount[k].equals("King")){ // Simply checks the entire array if the card is a face, ace or number and adds the value accordingly
                            total += 10;
                        } else if (amount[k].equals("Ace")) {
                            total += 11;
                        } else {
                            total += Integer.parseInt(amount[k]); // https://stackoverflow.com/questions/5585779/how-do-i-convert-a-string-to-an-int-in-java Parse int essentially just turns a number stored as a string into an integer. Explicit data casting cannot take place between strings and numbers, unfortunately.
                        }
                    }
                    hand += "Total = " + total + "\n"; // Finally adds the total value of all the cards of a hand to the final string.
                }
            }
        }
        return hand;
    }
}
