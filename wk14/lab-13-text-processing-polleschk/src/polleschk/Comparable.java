/*
 * Course: CSC1011 - 171
 * Fall 2023
 * Lab 13 - Text Processing
 * Name: Kaiden Pollesch
 * Created: 11/30/2023
 */

package polleschk;

/**
 * public interface comparable
 */
public interface Comparable {
    /**
     * method compareTo method that each class under it has to inherit.
     * @param word is the word that they are comparing it to
     * @return an integer
     */
    int compareTo(Word word);
}
