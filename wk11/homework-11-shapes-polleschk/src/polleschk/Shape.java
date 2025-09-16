/*
 * Course: CS1110 - 171
 * Fall 2023
 * Homework 11
 * Name: Kaiden Pollesch
 * Last Updated: 11/9/2023
 */
package polleschk;

import java.text.DecimalFormat;

/**
 * interface for any new shapes, and what each of the new shape must include
 */
public interface Shape {
    /**
     * Allowing each class to use the Decimal Formatter
     */
    DecimalFormat FORMATTER = new DecimalFormat("#0.##");

    /**
     * Declaring that each method must have a calculateArea method
     * @return the area of the shape
     */
    double calculateArea();

    /**
     * Declaring that each method must have a calculatePerimeter method
     * @return the perimeter of the shape
     */
    double calculatePerimeter();

    /**
     * Declaring that each method must have a toString method
     * @return the Value in a string
     */
    String toString();
}
