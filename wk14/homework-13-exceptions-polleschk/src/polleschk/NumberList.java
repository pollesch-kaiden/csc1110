/*
 * Course: CSC1110 - 171
 * Fall 2023
 * Homework 13
 * Name: Kaiden Pollesch
 * Last Updated: 11/30/23
 */
package polleschk;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A class that stores integers and calculates the mean and average of the integers
 */
public class NumberList {
    private static final int LIST_SIZE = 20;
    private int[] numList;
    private int size;

    /**
     * Constructor for a NumberList
     */
    public NumberList() {
        numList = new int[LIST_SIZE];
        size = 0;
    }

    /**
     * Gets a series of whole numbers from the user and
     * stores them in the list
     */
    public void readNumbers() {
        boolean done = false;
        while (!done) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a series of up to " + LIST_SIZE +
                " whole numbers separated by a space: ");
            String userInput = in.nextLine();
            in = new Scanner(userInput);
            while (in.hasNext() && size < LIST_SIZE) {
                numList[size++] = parseInput(in.next());
            }
            if (size >= LIST_SIZE){
                System.out.printf("Too many numbers. You may only input %d numbers.\n", LIST_SIZE);
                size = 0;
                Arrays.fill(numList, 0);
            } else {
                done = true;
            }
        }
    }

    private int parseInput(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e){
            if (input.contains(".")){
                int round = (int) Math.round(Double.parseDouble(input));
                System.out.printf("Floating point number detected: %s. " +
                        "Rounding to %d.\n", input, round);
                return round;
            } else {
                System.out.printf("Bad input: For input string: \"%s\". Skipping.\n", input);
                size--;
            }
            return 0;
        }
    }

    /**
     * Calculates the mean of the list
     *
     * @return the mean of the list
     */
    public int getMean() {
        int sum = 0;
        for (int i : numList) {
            sum += i;
        }
        return sum / size;
    }
}
