/*
 * Course: CSC1110 - 171
 * Fall 2023
 * Lab 12 - The Game of Pig
 * Name: Kaiden Pollesch
 * Created: 11/15/2023
 */
package polleschk;

/**
 * ThresholdAIPlayer class that extends AIPlayer
 */
public class ThresholdAIPlayer extends AIPlayer {
    private final int threshold;

    /**
     * Public constructor ThresholdAIPlayer
     * @param threshold the threshold that the AI is not allowed to exceed in points.
     */
    public ThresholdAIPlayer(int threshold) {
        this.threshold = threshold;
    }

    /**
     * Public boolean method chooseToHold
     * @param turnScore input the score that the AI had that round
     * @return true if the score is greater or equal to the threshold, so they hold
     *         false if they score less than the threshold, so they roll again.
     */
    public boolean chooseToHold(int turnScore){
        return turnScore >= threshold;
    }
}
