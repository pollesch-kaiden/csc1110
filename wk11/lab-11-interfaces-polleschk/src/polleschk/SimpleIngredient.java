/*
 * Course: CSC1110 - 171
 * Fall 2023
 * Lab 11 - Interfaces
 * Name: Kaiden Pollesch
 * Created: 11/8/2023
 */
package polleschk;

/**
 * The class SimpleIngredient and implements Ingredients interface
 */
public class SimpleIngredient implements Ingredient {
    private final double calories;
    private final double cups;
    private final boolean isDry;
    private final String name;

    /**
     * Constructor for SimpleIngredient class
     * @param calories the variable calories that holds instance of calories
     * @param cups the variable cups that holds instance of cups
     * @param isDry the variable isDry that holds instance of isDry
     * @param name the variable name that holds instance of name
     */
    public SimpleIngredient(double calories, double cups, boolean isDry, String name){
        this.calories = calories;
        this.cups = cups;
        this.isDry = isDry;
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public double getCups() {
        return cups;
    }

    public boolean isDry() {
        return isDry;
    }

    public String getName() {
        return name;
    }

    /**
     *This method is to print
     */
    public void printRecipe(){
        System.out.printf("""
                ====================================================
                %s
                ====================================================
                Cups: %s Cup(s)
                Energy: %s Calories
                """, getName(),
                Ingredient.CUP_FORMAT.format(cups),
                Ingredient.CUP_FORMAT.format(calories));

    }
}
