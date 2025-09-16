/*
 * Course: CSC-1110
 * Assignment: Deck and Card Polymorphism
 * Name: Kaiden Pollesch
 * Last Updated: 11/14/2023
 */
package polleschk;

/**
 * Public Class EuchreDeck
 */

public class EuchreDeck extends Deck {
    static final int MAX_SIZE = 24;
    static final int NINE = 9;

    /**
     * Public constructor add card with the following parameter
     * @param card get the card that they want to add to their hand
     */
    public void addCard(Card card) {
        if (!isFull() && !contains(card) && card.getRank().getRank() >= NINE) {
            cards.add(card);
        }
    }
    private boolean isFull() {
        return cards.size() >= MAX_SIZE;
    }
}
