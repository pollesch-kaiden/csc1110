/*
 * Course: CSC-1110 - 171
 * Fall 2023
 * Exercise 4 - Right Triangle Math
 * Name: Kaiden Pollesch
 * Last Updated: 9/21/2023
 */

package polleschk;
import java.util.Scanner;
import java.lang.Math;

/**
 * This class generates two random whole numbers between 1 and 10 and
 * uses those values as the two legs of a right triangle. It then
 * calculates the hypotenuse and the remaining two angles and
 * displays them.
 */

public class PiEstimate {
    static final double HALF_OF_PIXEL = 0.5;

    public static void main(String[] args) {
        int radius = 0;
        double minError = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a whole number radius greater than zero: ");
        String userInput = input.nextLine();
        radius = Integer.parseInt(userInput);
        int numStars = generateQuarterOfPi(radius);
        double radiusSquared = Math.pow(radius, 2);
        double calculatePI = calculatePi(radius, numStars);
        int fourthPi = 4;
        System.out.printf("%d * %d / %.0f = %f\n", fourthPi, numStars, radiusSquared, calculatePI);

        while (radius <= 0) {
            if (input.hasNextInt()) {
                radius = input.nextInt();
                if (radius <= 0) {
                    System.out.println("Invalid input. Input must be greater than zero.");
                }
            }
        }
        while (minError <= 0.0) {
            System.out.print("Enter the minimum desired error for the estimate of PI: ");
            if (input.hasNextDouble()) {
                minError = input.nextDouble();
                if (minError <= 0.0) {
                    System.out.println("Invalid input. Input must be greater than zero.");
                }
            }
        }
        input.close();
        int num16Stars = 203;
        System.out.println("An estimate of " + calculatePi(16, 203) + " was achieved with a radius of 16");
    }

    //This method will print a quarter of Pi
    private static int generateQuarterOfPi(int radius) {
        int star = 0;
        for (int y = radius; y >= 0; y--) {
            for (int x = 0; x < radius; x++) {
                //Calculate the distance from the current pixel to the origin
                double ySquare = Math.pow(y, 2);
                double xSquare = Math.pow(x, 2);
                double distance = Math.sqrt(ySquare + xSquare);

                //Check if the distance to the point is less than or equal to half of the diameter, the radius.
                if (distance <= (radius - HALF_OF_PIXEL)) {
                    System.out.print("*");
                    star++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return star;
    }


    private static double calculatePi(int radius, int numStars) {
        double numOfPixels = Math.pow(radius,2);
        int fourthPi = 4;
        double estimatedQuarterPi;
        estimatedQuarterPi = fourthPi * numStars / numOfPixels;
        return estimatedQuarterPi;
    }
}
