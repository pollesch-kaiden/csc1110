/*
 * Course: CSC1011 - 171
 * Fall 2023
 * Homework 12 - Inheritance and Shapes
 * Name: Kaiden Pollesch
 * Created: 11/16/2023
 */
package polleschk;

import java.text.DecimalFormat;

/**
 * Public interface Shape that holds two variables and a method.
 */
public interface Shape {
    /**
     * FORMATTER is a DecimalFormat variable that has a decimal formatter inside of it.
     */
    DecimalFormat FORMATTER = new DecimalFormat("#0.##");
    /**
     * Right angle that stores the value of a right angle(90 degrees)
     */
    double RIGHT_ANGLE = 90;
    /**
     * Method to get area of shape
     * @return the area of the shape as a double
     */
    double getArea();


}
