/**
 * Course: CSC-1110
 * Fall 2023
 * Homework 6 - Vending Machine
 * Name: Kaiden Pollesch
 * Last Updated: 10-07-23
 */

package polleschk;

/**
 * This class will ask user to read a prompt, enter a letter
 * matching with that they want to do such as inserting money,
 * selecting an item, or quitting the code. The methods at the bottom
 * deal with the inserting of the money or selecting the items the user wants
 * then it ensures that the money and item cost are correct and work
 * like a vending machine.
 */
public class ChangeDetails {
    private int quarters;
    private int dimes;
    private int nickels;
    private int pennies;

    /**
     * This constructor sets all the coin values to 0 before running
     * the amount of coins in each category.
     */
    public ChangeDetails(){
        quarters = 0;
        dimes = 0;
        nickels = 0;
        pennies = 0;
    }
    public void setQuarters(int quarters) {
        this.quarters = quarters;
    }
    public void setNickels(int nickels) {
        this.nickels = nickels;
    }
    public void setDimes(int dimes) {
        this.dimes = dimes;
    }
    public void setPennies(int pennies) {
        this.pennies = pennies;
    }

    /**
     * This constructor prints out the amount of
     * quarters, dimes, nickels, and pennies the customer will
     * receive in change.
     */
    public void printChangeDetails() {
        System.out.println("Your change\n ===========");
        System.out.println(quarters + " quarter(s)");
        System.out.println(dimes + " dime(s)");
        System.out.println(nickels + " nickel(s)");
        System.out.println(pennies + " penny(ies)");

    }
}
