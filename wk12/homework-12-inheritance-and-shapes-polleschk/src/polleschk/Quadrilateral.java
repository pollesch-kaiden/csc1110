/*
 * Course: CSC1011 - 171
 * Fall 2023
 * Homework 12 - Inheritance and Shapes
 * Name: Kaiden Pollesch
 * Created: 11/16/2023
 */
package polleschk;

/**
 * Class quadrilateral that implements Shape
 */
public class Quadrilateral implements Shape {
    protected double sideA;
    protected double sideB;
    protected double sideC;
    protected double sideD;
    protected double angleAB;
    protected double angleBC;
    protected double angleCD;
    protected double angleDA;

    @Override
    public double getArea() {
        return sideA * sideB * Math.sin(Math.toRadians(angleAB));
    }
}
