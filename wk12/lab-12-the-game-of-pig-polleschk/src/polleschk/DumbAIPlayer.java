/*
 * Course: CSC1110 - 171
 * Fall 2023
 * Lab 12 - The Game of Pig
 * Name: Kaiden Pollesch
 * Created: 11/15/2023
 */
package polleschk;

/**
 * DumbAIPlayer class that extends AIPlayer
 */
public class DumbAIPlayer extends AIPlayer {
    private final Die coin;

    /**
     * Public constructor DumbAIPlayer
     */
    public DumbAIPlayer() {
        coin = new Die(2);
    }

    /**
     * Public boolean method chooseToHold
     * @param turnScore has to be a parameter because of the parent class
     * @return true if the coin flipped is between 2-1 and false if it is between 1-0
     */
    public boolean chooseToHold(int turnScore){
        coin.roll();
        double face = coin.getSideUp();
        return face == 1;
    }
}
