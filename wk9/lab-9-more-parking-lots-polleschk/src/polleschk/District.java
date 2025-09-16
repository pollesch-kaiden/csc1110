/*
 * Course: CSC1110 - 171
 * Fall 2023
 * Lab 9 - Parking Lots
 * Name: Kaiden Pollesch
 * Created: 10/26/2023
 */
package polleschk;

import java.util.ArrayList;

/**
 * Manages parking lots within a district.
 * @author Kaiden Pollesch
 */
public class District {
    private final ArrayList<ParkingLot> lots;
    /**
     * Set up a district with an array of parking lots.
     */
    public District() {
        lots = new ArrayList<>();
    }
    /**
     * Display status information for all  lots.
     * @return ParkingLot#toString()  for the format for each.
     */
    public String toString(){
        StringBuilder lotsStatus = new StringBuilder("District status:\n");
        for (ParkingLot lot : lots) {
            lotsStatus.append("  ").append(lot.toString()).append("\n");
        }
        return lotsStatus.toString();
    }
    /**
     * Returns the number of remaining parking spots in the district
     * @return the number of remaining parking spots in the district
     */
    public int getNumberOfSpotsRemaining() {
        int totalSpotsRemaining = 0;
        for (ParkingLot lot : lots) {
            if (lot != null) {
                int remaining = lot.getNumberOfSpotsRemaining();
                if (remaining < 0) {
                    return 0;
                }
                totalSpotsRemaining += remaining;
            }
        }
        return totalSpotsRemaining;
    }
    /**
     * Returns the amount of time all lots have been
     * simultaneously closed.
     * @return number of minutes all three lots have been closed
     */
    public int getMinutesClosed() {
        int totalMinutesClosed = 0;
        for (ParkingLot lot : lots) {
            totalMinutesClosed += lot.getMinutesClosed();
        }
        return totalMinutesClosed;
    }
    /**
     * Checks the status of all lots in the district and
     * returns true if they are all closed and false if even one is open.
     * @return a bool of weather all lots in the district are closed
     */
    public boolean isClosed() {
        for (ParkingLot lot : lots) {
            if (lot != null && !lot.isClosed()) {
                return false;
            }
        }
        return true;
    }
    /**
     * Record a vehicle entering a lot at a specified timestamp.
     * <p></p>
     * This calls ParkingLot.markVehicleEntry for the lot corresponding
     * to lotNumber (e.g., if lotNumber==1, call markVehicleEntry on lot1).
     * <p></p>
     * If lotNumber is out of range, the method should return without
     * doing anything else.
     * @param lotNumber Number of lot (should be 1, 2, or 3)
     * @param timestamp Entry timestamp in minutes since all lots were opened.
     */
    public void markVehicleEntry(int lotNumber, int timestamp) {
        if (lotNumber >= 0 && lotNumber < lots.size()) {
            if (lots.get(lotNumber) != null) {
                lots.get(lotNumber).markVehicleEntry(timestamp);
            }
        }
    }
    /**
     * Record a vehicle exiting a lot at a specified timestamp.
     * <p></p>
     * This calls ParkingLot.markVehicleExit for the lot corresponding
     * to lotNumber (e.g., if lotNumber==1, call markVehicleExit on lot1).
     * <p></p>
     * If lotNumber is out of range, the method should return without
     * doing anything else.
     * @param lotNumber Number of lot (should be 1, 2, or 3)
     * @param timestamp Exit timestamp in minutes since all lots were opened.
     */
    public void markVehicleExit(int lotNumber, int timestamp) {
        ParkingLot lot = getLot(lotNumber);
        if (lot != null) {
            lot.markVehicleExit(timestamp);
        }
    }

    /**
     * This will add a lot to the district after checking that it is less than
     * the MAX_LOTS
     * @param name the name of the new parking lot that the user is adding
     * @param capacity the amount of vehicle spaces in the lot.
     * @return the index the lot was added too.
     */
    public int addLot(String name, int capacity){
        int newIndex = lots.size();
        lots.add(newIndex, new ParkingLot(name, capacity));
        return newIndex;
    }
    /**
     * It will take in the
     * @param index to specify what lot the user is trying to get and
     * @return the lot that they are trying to get.
     */
    public ParkingLot getLot(int index) {
        if (index >= 0 && index < lots.size()) {
            return lots.get(index);
        } else {
            return null;
        }
    }
}
