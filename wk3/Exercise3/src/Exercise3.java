/*
 * Course: CS1110
 * Loop Exercise
 * Kaiden Pollesch
 * Fall 2023
 */

import java.util.Scanner;

/**
 * This class will count the number of vowels (a, e, i, o, u)
 * in a given word and display the result. It will do this
 * three times, using a different type of loop each time
 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        do {
            System.out.print("Enter a word of at least 3 letters in all lower case, or 'q' to quit: ");
            String word = in.nextLine();
            if(word.equalsIgnoreCase("q")) {
                done = true;
            }
            if(word.length() >= 3) {
                int vowels = 0;
                // TODO: for loop
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                        vowels++;
                    }
                }
                System.out.println("This word has " + vowels + " vowels.");
                // TODO: while loop
                int i = 0;
                while (i < word.length()) {
                    if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                        vowels++;
                        i++;
                    }
                }
                // TODO: do-while loop
                i = 0;
                vowels = 0;
                do {
                    if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                        vowels++;
                    }
                    i++;
                } while (i < word.length());


            }
        } while(!done);
        System.out.println("Exiting...");
    }

    private static String report(String word, int vowels) {
        // TODO: print out the results like this -> for the word Penguin, "Penguin contains 3 vowels."
     return " for the word " + word + word + " contains " + vowels + "vowels";
    }

    private static boolean isVowel(char c) {
        // TODO: return true if the character is an a, e, i, o, or u
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
          return true;
      }else{
          return false;
      }
    }
}


