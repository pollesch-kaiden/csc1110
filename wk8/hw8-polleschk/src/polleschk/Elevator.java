/*
 * Course: CSC1110 - 171
 * Fall 2023
 * Homework 8
 * Name: Kaiden Pollesch
 * Last Updated: 10/18/23
 */
package polleschk;
/**
 * This is the Elevator class holds the two methods, 'selectFloor' and 'fireAlarm'
 * it also holds the setter and getter method for the variable 'currentFloor'
 */
public class Elevator {
    private int currentFloor;

    /**
     * This constructor sets the base value of current floor to one
     * because the base floor or the main floor is one, so it has to
     * start at 1 otherwise it is incorrect.
     */
    public Elevator() {
        currentFloor = 1;
    }
    private void setCurrentFloor(int currentFloor){
        this.currentFloor = currentFloor;
    }
    private int getCurrentFloor(){
        return currentFloor;
    }
    /**
     * It prints the transition from one floor to another. Going down if the new floor is less,
     * and going down if the new floor is more. If they enter a number less than 1
     * or greater than 100, then it throws an error and yelled at the user.
     * @param in takes in user input then changes the currentFloor variable,
     *      * and shows the elevator traveling between the floors,
     *      * so it is always 'current' and up to date.
     */
    public void selectFloor(String in) {
        int floorSelect = Integer.parseInt(String.valueOf(in));
        final int lessThan100Floors = 100;
        if (floorSelect > 0 && floorSelect < lessThan100Floors) {
            if (floorSelect > getCurrentFloor()){
                System.out.print("Going up..");
                for (int i = getCurrentFloor()+1; i <= floorSelect; i++) {
                    System.out.printf("%d..", i);
                    if (i == floorSelect) {
                        System.out.print("Ding!");
                        setCurrentFloor(floorSelect);
                    }
                }
            } else {
                System.out.print("Going down..");
                for (int i = getCurrentFloor()-1; i >= floorSelect; i--) {
                    System.out.printf("%d..", i);
                    if (i == floorSelect) {
                        System.out.print("Ding!");
                        setCurrentFloor(floorSelect);
                    }
                }
            }
        } else {
            System.out.print("Invalid floor selection - must be between 1 and 100.");
        }
    }

    /**
     * this method is fireAlarm, and it simulates the action of an
     * elevator if the fire alarm was pulled. It would find the current floor,
     * and then it would descend once the alarm is pulled going to floor 1.
     */
    public void fireAlarm(){
        System.out.print("Danger! You must exit the building now!");
        int i;
        if (!(getCurrentFloor() == 1)) {
            System.out.print("\nGoing down..");
            for (i = getCurrentFloor()-1; i > 0; i--) {
                System.out.printf("%d..", i);
                if (i == 1) {
                    System.out.print("Ding!");
                    setCurrentFloor(1);
                }
            }
        }
    }
}
