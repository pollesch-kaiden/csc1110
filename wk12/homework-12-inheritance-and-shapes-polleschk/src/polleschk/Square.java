/*
 * Course: CSC1011 - 171
 * Fall 2023
 * Homework 12 - Inheritance and Shapes
 * Name: Kaiden Pollesch
 * Created: 11/16/2023
 */
package polleschk;

/**
 * Public class square that extends Rectangle
 */
public class Square extends Rectangle {
    /**
     * Public constructor that takes in the following parameter
     * @param side is the length for each side of the square
     */
    public Square(double side){
        super(side, side);
    }

    @Override
    public String toString() {
        return Color.CYAN + "\nSquare:\n"
                + "Side: " + Math.round(sideA)
                + "\nArea: " + FORMATTER.format(getArea())
                + Color.RESET + "\n";
    }
}
