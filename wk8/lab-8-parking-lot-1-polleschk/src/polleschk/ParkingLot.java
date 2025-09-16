/*
 * Course: CSC1110 - 171
 * Fall 2023
 * Lab 8 - Parking Lots
 * Name: Kaiden Pollesch
 * Last Updated: 10/18/23
 */

package polleschk;
/**
 * Holds methods to handle each instance of parking lot.
 * @author Kaiden Pollesch
 */
public class ParkingLot {
    /**
     * This final double holds the value for when the parking lot is considered "closed"
     */
    public static final double CLOSED_THRESHOLD = 80.0;
    private int minutesClosed;
    private String name;
    private int numberOfVehicles;
    private int capacity;
    private int newestTimeStamp;
    private int lastClosedTimeStamp;

    /**
     * This constructor is where all instance variables are set and held.
     * @param capacity is passed in so that we can set the private variable to
     *                 the variable that is changing in the driver/district
     */
    public ParkingLot(int capacity){
        name = "test";
        this.capacity = capacity;
        numberOfVehicles = 0;
        minutesClosed = 0;
        lastClosedTimeStamp = 0;
    }

    /**
     * This constructor is where all instance variables are set and held,
     * as well as a test to see if name is empty.
     * @param name is passed in to check if it is empty, or not set, if it isn't set,
     *             then it is set to "test"
     * @param capacity is passed in so that we can set the private variable to
     *      *          the variable that is changing in the driver/district
     */
    public ParkingLot(String name, int capacity){
        if (name.isEmpty()){
            name = "test";
        }
        this.name = name;
        this.capacity = capacity;
        numberOfVehicles = 0;
        minutesClosed = 0;
        lastClosedTimeStamp = 0;
    }

    /**
     * This method is what will display the status of that parking lot.
     * it will show the capacity full, and if it is full then it will say 'CLOSED'
     */
    public void displayStatus(){
        double percentFull = getPercentFull();
        if (isClosed()){
            System.out.printf("%s parking lot status: CLOSED\n", name);
        } else {
            System.out.printf("%s parking lot status: %.1f%%\n", name, percentFull);
        }
    }
    public int getMinutesClosed(){
        return minutesClosed;
    }
    public String getName(){
        return name;
    }

    /**
     * This method finds the number of spots remaining in the parking lot
     * by subtracting the number of vehicles entered from the capacity of that parking lot.
     * @return the number of spots remaining in the parking lot
     */
    public int getNumberOfSpotsRemaining(){
        int numberOfSpotsRemaining = capacity - numberOfVehicles;
        return numberOfSpotsRemaining;
    }
    /**
     * Gets the percent full by dividing the number of vehicles by the capacity,
     * then multiplying by 100 to get a percentage.
     * @return a double of the percentage of spots taken in the parking lot
     */
    public double getPercentFull(){
        final int oneHundred = 100;
        double percentFull = ((double)numberOfVehicles / capacity) * oneHundred;
        return percentFull;
    }
    public boolean isClosed(){
        return getPercentFull() >= CLOSED_THRESHOLD;
    }

    /**
     * This will mark when a vehicle enters that parking lot
     * and records the timestamp to when the lot becomes closed.
     * @param timestamp is to check if the timestamp entered, or passed in is
     *                  less than the newest, if so then that is impossible,
     *                  so it will back out of the method.
     */
    public void markVehicleEntry(int timestamp){
        if (timestamp < newestTimeStamp){
            return;
        }
        numberOfVehicles++;
        if (isClosed()){
            if (lastClosedTimeStamp == 0){
                lastClosedTimeStamp = timestamp;
            }
        }
        newestTimeStamp = timestamp;
    }

    /**
     * This will mark when a vehicle exists that parking lot and records the timestamp to
     * when the lot becomes closed, and when the lot becomes open.
     * @param timestamp is to check if the timestamp entered, or passed in is
     *                  less than the newest, if so then that is impossible,
     *                  so it will back out of the method.
     */
    public void markVehicleExit(int timestamp){
        if (timestamp < newestTimeStamp){
            return;
        }
        numberOfVehicles--;
        if (isClosed()){
            if (lastClosedTimeStamp == 0){
                lastClosedTimeStamp = timestamp;
            }
        } else {
            if (lastClosedTimeStamp != 0){
                minutesClosed += timestamp - lastClosedTimeStamp;
                //sets the timestamp closed back to zero because the lot is no longer closed
                lastClosedTimeStamp = 0;
            }
        }
        newestTimeStamp = timestamp;
    }
}
