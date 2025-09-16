/*
 * Course: CSC-1110 - 171
 * Assignment: Deck and Card Polymorphism
 * Name: Kaiden Pollesch
 * Last Updated: 11/20/23
 */
package polleschk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Suite of tests for decks and cards
 */
public class DeckTests {
    private Card c1;
    private Card c2;
    private Card c3;
    private Card c4;
    private Card c5;
    private ArrayList<Deck> decks;

    /**
     * Initializes Cards for tests
     */
    @BeforeEach
    public void setup() {
        c1 = new Card(Rank.ACE, Suit.SPADES);
        c2 = new Card(Rank.ACE, Suit.SPADES);
        c3 = new Card(Rank.ACE, Suit.DIAMONDS);
        c4 = new Card(Rank.KING, Suit.SPADES);
        c5 = new Card(Rank.TWO, Suit.HEARTS);
        decks = new ArrayList<>();
    }

    /**
     * Tests construction of a card
     */
    @Test
    @DisplayName("Card Construction")
    public void cards() {
        assertEquals(Rank.ACE, c1.getRank());
        assertEquals(Suit.SPADES, c1.getSuit());
        assertEquals(Rank.ACE, c2.getRank());
        assertEquals(Suit.SPADES, c2.getSuit());
        assertEquals(Rank.ACE, c3.getRank());
        assertEquals(Suit.DIAMONDS, c3.getSuit());
        assertEquals(Rank.KING, c4.getRank());
        assertEquals(Suit.SPADES, c4.getSuit());
    }

    /**
     * Tests Card equals method
     */
    @Test
    @DisplayName("Card Equality")
    public void cardEquals() {
        assertEquals(c1, c1);
        assertEquals(c1, c2);
        Assertions.assertNotEquals(c1, c3);
        Assertions.assertNotEquals(c1, c4);
        Assertions.assertNotEquals(c2, c3);
        Assertions.assertNotEquals(c2, c4);
        Assertions.assertNotEquals(c3, c4);
    }

    /**
     * Tests Card compareTo
     */
    @Test
    @DisplayName("Card Comparisons")
    public void cardCompare() {
        assertEquals(0, c1.compareTo(c2));
        assertTrue(0 < c1.compareTo(c4));
        assertTrue(0 > c4.compareTo(c3));
    }

    /**
     * Tests Card toString
     */
    @Test
    @DisplayName("Card toString")
    public void cardToString() {
        assertEquals("AS", c1.toString());
        assertEquals("AD", c3.toString());
        assertEquals("KS", c4.toString());
    }

    /**
     * Test construction of a deck
     */
    @Test
    @DisplayName("Deck construction")
    public void decks() {
        PokerDeck pd = new PokerDeck();
        EuchreDeck ed = new EuchreDeck();
        decks.add(pd);
        decks.add(ed);
    }

    /**
     * Test Deck size
     */
    @Test
    @DisplayName("Deck size")
    public void deckSize() {
        PokerDeck pd = new PokerDeck();
        assertEquals(0, pd.size());
        pd.addCard(c1);
        assertEquals(1, pd.size());
    }

    /**
     * Test Deck add
     */
    @Test
    @DisplayName("Deck add")
    public void deckAdd() {
        PokerDeck pd = new PokerDeck();
        EuchreDeck ed = new EuchreDeck();
        pd.addCard(c1);
        ed.addCard(c1);
        assertEquals(1, pd.size());
        assertEquals(1, ed.size());
        pd.addCard(c2);
        ed.addCard(c2);
        assertEquals(1, pd.size());
        assertEquals(1, ed.size());
        pd.addCard(c3);
        ed.addCard(c3);
        assertEquals(2, pd.size());
        assertEquals(2, ed.size());
        pd.addCard(c4);
        ed.addCard(c4);
        assertEquals(3, pd.size());
        assertEquals(3, ed.size());
        pd.addCard(c5);
        ed.addCard(c5);
        assertEquals(4, pd.size());
        assertEquals(3, ed.size());
    }

    /**
     * Test Deck remove
     */
    @Test
    @DisplayName("Deck remove")
    public void deckRemove() {
        Deck pd = buildDeck();
        assertEquals(c1, pd.drawCard());
        assertEquals(3, pd.size());
        assertEquals(c3, pd.drawCard());
        assertEquals(2, pd.size());
        assertEquals(c4, pd.drawCard());
        assertEquals(1, pd.size());
        assertEquals(c5, pd.drawCard());
        assertEquals(0, pd.size());
        Assertions.assertThrows(IndexOutOfBoundsException.class, pd::drawCard);
    }

    /**
     * Tests Card toString
     */
    @Test
    @DisplayName("Deck toString")
    public void deckToString() {
        Deck deck = buildDeck();
        assertEquals("[AS, AD, KS, 2H]", deck.toString());
        deck.drawCard();
        assertEquals("[AD, KS, 2H]", deck.toString());
    }


    /**
     * Tests Deck shuffling
     */
    @Test
    @DisplayName("Deck Shuffling")
    public void deckShuffle() {
        Deck pd = buildDeck();
        String before = pd.toString();
        pd.shuffle();
        String after = pd.toString();
        Assertions.assertNotEquals(before, after);
    }

    private Deck buildDeck() {
        PokerDeck pd = new PokerDeck();
        pd.addCard(c1);
        pd.addCard(c3);
        pd.addCard(c4);
        pd.addCard(c5);
        return pd;
    }
}
