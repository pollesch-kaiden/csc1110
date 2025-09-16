/*
 * Course: CSC-1110
 * Assignment: Deck and Card Polymorphism
 * Name: Kaiden Pollesch
 * Last Updated: 11/14/2023
 */
package polleschk;

/**
 * An enumeration of the possible suits for a playing card
 */
public enum Suit {
    /**
     * clubs, a black suit
     */
    CLUBS {
        @Override
        public String toString() {
            return "Clubs";
        }
    },
    /**
     * diamonds, a red suit
     */
    DIAMONDS {
        @Override
        public String toString() {
            return "Diamonds";
        }
    },
    /**
     * hearts, a red suit
     */
    HEARTS {
        @Override
        public String toString() {
            return "Hearts";
        }
    },
    /**
    spades, a black suit
     */
    SPADES {
        @Override
        public String toString() {
            return "Spades";
        }
    }
}
