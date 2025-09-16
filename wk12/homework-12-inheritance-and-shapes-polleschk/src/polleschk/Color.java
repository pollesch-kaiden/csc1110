/*
 * Course: CSC1011 - 171
 * Fall 2023
 * Homework 12 - Inheritance and Shapes
 * Name: Kaiden Pollesch
 * Created: 11/16/2023
 */

package polleschk;

/**
 * Method Color class
 * @author Kaiden Pollesch
 */
public enum Color {
    /**
     * This is to reset the color back to white
     */
    RESET("\u001B[0m"),
    /**
     * This is the color Black
     */
    BLACK("\u001B[30m"),
    /**
     * This is the color Red
     */
    RED("\u001B[31m"),
    /**
     * This is the color Green
     */
    GREEN("\u001B[32m"),
    /**
     * This is the color Yellow
     */
    YELLOW("\u001B[33m"),
    /**
     * This is the color Blue
     */
    BLUE("\u001B[34m"),
    /**
     * This is the color Magenta
     */
    MAGENTA("\u001B[35m"),
    /**
     * This is the color Cyan
     */
    CYAN("\u001B[36m"),
    /**
     * This is the color White
     */
    WHITE("\u001B[37m");
    private final String ansi;
    Color(String ansi){
        this.ansi = ansi;
    }

    /**
     * This is to let the use find the value of ansi if they so choose.
     * @return the value stored in ansi
     */
    public String toString(){
        return ansi;
    }
}
