// Peter Migliore
// Monday, February 17
// Assignment 3 - File Input and Output

package CompSCi;

import java.io.*;
import java.util.*;

public class A3Q1 {
    public static void main(String [] args) throws IOException {
        fileOutput(letterInstance(readFile("scarlet.txt")));
    }


    public static ArrayList<String> readFile (String path) throws IOException{
        ArrayList<String> array = new ArrayList<String>();
        Scanner reader = new Scanner(new File(path)); // Takes the given path to find the file that needs to be read.

        while (reader.hasNext()){ // Continues to loop while there is another string that can be read.
            array.add(reader.next().toLowerCase()); // Turns each word to lowercase to prevent the later search of each character from going wrong.
        }
        reader.close(); // Close reader to prevent corruption.
        return array;
    }

    public static ArrayList<Integer> letterInstance (ArrayList<String> arrayOfScarlet){
        ArrayList<Integer> frequencies = new ArrayList<Integer>();

        for (int i = 0; i < 26; i++) { // Initialize the frequencies ArrayList by adding 26 empty array entries. This prevents an error that takes place if you try to edit an element in an array, when that element doesn't exist.
            frequencies.add(0);
        } // The array is 26 characters long as there are 26 letters in the alphabet. This allows the arrays to correspond, (element 5 in frequencies array = 'e' in the letters array).

        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}; // Create an array with each letter of the alphabet
        for (int k = 0; k < letters.length; k++){ // Loops 26 times for each letter of the alphabet, this makes sure the frequencies array places the number in the same position as the letters array.
            for (int i = 0; i < arrayOfScarlet.size(); i++){ // Loops through each word in the scarlet array.
                for (int j = 0; j < arrayOfScarlet.get(i).length(); j++){ // Takes the length of the string at the given array position, this then allows the next line of code to move through each letter of the string.
                    if (arrayOfScarlet.get(i).charAt(j) == letters[k]){// charAt takes the character at a certain point on a string, setting this point to j loops through the entire string, this then finds a char equal to the one given.
                        frequencies.set(k, frequencies.get(k) + 1); // A chosen character is compared to each character in the selected string, if the character is found, +1 is added to the frequency array.
                    }
                }
            }
        }
        return frequencies;
    }

    public static void swapChar(char[] a, int x, int y){
        char temp = a[x];
        a[x] = a[y];
        a[y] = temp; // Swaps two elements in array, required for bubble sort.
    }

    public static void swapArrayString(ArrayList<Integer> a, int x, int y){
        int temp = a.get(x);
        a.set(x, a.get(y));
        a.set(y, temp); // Swaps two elements in ArrayList, required for bubble sorting the ArrayList.
    }

    public static void fileOutput(ArrayList<Integer> numsOfLetters){
        String[] order = new String[26];
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int k = 0; k < letters.length; k++) {
            order[k] = Character.toUpperCase(letters[k]) + " = " + numsOfLetters.get(k); // Character to upper case is a built-in method which converts a lower case character to an uppercase letter.
        }
        System.out.println(Arrays.toString(order));
        int counter = 0; // The following code is the bubble sort algorithm. Counter tracks the number of passes.
        boolean exchangeMode = true; // Checks if swap was made.
        while (exchangeMode && counter < 26){ // While exchanges can still be made.
            exchangeMode = false;
            counter++;
            for (int i = 0; i < 25; i++){ // Iterates through the array to compare elements.
                if (numsOfLetters.get(i) > numsOfLetters.get(i+1)){ // Checks if two elements are in order.
                    swapArrayString(numsOfLetters, i, i+1 ); // Sorts both arrays based off of the numsOfLetters array, this forces the letters array to correspond with the numsOfLetters array.
                    swapChar(letters, i, i+1 );
                    exchangeMode = true;
                } // If no more exchanges need to be made, exits early.
            }
        }
        for (int l = 0; l < letters.length; l++) {
            letters[l] = Character.toUpperCase(letters[l]); // Turns each letter in the letters array to upper case, this is for visual purposes.
        }
        System.out.println("Top 5 letters:\n" + letters[25] + " = " + numsOfLetters.get(25) + "\n" + letters[24] + " = " + numsOfLetters.get(24) + "\n" + letters[23] + " = " + numsOfLetters.get(23) + "\n" + letters[22] + " = " + numsOfLetters.get(22) + "\n" + letters[21] + " = " + numsOfLetters.get(21) + "\n" );
        System.out.println("Bottom 5 letters:\n" + letters[4] + " = " + numsOfLetters.get(4) + "\n" + letters[3] + " = " + numsOfLetters.get(3) + "\n" + letters[2] + " = " + numsOfLetters.get(2) + "\n" + letters[1] + " = " + numsOfLetters.get(1) + "\n" + letters[0] + " = " + numsOfLetters.get(0) + "\n" );
    }
}
