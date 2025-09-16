/*
 * Course: CSC1110 - 171
 * Fall 2023
 * Lab 11 - Interfaces
 * Name: Kaiden Pollesch
 * Created: 11/8/2023
 */
package polleschk;

import java.util.ArrayList;

/**
 * The class Mix and implements Ingredients interface
 */
public class Mix implements Ingredient {
    private final ArrayList<Ingredient> ingredients;
    private final String name;

    /**
     * Constructor for Mix class
     * @param name the variable name that holds instance of name
     */
    public Mix(String name) {
        this.name = name;
        ingredients = new ArrayList<>();
    }

    /**
     * Adds a new ingredient to the mix ArrayList
     * @param ingredient adds this ingredient to the ingredients ArrayList
     */
    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    /**
     * Method hasDryIngredient returns if the mixture has a dry ingredient
     * @return true if it has dry ingredient
     */
    public boolean hasDryIngredient(){
        for (Ingredient ingredient : ingredients) {
            if (ingredient.isDry()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Method hasWetIngredient returns if the mixture has a wet ingredient
     * @return true if it has wet ingredient
     */
    public boolean hasWetIngredient(){
        for (Ingredient ingredient : ingredients) {
            if (!ingredient.isDry()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double getCalories() {
        double totalCalories = 0;
        for (Ingredient ingredient : ingredients) {
            totalCalories += ingredient.getCalories();
        }
        return totalCalories;
    }

    @Override
    public double getCups() {
        double totalCups = 0;
        for (Ingredient ingredient : ingredients) {
            totalCups += ingredient.getCups();
        }
        return totalCups;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isDry() {
        for (Ingredient ingredient : ingredients) {
            if (!ingredient.isDry()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void printRecipe() {
        System.out.printf("""
                ====================================================
                %s
                ====================================================
                """, getName());
        if (hasDryIngredient()) {
            System.out.println("Dry Ingredients:");
            for (Ingredient ingredient : ingredients) {
                if (ingredient.isDry()) {
                    System.out.println(" " + ingredient.getName());
                }
            }
        }
        if (hasWetIngredient()) {
            System.out.println("\nWet Ingredients;");
            for (Ingredient ingredient : ingredients) {
                if (!ingredient.isDry()) {
                    System.out.println(" " + ingredient.getName());
                }
            }
        }
        System.out.printf("""
                \nCups: %s Cups
                Energy: %s Calories
                """,
                Ingredient.CUP_FORMAT.format(getCups()),
                Ingredient.CUP_FORMAT.format(getCalories()));

        for (Ingredient ingredient : ingredients){
            ingredient.printRecipe();
        }
    }
}
