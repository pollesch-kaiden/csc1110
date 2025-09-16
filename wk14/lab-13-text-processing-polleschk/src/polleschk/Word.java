/*
 * Course: CSC1011 - 171
 * Fall 2023
 * Lab 13 - Text Processing
 * Name: Kaiden Pollesch
 * Created: 11/30/2023
 */
package polleschk;

/**
 * Public Class word that implements the interface Comparable
 */
public abstract class Word implements Comparable {
    protected final String word;

    /**
     * public constructor word with the following parameters
     *
     * @param word takes in the word and sets it to the variable word
     */
    public Word(String word) {
        this.word = word;
    }

    /**
     * Adds a location to the collection.
     *
     * @param location The long value representing the location to be added.
     *                 The specific meaning of the location may depend on the
     *                 implementation or context of the class.
     */
    public abstract void addLocation(long location);

    /**
     * Returns a string representation of the object.
     *
     * @return A string representation of the object, typically providing
     * information about the state of the object.
     */
    public abstract String toString();

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param o The reference object with which to compare.
     * @return {@code true} if this object is the same as the obj argument;
     * {@code false} otherwise.
     */
    public abstract boolean equals(Object o);

    @Override
    public abstract int compareTo(Word word);
}
