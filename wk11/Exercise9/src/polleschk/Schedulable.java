/*
 * Course: CSC1110 - 171
 * Fall 2023
 * Lab 11 - Interfaces
 * Name: Kaiden Pollesch
 * Created: 11/8/2023
 */
package polleschk;

/**
 * Is the main interface for a Persons Calendar
 */
public interface Schedulable {
    /**
     * To input a day and hour and see if the Calendar is filled during that time,
     * or if it is free during that time in that persons calendar.
     * @param day the day that they want to schedule with person
     * @param hour the hour that they want to schedule with person
     * @return true if they can be scheduled at that time or false if they cannot.
     */
    boolean isBusy(int day, int hour);

    /**
     * This will try and add an item to the calendar
     * @param item will be the item added to the calendar
     * @return true if it was added return false if it wasn't added.
     */
    boolean add(Schedulable item);

    /**
     * This will try and remove an item to the calendar
     * @param item will be the item removed from the calendar
     * @return true if it was removed return false if it wasn't removed
     */
    boolean remove(Schedulable item);

    /**
     * This will get the name of the item being added to the calendar
     * @return the name of the item being added to the calendar
     */
    String getName();
}