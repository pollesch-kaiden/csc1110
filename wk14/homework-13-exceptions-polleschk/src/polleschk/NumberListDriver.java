/*
 * Course: CSC1110 - 171
 * Fall 2023
 * Homework 13
 * Name: Kaiden Pollesch
 * Last Updated: 11/30/23
 */
package polleschk;

/**
 * Driver that will create a NumberList, fill it, and return the mean
 * value of the list
 */
public class NumberListDriver {
    public static void main(String[] args) {
        NumberList list = new NumberList();
        try {
            list.readNumbers();
            System.out.println("Mean = " + list.getMean());
        } catch (ArithmeticException e){
            System.out.println("No valid values entered. Exiting.");
        }
    }
}
