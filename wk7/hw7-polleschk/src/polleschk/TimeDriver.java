/*
 * Course: CSC1110 - 171
 * Fall 2023
 * Homework 7
 * Name: Kaiden Pollesch
 * Last Updated: 10/13/23
 */
package polleschk;
/**
 * This class is the time driver and will be where you are able to
 * print out the time in this format
 * hours(08):minutes(59):seconds(00)
 */
public class TimeDriver {
    public static void main(String[] args) {
        final int eight = 8;
        final int fiftyNine = 59;
        Time time = new Time();
        time
                .setHours(eight)
                .setMinutes(fiftyNine)
                .setSeconds(0)
                .printTime();
    }
} // end TimeDriver class