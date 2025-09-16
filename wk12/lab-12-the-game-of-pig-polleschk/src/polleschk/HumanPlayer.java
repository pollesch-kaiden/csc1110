/*
 * Course: CSC1110 - 171
 * Fall 2023
 * Lab 12 - The Game of Pig
 * Name: Kaiden Pollesch
 * Created: 11/15/2023
 */
package polleschk;

import java.util.Scanner;

/**
 * HumanPlayer Class that extends Player
 */
public class HumanPlayer extends Player {
    private final Scanner in;

    /**
     * Public constructor HumanPlayer
     * @param name set name to the name of the current player
     * @param in the user input
     */
    public HumanPlayer(String name, Scanner in) {
        super(name);
        this.in = in;
    }

    @Override
    public boolean chooseToHold(int turnScore) {
        boolean invalidAnswer = false;
        boolean shouldHold = true;
        do {
            if (in.nextLine().equalsIgnoreCase("y")) {
                shouldHold = true;
            } else if (in.nextLine().equalsIgnoreCase("n")) {
                shouldHold = false;
            } else {
                System.out.println("Please only enter 'y' or 'n'");
                invalidAnswer = true;
            }
        } while (invalidAnswer);
        return shouldHold;
    }
}
