/*
 * Course: CSC1011 - 171
 * Fall 2023
 * Homework 12 - Inheritance and Shapes
 * Name: Kaiden Pollesch
 * Created: 11/16/2023
 */
package polleschk;

/**
 * Public class parallelogram that extends Quadrilateral
 */
public class Parallelogram extends Quadrilateral {
    /**
     * constructor parallelogram that takes in the following parameters
     * @param longerSide takes in the long side of the parallelogram
     * @param shorterSide takes in the short side of the parallelogram
     * @param angle takes in the angle for the parallelogram
     */
    public Parallelogram(double longerSide, double shorterSide, double angle) {
        sideA = longerSide;
        sideB = shorterSide;
        angleAB = angle;
    }

    @Override
    public String toString() {
        final int oneEighty = 180;
        final double obtuseAngle = oneEighty - angleAB;
        return Color.BLUE + "Parallelogram:\n"
                + "Longer side: " + Math.round(sideA)
                + "\nShorter Side: " + Math.round(sideB)
                + "\nAcute Angle: " + Math.round(angleAB)
                + "\nObtuse angle: " + Math.round(obtuseAngle)
                + "\nArea: " + FORMATTER.format(getArea()) + Color.RESET;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Parallelogram;
    }
    private double getHeight(){
        double height;
        if (angleAB > RIGHT_ANGLE){
            double newAngle = angleAB - RIGHT_ANGLE;
            height = Math.cos(Math.toRadians(newAngle)) * sideB;
        } else if (angleAB < RIGHT_ANGLE){
            height = Math.sin(Math.toRadians(angleAB)) * sideB;
        } else {
            height = sideB;
        }
        return height;
    }
}
