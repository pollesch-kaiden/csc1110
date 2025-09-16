/*
 * Course: CS1110 - 171
 * Fall 2023
 * Homework 11
 * Name: Kaiden Pollesch
 * Last Updated: 11/9/2023
 */
package polleschk;

import java.util.ArrayList;

/**
 * Driver class for the Shapes
 * @author Kaiden Pollesch
 */
public class Driver {
    public static void main(String[] args) {
        final int four = 4;
        final int five = 5;
        final int six = 6;
        ArrayList<Shape> shapeList = new ArrayList<>();
        Circle c1 = new Circle(four);
        Rectangle r1 = new Rectangle(four, five);
        Rectangle r2 = new Rectangle(six, six);
        shapeList.add(c1);
        shapeList.add(r1);
        shapeList.add(r2);
        for (Shape shape: shapeList){
            System.out.println(shape.toString() + "\n");
        }
    }
}
