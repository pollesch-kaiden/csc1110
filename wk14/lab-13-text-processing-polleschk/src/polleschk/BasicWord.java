/*
 * Course: CSC1011 - 171
 * Fall 2023
 * Lab 13 - Text Processing
 * Name: Kaiden Pollesch
 * Created: 11/30/2023
 */
package polleschk;

/**
 * public class BasicWord that extends Word
 */
public class BasicWord extends Word {
    private final long location;
    /**
     * public constructor word with the following parameters
     *
     * @param word takes in the word and sets it to the variable word
     * @param location takes in the location of the word and sets it to the variable location
     */
    public BasicWord(String word, long location) {
        super(word);
        this.location = location;
    }

    public long getLocation() {
        return location;
    }

    /**
     * public method add location
     * @param location location of the word ina long
     * @throws UnsupportedOperationException when the requested operation
     *                                       cannot be supported with this method.
     */

    public void addLocation(long location) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    /**
     * public toString method
     * @return the variable word
     */
    public String toString(){
        return word;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof BasicWord basicWord)){
            return false;
        }
        return basicWord.word.equals(word);
    }

    @Override
    public int compareTo(Word word) {
        return this.word.compareTo(word.word);
    }
}
