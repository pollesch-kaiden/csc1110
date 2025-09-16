/*
 * Course: CSC1110 - 171
 * Fall 2023
 * Lab 11 - Interfaces
 * Name: Kaiden Pollesch
 * Created: 11/8/2023
 */
package polleschk;

/**
 * The class Measure and implements Ingredients interface
 */
public class Measure implements Ingredient {
    private final Ingredient baseIngredient;
    private final int numerator;
    private final int denominator;

    /**
     * first constructor Measure
     * @param numerator top of the fraction
     * @param denominator bottom of the fraction
     * @param ingredient the ingredient
     */
    public Measure(int numerator, int denominator, Ingredient ingredient) {
        this.numerator = numerator;
        this.denominator = denominator;
        baseIngredient = ingredient;
    }

    /**
     * second constructor measure
     * @param numerator top of the fraction
     * @param ingredient the ingredient
     */
    public Measure(int numerator, Ingredient ingredient) {
        this.numerator = numerator;
        baseIngredient = ingredient;
        denominator = 1;
    }

    @Override
    public double getCalories() {
        return (double) numerator / denominator * baseIngredient.getCalories();
    }

    @Override
    public double getCups() {
        return (double) numerator / denominator * baseIngredient.getCups();
    }

    @Override
    public String getName() {
        return baseIngredient.getName();
    }

    @Override
    public boolean isDry() {
        return true;
    }

    @Override
    public void printRecipe() {
        System.out.printf("""
                ====================================================
                Measured %s
                ====================================================
                Quantity: %s
                Cups: %s Cups
                Energy: %s Calories
                """, getName(), formatQuantity(),
                Ingredient.CUP_FORMAT.format(getCups()),
                Ingredient.CUP_FORMAT.format(getCalories()));
        //Follow the print Baked Ingredient by printing base Ingredient
        baseIngredient.printRecipe();
    }
    private String formatQuantity(){
        if (denominator == 1){
            return String.valueOf(numerator);
        } else {
            return numerator + "/" + denominator;
        }
    }
}
