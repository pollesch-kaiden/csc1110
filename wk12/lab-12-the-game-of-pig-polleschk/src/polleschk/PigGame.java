/*
 * Course: CSC1110 - 171
 * Fall 2023
 * Lab 12 - The Game of Pig
 * Name: Kaiden Pollesch
 * Created: 11/15/2023
 */
package polleschk;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * PigGame class
 */

public class PigGame {
    private final Die die;
    private final List<Player> players;

    /**
     * Public constructor with no parameters
     */
    public PigGame() {
        die = new Die();
        players = new ArrayList<>();
    }

    /**
     * Public addPlayer method
     * @param player takes in a player and adds them into the list of players.
     */
    public void addPlayer(Player player) {
        players.add(player);
    }

    /**
     * Public method playGame that returns a player
     * @return the player of who wins the game
     */
    public Player playGame() {
        Random random = new Random();
        final int oneHundred = 100;
        int playerIndex = random.nextInt(players.size());
        while (players.get(playerIndex).getScore() < oneHundred) {
            takeTurn(players.get(playerIndex));
            playerIndex++;
            playerIndex = playerIndex % players.size();
        }
        return players.get(playerIndex);
    }

    /**
     * Public toString method for the PigGame
     * @return the name of the player
     */
    public String toString(){
        return players.toString();
    }
    private void takeTurn(Player player){
        final int oneHundred = 100;
        do {
            die.roll();
            if (die.getSideUp() == 1) {
                player.addToScore(0);
            } else {
                player.addToScore(die.getSideUp());
            }
            System.out.printf("%s rolled a %d\n", player.getName(), die.getSideUp());
            if (player.getScore() == oneHundred) {
                break;
            }
        } while (die.getSideUp() != 1 && !player.chooseToHold(player.getScore()));
        System.out.print("Current scores:\n");
        for (Player playerP : players){
            System.out.printf("%s: %d\n", playerP.getName(), playerP.getScore());
        }
        System.out.println();
        if (die.getSideUp() == 1){
            player.addToScore(0);
        }
    }
}