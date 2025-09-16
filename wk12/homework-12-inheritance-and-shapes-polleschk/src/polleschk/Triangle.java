/*
 * Course: CSC1011 - 171
 * Fall 2023
 * Homework 12 - Inheritance and Shapes
 * Name: Kaiden Pollesch
 * Created: 11/16/2023
 */
package polleschk;

/**
 * Public class Triangle that implements shape
 */
public class Triangle implements Shape {
    protected final double sideA;
    protected final double sideB;
    protected final double base;
    protected double angleAB;
    protected double angleBaseA;
    protected double angleBaseB;

    /**
     * Public constructor that has the following parameters.
     * @param sideA takes in sideA of the triangle
     * @param sideB takes in sideB of the triangle
     * @param base takes in the base of the triangle.
     */
    public Triangle(double sideA, double sideB, double base){
        this.sideA = sideA;
        this.sideB = sideB;
        this.base = base;
        setAngles();
    }

    @Override
    public String toString() {
        return Color.MAGENTA + "\nTriangle:\n"
                + "Side A: " + Math.round(sideA)
                + "\nSide B: " + Math.round(sideB)
                + "\nBase: " + Math.round(base)
                + "\nAngleAB: " + Math.round(angleAB)
                + "\nAngleBaseB: " + Math.round(angleBaseB)
                + "\nAngleBaseA: " + Math.round(angleBaseA)
                + "\nArea: " + FORMATTER.format(getArea()) + Color.RESET;
    }
    private void setAngles(){
        final int oneEighty = 180;
        double acosAngleAB = (Math.pow(base, 2) + Math.pow(sideA, 2)
                - Math.pow(sideB, 2)) / (2 * base * sideA);
        double acosAngleBaseB = (Math.pow(sideA, 2) + Math.pow(sideB, 2)
                - Math.pow(base, 2)) / (2 * sideA * sideB);
        angleBaseA = Math.toDegrees(Math.acos(acosAngleAB));
        angleAB = Math.toDegrees(Math.acos(acosAngleBaseB));
        angleBaseB = oneEighty - angleAB - angleBaseA;
    }

    @Override
    public double getArea() {
        final double half = 0.5;
        return half * angleAB * Math.sin(Math.toRadians(angleAB));
    }
}
