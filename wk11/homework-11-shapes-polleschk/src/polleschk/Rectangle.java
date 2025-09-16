/*
 * Course: CS1110 - 171
 * Fall 2023
 * Homework 11
 * Name: Kaiden Pollesch
 * Last Updated: 11/9/2023
 */
package polleschk;

/**
 * This class will calculate the area and perimeter of the circle.
 * It holds the variables length and width for both methods to use.
 */
public class Rectangle implements Shape {
    private final int length;
    private final int width;

    /**
     * Constructor for the Rectangle Class
     * @param length take in length of rectangle, then set that to the class variable length.
     * @param width take in width of rectangle, then set that to the class variable width.
     */
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return length * 2 + width * 2;
    }

    /**
     * The print statement for the attributes of the Rectangle
     * @return the string value, what will be printed out
     */
    public String toString() {
        if (length == width){
            return Color.BLUE
                    + "Square\nlength = " + length
                    + "\nwidth = " + width
                    + "\narea = " + Shape.FORMATTER.format(calculateArea())
                    + "\nperimeter = " + calculatePerimeter()
                    + Color.RESET;
        } else {
            return Color.RED
                    + "Rectangle\nlength = " + length
                    + "\nwidth = " + width
                    + "\narea = " + Shape.FORMATTER.format(calculateArea())
                    + "\nperimeter = " + calculatePerimeter()
                    + Color.RESET;
        }
    }
}
