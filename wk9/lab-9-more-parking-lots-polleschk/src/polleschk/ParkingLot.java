/*
 * Course: CSC1110 - 171
 * Fall 2023
 * Lab 9 - Parking Lots
 * Name: Kaiden Pollesch
 * Created: 10/26/2023
 */

package polleschk;

import java.text.DecimalFormat;

/**
 * Holds methods to handle each instance of parking lot.
 * @author Kaiden Pollesch
 */
public class ParkingLot {
    /**
     * This final double holds the value for when the parking lot is considered "closed"
     */
    public static final double CLOSED_THRESHOLD = 80.0;
    private DecimalFormat df = new DecimalFormat("#0.#");
    private int minutesClosed;
    private String name;
    private int numberOfVehicles;
    private int capacity;
    private int lastClosedTimeStamp;
    private int lastEntryTimeStamp;
    private int newestTimeStamp;

    /**
     * This constructor is where all instance variables are set and held.
     *
     * @param capacity is passed in so that we can set the private variable to
     *                 the variable that is changing in the driver/district
     */
    public ParkingLot(int capacity) {
        name = "test";
        this.capacity = capacity;
        numberOfVehicles = 0;
        minutesClosed = 0;
        lastClosedTimeStamp = 0;
        lastEntryTimeStamp = 0;
    }

    /**
     * This constructor is where all instance variables are set and held,
     * as well as a test to see if name is empty.
     *
     * @param name     is passed in to check if it is empty, or not set, if it isn't set,
     *                 then it is set to "test"
     * @param capacity is passed in so that we can set the private variable to
     *                 *          the variable that is changing in the driver/district
     */
    public ParkingLot(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        numberOfVehicles = 0;
        minutesClosed = 0;
        lastClosedTimeStamp = 0;
        lastEntryTimeStamp = 0;
        newestTimeStamp = 0;
    }

    /**
     * This method is what will display the status of the parking lot.
     * It will show the capacity full, and if it is full then it will say 'CLOSED'
     * @return a string, which is the display message, we do not use printf in this method.
     */
    public String toString() {
        double percentFull = getPercentFull();
        String returnStatement;
        if (isClosed()) {
            returnStatement = "Status for " + name + " parking lot: "
                    + getNumberOfVehicles() + " vehicles (CLOSED)";
            return returnStatement;
        }
        returnStatement = "Status for " + name + " parking lot: "
                + getNumberOfVehicles() + " vehicles (" + df.format(percentFull) + "%)";
        return returnStatement;
    }

    public int getMinutesClosed() {
        return minutesClosed;
    }

    public String getName() {
        return name;
    }

    /**
     * This method finds the number of spots remaining in the parking lot
     * by subtracting the number of vehicles entered from the capacity of that parking lot.
     *
     * @return the number of spots remaining in the parking lot
     */
    public int getNumberOfSpotsRemaining() {
        int numberOfSpotsRemaining = capacity - numberOfVehicles;
        return numberOfSpotsRemaining;
    }

    /**
     * Gets the percent full by dividing the number of vehicles by the capacity,
     * then multiplying by 100 to get a percentage.
     *
     * @return a double of the percentage of spots taken in the parking lot
     */
    public double getPercentFull() {
        final int oneHundred = 100;
        double percentFull = ((double) numberOfVehicles / capacity) * oneHundred;
        return percentFull;
    }

    public boolean isClosed() {
        return getPercentFull() >= CLOSED_THRESHOLD;
    }

    /**
     * This will mark when a vehicle enters that parking lot
     * and records the timestamp to when the lot becomes closed.
     *
     * @param timestamp is to check if the timestamp entered, or passed in is
     *                  less than the newest, if so then that is impossible,
     *                  so it will back out of the method.
     */
    public void markVehicleEntry(int timestamp) {
        boolean previouslyClosed = !isClosed();
        if (newestTimeStamp <= timestamp) {
            newestTimeStamp = timestamp;
            numberOfVehicles++;
        }
        if (previouslyClosed && isClosed()) {
            lastEntryTimeStamp = timestamp;
        }
    }

    /**
     * This will mark when a vehicle exists that parking lot and records the timestamp to
     * when the lot becomes closed, and when the lot becomes open.
     *
     * @param timestamp is to check if the timestamp entered, or passed in is
     *                  less than the newest, if so then that is impossible,
     *                  so it will back out of the method.
     */
    public void markVehicleExit(int timestamp) {
        boolean previouslyClosed = isClosed();
        if (newestTimeStamp <= timestamp) {
            newestTimeStamp = timestamp;
            numberOfVehicles--;
        }
        if (previouslyClosed && !isClosed()) {
            minutesClosed += timestamp - lastEntryTimeStamp;
        }
    }
    public int getNumberOfVehicles(){
        return numberOfVehicles;
    }
}
