/*
 * Course: CS1110 - 171
 * Fall 2023
 * Homework 11
 * Name: Kaiden Pollesch
 * Last Updated: 11/9/2023
 */
package polleschk;

/**
 * This class will calculate the area of the circle as well as the perimeter.
 * It holds the variable radius for both methods to use.
 */
public class Circle implements Shape {
    private final int radius;

    /**
     *  Constructor for the Circle Class
     * @param radius take in radius of circle, then set that to the class variable radius.
     */
    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * 2 * radius;
    }

    /**
     * The print statement for the attributes of the Circle
     * @return the string value, what will be printed out
     */
    public String toString() {
        return Color.GREEN
                + "Circle\nradius = " + radius
                + "\narea = " + Shape.FORMATTER.format(calculateArea())
                + "\nperimeter = " + Shape.FORMATTER.format(calculatePerimeter())
                + Color.RESET;
    }
}
