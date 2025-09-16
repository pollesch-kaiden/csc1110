/*
 * Course: CSC1110 - 171
 * Fall 2023
 * Lab 11 - Interfaces
 * Name: Kaiden Pollesch
 * Created: 11/8/2023
 */
package polleschk;

import java.text.DecimalFormat;

/**
 * Interface Ingredient
 */
public interface Ingredient {
    /**
     * Formats the number to two decimal places
     */
    DecimalFormat CUP_FORMAT = new DecimalFormat("#0.##");
    /**
     * Gets the calorie
     * @return calories as double
     */
    double getCalories();
    /**
     * Gets the cups
     * @return cups as double
     */
    double getCups();
    /**
     * Gets the name
     * @return Name of ingredient as String
     */
    String getName();
    /**
     * Checks if ingredient is dry
     * @return true if it is try and false if is wet
     */
    boolean isDry();

    /**
     * Prints Recipe
     */
    void printRecipe();

}
