/*
 * Course: CSC-1110 - 171
 * Fall 2023
 * Homework 4 - VariableNameChecker
 * Name: Kaiden Pollesch
 * Last Updated: 9/21/2023
 */

package polleschk;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class VariableNameChecker {
    public static void main(String[] args) {
        Scanner variableIn = new Scanner(System.in);
        System.out.println("This program checks the properness of a proposed Java variable name.");
        System.out.print("Enter a variable name (q to quit): ");
        boolean programOn = true;
        do {
            String variableName = variableIn.nextLine();
            if (variableName.equals("q")) {
                System.out.println("Program terminated.");
                programOn = false;
            } else if (variableName.contains(" ")) {
                System.out.println("Illegal, cannot contain a space in middle of variable.");
            } else if (Character.isUpperCase(variableName.charAt(0))) {
                System.out.println("Legal, but uses poor style. Variable name should start with a lowercase letter.");
            } else if (Character.isDigit(variableName.charAt(0))) {
                System.out.println("Illegal, variable name should start with a lowercase letter.");
            } else if ((variableName.contains("_") || (variableName.contains("$")))) {
                System.out.println("Legal, but uses poor style. Variable name not contain underscores or dollar signs.");
            } else if (Character.isLowerCase(variableName.charAt(0))) {
                System.out.println("Good! You typed a variable with good style.");
            }
        } while (programOn);
    }
}