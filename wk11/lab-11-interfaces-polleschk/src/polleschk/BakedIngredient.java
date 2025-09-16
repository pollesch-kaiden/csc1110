/*
 * Course: CSC1110 - 171
 * Fall 2023
 * Lab 11 - Interfaces
 * Name: Kaiden Pollesch
 * Created: 11/8/2023
 */
package polleschk;

/**
 * The class BakedIngredient and implements Ingredients interface
 */
public class BakedIngredient implements Ingredient {
    private final Ingredient baseIngredient;
    private final double expansionFactor;

    /**
     * BakedIngredient constructor
     * @param ingredient the variable baseIngredient that holds instance of Ingredient
     * @param expansionFactor the variable expansionFactor that holds instance of expansionFactor
     */
    public BakedIngredient(Ingredient ingredient, double expansionFactor){
        baseIngredient = ingredient;
        this.expansionFactor = expansionFactor;
    }

    @Override
    public double getCalories() {
        return baseIngredient.getCalories();
    }

    @Override
    public double getCups() {
        return baseIngredient.getCups() * expansionFactor;
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
                Baked %s
                ====================================================
                Ingredient to be baked: %s
                Cups: %s Cups
                Energy: %s Calories
                """, getName(), getName(), Ingredient.CUP_FORMAT.format(getCups()),
                Ingredient.CUP_FORMAT.format(getCalories()));
        //Follow the print Baked Ingredient by printing base Ingredient
        baseIngredient.printRecipe();
    }
}
