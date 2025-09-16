/*
 * Course: CSC1110 - 171
 * Fall 2023
 * Homework 8
 * Name: Kaiden Pollesch
 * Last Updated: 10/18/23
 */
package polleschk;
import java.util.Scanner;

/**
 * This is the driver class that handles the function and output
 * of what the elevator would do/simulates the actions of the elevator.
 */
public class ElevatorDriver {

    public static void main(String[] args) {

        Elevator elevator = new Elevator();
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Welcome to Kaiden's elevator simulator!");
        do {
            //print the beginning statement
            intro();

            // Elevator Simulator
            input = scanner.next();
            if (input.equalsIgnoreCase("s")){
                System.out.print("Enter the floor that you'd like to go to ==> ");
                Scanner floorInput = new Scanner(System.in);
                elevator.selectFloor(floorInput.next());
            } else if (input.equalsIgnoreCase("f")){
                elevator.fireAlarm();
            } else if (!(input.equalsIgnoreCase("q"))){
                System.out.print("Invalid selection.");
            }
        } while (!(input.equalsIgnoreCase("q")));
    }
    private static void intro() {
        // Write a suitable introduction to your game
        System.out.print("""
                    
                    Options: (s)elect a floor, (f)ire alarm, (q)uit
                    Enter s, f, or q ==>""" + " ");
    }

}
