/*
 * Course: CSC1011 - 171
 * Fall 2023
 * Homework 12 - Inheritance and Shapes
 * Name: Kaiden Pollesch
 * Created: 11/16/2023
 */
package polleschk;

/**
 * Public Class rectangle that extends Parallelogram
 */
public class Rectangle extends Parallelogram {
    /**
     * Public Constructor for Rectangle
     * @param longerSide the longer side of the rectangle
     * @param shorterSide the shorter side of the rectangle
     */
    public Rectangle(double longerSide, double shorterSide){
        super(longerSide, shorterSide, RIGHT_ANGLE);
    }

    @Override
    public String toString() {
        return Color.GREEN + "\nRectangle:\n"
                + "Longer side: " + FORMATTER.format(sideA)
                + "\nShorter Side: " + FORMATTER.format(sideB)
                + "\nArea: " + FORMATTER.format(getArea()) + Color.RESET;
    }
}
