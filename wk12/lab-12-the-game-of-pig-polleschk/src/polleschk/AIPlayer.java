/*
 * Course: CSC1110 - 171
 * Fall 2023
 * Lab 12 - The Game of Pig
 * Name: Kaiden Pollesch
 * Created: 11/15/2023
 */
package polleschk;

/**
 * Abstract class AIPlayer that extends player
 */
public abstract class AIPlayer extends Player {
    private static int numberOfAIPlayers = 0;

    /**
     * Constructor for abstract class AIPlayer.
     */
    public AIPlayer() {
        super("Bot #" + numberOfAIPlayers++);
    }
}
