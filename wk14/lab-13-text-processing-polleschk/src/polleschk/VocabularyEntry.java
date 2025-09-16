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
 * public class VocabularyEntry that extends Word
 */
public class VocabularyEntry extends Word {
    private int occurrences;
    private final List<Long> locations;
    /**
     * public constructor word with the following parameters
     *
     * @param word takes in the word and sets it to the variable word
     */
    public VocabularyEntry(BasicWord word) {
        super(word.word);
        locations = new ArrayList<>();
        addLocation(word.getLocation());
    }

    public int getOccurrences() {
        return occurrences;
    }

    public List<Long> getLocation() {
        return locations;
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
        return String.format("%-15s %4d", word, occurrences);
    }

    /**
     * method that checks if the parameter passed in is an instance of a VocabularyEntry
     * @param o an object to be passed in and checked if it's a Vocabulary entry
     * @return true if it is a vocabulary entry and false if not
     */
    public boolean equals(Object o) {
        if (!(o instanceof VocabularyEntry vocabEntry)){
            return false;
        }
        return vocabEntry.word.equals(word);
    }
    @Override
    public int compareTo(Word word) {
        return occurrences - ((VocabularyEntry) word).occurrences;
    }
}
