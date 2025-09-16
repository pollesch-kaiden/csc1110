/**
 * Course: CSC-1110
 * Fall 2023
 * Homework 6 - Vending Machine
 * Name: Kaiden Pollesch
 * Last Updated: 10-06-23
 */

package polleschk;

/**
 * This class does all the calculations that a vending machine would do.
 */
public class VendingMachine {
    private double paymentSum;

    /**
     * This constructor sets the payment sum to zero
     * */
    public VendingMachine(){
        this.paymentSum = 0;
    }
    /**
     * This constructor has a parameter, amount, and adds that and updates
     * that to the new payment sum amount.
     * @param amount is the amount that the user will enter
     */
    public void insertMoney(double amount){
        this.paymentSum += amount;
    }
    public double getInsertedMoney(){
        return paymentSum;
    }
    /**
     * This method takes the total inserted amount and subtracts the item price and determines
     * how many quarters, dimes, nickels, and pennies they will get as change. Then return
     * the amount of change that it will give to each item
     */
    public ChangeDetails selectItem(double insertedMoney, double itemPrice) {
        double returnChange = insertedMoney - itemPrice;
        final double quarterValue = 0.25;
        final double dimeValue = 0.10;
        final double nickelValue = 0.05;
        final double penneyValue = 0.01;
        ChangeDetails change = new ChangeDetails();

        change.setQuarters((int) (returnChange / quarterValue));
        double quarterRemainder = returnChange % quarterValue;
        change.setDimes((int) (quarterRemainder / dimeValue));
        double dimeRemainder = quarterRemainder % dimeValue;
        change.setNickels((int) (dimeRemainder / nickelValue));
        double nickelRemainder = dimeRemainder % nickelValue;
        change.setPennies((int) Math.round(nickelRemainder / penneyValue));

        return change;
    }
}
