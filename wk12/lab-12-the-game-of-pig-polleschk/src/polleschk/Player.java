/*
 * Course: CSC1110 - 171
 * Fall 2023
 * Lab 12 - The Game of Pig
 * Name: Kaiden Pollesch
 * Created: 11/15/2023
 */
package polleschk;

/**
 * Abstract Class Player
 */
public abstract class Player {
    private final String name;
    private int score;

    /**
     * public constructor for Player
     * @param name set the name of the player to the private variable name.
     */
    public Player(String name){
        this.name = name;
        score = 0;
    }

    public String getName() {
        return name;
    }
    public int getScore(){
        return score;
    }

    /**
     * Updates the score for that player
     * @param turnScore the score for that turn and adds it to the total score.
     */
    public void addToScore(int turnScore){
        score += turnScore;
    }

    /**
     * Public abstract chooseToHold method
     * @param turnScore take in turnScore to see their score for that turn
     * @return true if they want to hold and false if they want to roll again
     */
    public abstract boolean chooseToHold(int turnScore);

    /**
     * Public toString method
     * @return name of player
     */
    public String toString(){
        return getName();
    }
}
