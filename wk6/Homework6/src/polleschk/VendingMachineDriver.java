/*
 * Course: CSC-1110
 * Fall 2023
 * Homework 6
 * Name: Kaiden Pollesch
 * Last Updated: 10/5/2023
 */

package polleschk;
import java.util.Scanner;

public class VendingMachineDriver {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char choice;
        boolean done = false;

        VendingMachine vm = new VendingMachine();

        System.out.println("Welcome to John's vending machine!\n");

        do {
            System.out.println("Options: (i)nsert money, (s)elect an item, (q)uit");
            System.out.print("Enter i, s, or q ==> ");
            choice = in.nextLine().charAt(0);

            switch (choice) {
                case 'i', 'I' -> vm.insertMoney();
                case 's', 'S' -> vm.selectItem();
                case 'q', 'Q' -> done = true;
                default -> System.out.println("Invalid selection.");
            }
        } while(!done);
    }
}