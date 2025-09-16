/*
 * Course: CSC1110 - 171
 * Fall 2023
 * Lab 12 - The Game of Pig
 * Name: Kaiden Pollesch
 * Created: 11/15/2023
 */
package polleschk;

import java.util.Random;

/**
 * Die class
 */
public class Die {
    private static final int MIN_SIDES = 2;
    private static final int MAX_SIDES = 100;
    private static final int DEFAULT_SIDES = 6;
    private static final Random GENERATOR = new Random();
    private int numSides;
    private int currentValue;

    /**
     * constructor for Die class no parameters
     */

    public Die() {
        numSides = DEFAULT_SIDES;
        roll();
    }

    /**
     * Second constructor for the Die class that has a parameter
     * @param numSides is the number of sides on the die.
     */
    public Die(int numSides) {
        if (numSides > MIN_SIDES && numSides < MAX_SIDES) {
            this.numSides = numSides;
            currentValue = 0;
            roll();
        }
    }
    public int getSideUp(){
        return currentValue;
    }

    /**
     * Rolls the dice and sets the new current value to it.
     */
    public void roll(){
        currentValue = GENERATOR.nextInt(1, numSides + 1);
    }
}
