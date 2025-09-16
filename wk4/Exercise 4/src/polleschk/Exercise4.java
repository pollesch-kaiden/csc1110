/*
 * Course: CSC-1110 - 171
 * Fall 2023
 * Exercise 4 - Right Triangle Math
 * Name: Kaiden Pollesch
 * Last Updated: 9/21/2023
 */
package polleschk;
import java.lang.Math;

/**
 * This class generates two random whole numbers between 1 and 10 and
 * uses those values as the two legs of a right triangle. It then
 * calculates the hypotenuse and the remaining two angles and
 * displays them.
 */
public class Exercise4 {
    private static final double RIGHT_ANGLE = 90.0;

    public static void main(String[] args) {
        // randomly choose side a
        double a = generateSide();
        // randomly choose side b
        double b = generateSide();
        // calculate hypotenuse
        double h = calculateHypotenuse(a, b);
        // calculate angle ah
        double angleAH = calculateAngle(a, h);
        // calculate angle bh
        double angleBH = RIGHT_ANGLE - angleAH;
        // report using printf
        report(a, b, h, angleAH, angleBH);
    }

    private static int generateSide() {
        int randomSide = (int) (Math.random() * 10 + 1);
        return randomSide;
    }

    private static double calculateHypotenuse(double a, double b) {
        a = Math.pow(a, 2);
        b = Math.pow(b, 2);
        double sqrt = Math.sqrt(a + b);
        return sqrt;
    }

    private static double calculateAngle(double x, double h) {
        double angleInRaid = Math.asin(x / h);
        double angleInDegrees = Math.toDegrees(angleInRaid);
        return angleInDegrees;
    }

    private static void report(double a, double b, double h, double angleAH, double angleBH) {
        System.out.printf("Side a is %.1f. Side b is %.1f. Hypotenuse is %.2f. Angle a is %.1f. Angle b is %.1f", a, b, h, angleAH, angleBH);
    }
}