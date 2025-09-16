/*
 * Course: CSC1110 - 171
 * Fall 2023
 * Homework 7
 * Name: Kaiden Pollesch
 * Last Updated: 10/13/23
 */
package polleschk;

/**
 * This class demonstrates copying an object
 */
public class CarDriver {
    public static void main(String[] args) {
        Car jCar = new Car();
        Car xCar;
        final int twentyFifteen = 2015;
        jCar.setMake("Honda");
        jCar.setYear(twentyFifteen);
        jCar.setColor("silver");
        xCar = jCar.makeCopy();
        xCar.setColor("peach");
        System.out.println("J's car:");
        jCar.display();
        System.out.println("X's car:");
        xCar.display();
    }
}