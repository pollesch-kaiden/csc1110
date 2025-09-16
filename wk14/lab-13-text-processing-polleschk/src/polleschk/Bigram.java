/*
 * Course: CSC1011 - 171
 * Fall 2023
 * Lab 13 - Text Processing
 * Name: Kaiden Pollesch
 * Created: 11/30/2023
 */
package polleschk;

import java.util.ArrayList;
import java.util.List;

/**
 * public class bigram that extends word
 */
public class Bigram extends Word {
    private final String word2;
    private int occurrences;
    private final List<Long> locations;
    /**
     * public constructor Bigram with the following parameters
     *
     * @param word1 first word
     * @param word2 second word
     */
    public Bigram(BasicWord word1, BasicWord word2) {
        super(word1.toString());
        this.word2 = word2.word;
        locations = new ArrayList<>();
        addLocation(word1.getLocation());
    }

    /**
     * public method addLocation with the following parameter
     * @param location will take in the location of the word in the array
     * @throws IllegalArgumentException when the location is invalid
     */
    public void addLocation(long location) throws IllegalArgumentException {
        if (location < 0 || locations.contains(location)){
            throw new IllegalArgumentException("This Location is Invalid, The word cannot go here");
        }
        locations.add(location);
        occurrences++;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-15s %4s", word, word2, occurrences);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof BasicWord basicWord)){
            return false;
        }
        return basicWord.word.equals(word) && basicWord.word.equals(word2);
    }
    @Override
    public int compareTo(Word word) {
        return occurrences - ((Bigram) word).occurrences;
    }
}
