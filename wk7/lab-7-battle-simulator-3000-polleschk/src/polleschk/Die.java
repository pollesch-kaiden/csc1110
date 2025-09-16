/*
 * Course: CS1011 - 171
 * Fall 2022
 * Lab 7 - Battle Simulator 3000
 * Name: Kaiden Pollesch
 * Created: 10/11/2023
 */

package polleschk;

/**
 * This class holds the variables and methods to simulate
 * the rolling of a die with different amounts of sides.
 **/
public class Die {
    private int numSides;
    private int currentValue;
    private double generator;
    /**
     * This method holds simulates the rolling of a
     * die with different amounts of sides.
     * @param numSides is the input for how many sides the dice
     *                 that they are creating will have.
     **/
    public Die(int numSides){
        final int oneHundred = 100;
        final int six = 6;
        if (numSides > oneHundred || numSides < 2){
            this.numSides = six;
            roll();
        } else {
            this.numSides = numSides;
            roll();
        }
    }
    /**
     * This method will roll the dice, and give an integer
     * between 1, the lowest, and the number of sides the die is
     * given.
     **/
    public void roll(){
        this.generator = Math.random();
        currentValue = (int) (generator * numSides) + 1;
    }
    public int getCurrentValue(){
        return currentValue;
    }
}
