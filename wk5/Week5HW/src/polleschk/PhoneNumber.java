/*
 * Course: CSC-1110 - 171
 * Fall 2023
 * Homework 5 - Phone Number Separation
 * Name: Kaiden Pollesch
 * Last Updated: 9/25/2023
 */

package polleschk;
import java.util.Scanner;

/**
 * This class will take input from user, in the form of a phone number,
 * then return each of the parts of the phone number
 * specifying what that part it is, broken up by the dashes.
 */

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Prompt the user to enter a phone number in the style of the given "cc-area-local"
        System.out.println("""
                Enter a phone number in the form cc-area-local
                cc = country code digits
                area = area code digits
                local = local phone digits
                Or enter q to Quit:\s""");
        //Stores the length of the string, and the index of both dashes into a variable
        String phoneNumber = input.nextLine();
        int firstDash = phoneNumber.indexOf("-");
        int secondDash = phoneNumber.lastIndexOf("-");
        int length = phoneNumber.length();

        //If the user inputs a q or Q then the program will quit
        if (phoneNumber.equalsIgnoreCase("q")) {
            System.out.println("This program was terminated.");

            // If a number is entered then it will return the values of each part of phone #
        } else {
            String countryCode = phoneNumber.substring(0, firstDash);
            System.out.println("Country Code = " + countryCode);
            String areaCode = phoneNumber.substring(firstDash + 1, secondDash);
            System.out.println("Area Code = " + areaCode);
            String localPhone = phoneNumber.substring(secondDash + 1, length);
            System.out.println("Local Phone Number = " + localPhone);
        }
    }
}