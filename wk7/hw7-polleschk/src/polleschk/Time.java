/*
 * Course: CSC1110 - 171
 * Fall 2023
 * Homework 7
 * Name: Kaiden Pollesch
 * Last Updated: 10/13/23
 */
package polleschk;

/**
 * This class will hold the methods that keep track of the
 * time in hours minutes and seconds and also holds the class variables
 */
public class Time {
    private int hours;
    private int minutes;  
    private int seconds;  

    //********************************************************** 

    /**
     * This takes the hours imputed and sets them to the class hours variable
     * @param hours this is the imputed hours Ex: 08
     * @return this will return the amount of hours passed in.
     */
    public Time setHours(int hours){
        this.hours = hours;
        return this;
    }
    //end setHours

    /**
     * This takes the minutes imputed and sets them to the class minutes variable
     * @param minutes this is the imputed minutes Ex: 59
     * @return this will return the amount of minutes passed in.
     */
    public Time setMinutes(int minutes) {
        this.minutes = minutes;
        return this;  
    } // end setMinutes

    /**
     * This takes the seconds imputed and sets them to the class seconds variable
     * @param seconds this is the imputed seconds Ex: 00
     * @return this will return the amount of seconds passed in.
     */
    public Time setSeconds(int seconds) {
        this.seconds = seconds;
        return this;  
    } // end setSeconds  

    //************************************************************  

    /**
     * This class will print the time in this format
     * hours(08):minutes(59):seconds(00)
     */
    public void printTime() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    } // end printTime  
} // end Time class