/*
 * Course: CSC-1110
 * Assignment: Deck and Card Polymorphism
 * Name: Kaiden Pollesch
 * Last Updated: 11/14/2023
 */
package polleschk;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Public class Deck
 */
public class Deck {
    protected ArrayList<Card> cards;

    protected Deck(){
        cards = new ArrayList<>();
    }

    /**
     * This method gets the deck size.
     * @return the number of cards in the deck.
     */
    public int size(){
        return cards.size();
    }

    /**
     * This method adds a card to the deck.
     * @param card the card to be added.
     */
    public void addCard(Card card){
        cards.add(card);
    }

    /**
     * This method draws a card from the deck.
     * @return the card drawn from the deck.
     */
    public Card drawCard(){
        try{
            return cards.remove(0);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Error: The deck is empty, you are unable to draw");
        }
        return cards.get(0);
    }
    /**
     * This method shuffles the cards in the deck.
     */
    public void shuffle(){
        Collections.shuffle(cards);
    }
    /**
     * This method checks if a card is in the deck.
     * @param card the card to be checked.
     * @return true if the card is in the deck, otherwise false.
     */
    public boolean contains(Card card){
        return cards.contains(card);
    }
    /**
     * This method returns a string representation of the deck.
     * @return a string representation of the deck.
     */
    public String toString(){
        StringBuilder deckString = new StringBuilder("[");
        for (int i = 0; i < cards.size(); i++) {
            deckString.append(cards.get(i));
            if (i < cards.size() - 1) {
                deckString.append(", ");
            }
        }
        deckString.append("]");
        return deckString.toString();
    }

}

