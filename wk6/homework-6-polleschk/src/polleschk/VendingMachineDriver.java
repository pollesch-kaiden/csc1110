/**
 * Course: CSC-1110
 * Fall 2023
 * Homework 6 - Vending Machine
 * Name: Kaiden Pollesch
 * Last Updated: 10-06-23
 */

package polleschk;
import java.util.Scanner;

/**
 * This class will ask user to read a prompt, enter a letter
 * matching with that they want to do such as inserting money,
 * selecting an item, or quitting the code. The methods at the bottom
 * deal with the inserting of the money or selecting the items the user wants
 * then it ensures that the money and item cost are correct and work
 * like a vending machine.
 */
public class VendingMachineDriver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char choice;
        boolean done = false;

        VendingMachine vendingMachine = new VendingMachine();

        System.out.println("Welcome to John's vending machine!\n");

        do {
            System.out.println("Options: (i)nsert money, (s)elect an item, (q)uit");
            System.out.print("Enter i, s, or q ==> ");
            choice = in.nextLine().charAt(0);

            switch (choice) {
                case 'i', 'I' -> handleInsertMoney(vendingMachine);
                case 's', 'S' -> handleSelectItem(vendingMachine);
                case 'q', 'Q' -> done = true;
                default -> System.out.println("Invalid selection.");
            }
        } while (!done);
    }
    private static void handleInsertMoney(VendingMachine vendingMachine) {
        double amount;
        do{
            amount = getAmount("Amount inserted: ");
            if(amount <=0) {
                System.out.println("Invalid payment. Must enter a positive number.");
            } else {
                vendingMachine.insertMoney(amount);
            }
        } while (amount<=0);

    }

    private static void handleSelectItem(VendingMachine vendingMachine) {
        double itemAmount;
        double insertedMoney = vendingMachine.getInsertedMoney();
        if(insertedMoney <= 0){
            System.out.println("Please insert money");
        } else{
            do{
                itemAmount = getAmount("Select Item's price: ");
                if(itemAmount <= 0){
                    System.out.println("Invalid price. Must enter a positive number.");
                }
            } while(itemAmount <= 0);
            if(itemAmount <= insertedMoney){
                ChangeDetails changeDetails = vendingMachine.selectItem(insertedMoney, itemAmount);
                changeDetails.printChangeDetails();
            } else{
                System.out.println("Not enough money inserted");
            }
        }
    }

    private static double getAmount(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        String amountString = scanner.nextLine();
        return Double.parseDouble(amountString);
    }
}
