/*
 * Course: CSC1011 - 171
 * Fall 2023
 * Homework 12 - Inheritance and Shapes
 * Name: Kaiden Pollesch
 * Created: 11/16/2023
 */
package polleschk;

/**
 * Public class RightTriangle that extends Triangle.
 */
public class RightTriangle extends Triangle {
    /**
     * RightTriangle constructor that takes in the following parameters
     * @param height is the height of the triangle
     * @param base is the length of the base of the triangle
     */
    public RightTriangle(double height, double base){
        super(height, base, Math.sqrt(Math.abs(Math.pow(height, 2) + Math.pow(base, 2))));
    }
    /**
     * Public toString method for the Shape RightTriangle
     * @return the description and lengths of the RightTriangle as a string
     */
    public String toString(){
        return Color.YELLOW + "\nRight Triangle:\n"
                + "Side A: " + Math.round(sideA)
                + "\nSide B: " + Math.round(sideB)
                + "\nBase: " + Math.round(base)
                + "\nAngleAB: " + Math.round(angleAB)
                + "\nAngleBaseB: " + Math.round(angleBaseB)
                + "\nAngleBaseA: " + Math.round(angleBaseA)
                + "\nArea: " + FORMATTER.format(getArea()) + Color.RESET;
    }
}
