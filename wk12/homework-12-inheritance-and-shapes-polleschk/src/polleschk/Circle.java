/*
 * Course: CSC1011 - 171
 * Fall 2023
 * Homework 12 - Inheritance and Shapes
 * Name: Kaiden Pollesch
 * Created: 11/16/2023
 */
package polleschk;

/**
 * Public class Circle that implements Shape.
 */
public class Circle implements Shape {
    private final double radius;

    /**
     * Public Constructor for the class Circle
     * @param radius intake the radius so that we can set that to the local variable
     */
    public Circle(double radius){
        this.radius = radius;
    }

    /**
     * Public toString method for the Shape Circle
     * @return the description of the circle as a string
     */
    @Override
    public String toString() {
        return Color.BLACK + "\nCircle:"
                + "\nRadius: " + Math.round(radius)
                + "\nArea: " + FORMATTER.format(getArea()) + Color.RESET;

    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
