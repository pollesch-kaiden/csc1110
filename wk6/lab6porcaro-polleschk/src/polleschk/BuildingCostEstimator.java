/*
 * Course: CSC-1110
 * Fall 2023
 * Lab 6
 * Name: Kaiden Pollesch
 * Last Updated: 10/05/2023
 */

package polleschk;

/**
 *These are the methods, getters and setters
 * for the class House.java
 */
public class BuildingCostEstimator {
    private int squareFeet;
    private int fullBaths;
    private int halfBaths;
    private int bedrooms;
    private int windows;
    private double garage;

    /**
     *Create a method for use to access
     */
    public BuildingCostEstimator(){
    }
    /**
     * This is the method for cost to build the house
     */
    public double costToBuild() {
        return squareFeet * 185 + fullBaths * 30000 + halfBaths * 12000 +
                bedrooms * 5000 + windows * 1300 + garage * 12000;
    }
    public int getSquareFeet() {
        return squareFeet;
    }
    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }
    public int getNumFullBaths(){
        return fullBaths;
    }
    public void setNumFullBaths(int fullBaths){
        this.fullBaths = fullBaths;
    }
    public int getNumHalfBaths(){
        return halfBaths;
    }
    public void setNumHalfBaths(int halfBaths){
        this.halfBaths = halfBaths;
    }
    public int getNumBedrooms(){
        return bedrooms;
    }
    public void setNumBedrooms(int bedrooms){
        this.bedrooms = bedrooms;
    }
    public int getNumWindows(){
        return windows;
    }
    public void setNumWindows(int windows) {
        this.windows = windows;
    }
    public double getNumGarages() {
        return garage;
    }
    public void setNumGarages(double garage) {
        this.garage = garage;
    }
}
