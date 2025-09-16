/*
 * Course: CSC1011 - 171
 * Fall 2023
 * Lab 9 - Parking Lots
 * Name: Kaiden Pollesch
 * Created: 10/26/2023
 */

package polleschk;

import java.util.Scanner;

/**
 * Driver class used to test color classes.
 * @author Kaiden Pollesch
 */
public class ColorDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputInt;
        String inputString;
        System.out.println("""
                Welcome to Number Converter 3000!
                This program will take a decimal number
                and convert it to binary and hexadecimal representations""");
        System.out.println(Color.GREEN + "Decimal will be displayed in green");
        System.out.println(Color.YELLOW + "Hexadecimal will be displayed in yellow");
        System.out.println(Color.CYAN + "Hexadecimal will be displayed in cyan" + Color.RESET);
        do {
            System.out.println("Please enter a number to convert (or q to quit)");
            inputString = scanner.next();
            if (validate(inputString)){
                inputInt = Integer.parseInt(inputString);
                display(inputInt);
                inputString = "";
            } else if (inputString.equalsIgnoreCase("q")){
                System.out.println("Thank you for using Number Converter 3000!");
            }
        } while (!validate(inputString) && !(inputString.equalsIgnoreCase("q")));

    }
    private static boolean validate(String stringInput){
        try {
            Integer.parseInt(stringInput);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private static void display(int inputInt){
        System.out.println(Color.GREEN + "Decimal: " + inputInt + Color.RESET);
        System.out.println(Color.YELLOW + "Hexadecimal: " + "0x" +
                           Integer.toHexString(inputInt) + Color.RESET);
        System.out.println(Color.CYAN + "Binary: " +
                           Integer.toBinaryString(inputInt) + Color.RESET);
    }
}
