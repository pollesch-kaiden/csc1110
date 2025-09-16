/*
 * Course: CS1110
 * Calculate Taxes
 * Kaiden Pollesch
 * Fall 2023
 */

import java.util.Scanner;

public class CalculateTaxes{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Are you a single filer or a married joint filer (enter 's' or 'j';");
        String inputStatus = in.nextLine();
        System.out.println("Enter an estimate of your earned income for 2022:");
        String input = in.nextLine();
        double inputIncome = Double.parseDouble(input);

        //single tax statement
        double singleTenPercent = inputIncome * 0.10;
        double singleTwelvePercent = (inputIncome - 10275) * 0.12 + singleTenPercent;
        double singleTwentyTwoPercent = (inputIncome - 41775) * 0.22 + singleTwelvePercent;
        double singleTwentyFourPercent = (inputIncome - 89075) * 0.24 + singleTwentyTwoPercent;
        double singleThirtyTwoPercent = (inputIncome - 170050) * 0.32 + singleTwentyFourPercent;
        double singleThirtyFivePercent = (inputIncome - 215950) * 0.35 + singleThirtyTwoPercent;
        double singleThirtySevenPercent = (inputIncome - 539900) * 0.37 + singleThirtyFivePercent;

        //married tax amount
        double marriedTenPercent = inputIncome * 0.10;
        double marriedTwelvePercent = (inputIncome - 20550) * 0.12 + marriedTenPercent;
        double marriedTwentyTwoPercent = (inputIncome - 83550) * 0.22 + marriedTwelvePercent;
        double marriedTwentyFourPercent = (inputIncome - 178150) * 0.24 + marriedTwentyTwoPercent;
        double marriedThirtyTwoPercent = (inputIncome - 340100) * 0.32 + marriedTwentyFourPercent;
        double marriedThirtyFivePercent = (inputIncome - 432900) * 0.35 + marriedThirtyTwoPercent;
        double marriedThirtySevenPercent = (inputIncome - 647850) * 0.37 + marriedThirtyFivePercent;

        //Single tax rate
        double singleTenTaxRate = singleTenPercent / inputIncome * 100;
        double singleTwelveTaxRate = singleTwelvePercent / inputIncome * 100;
        double singleTwentyTwoTaxRate = singleTwentyTwoPercent / inputIncome * 100;
        double singleTwentyFourTaxRate = singleTwentyFourPercent / inputIncome * 100;
        double singleThirtyTwoTaxRate = singleThirtyTwoPercent / inputIncome * 100;
        double singleThirtyFiveTaxRate = singleThirtyFivePercent / inputIncome * 100;
        double singleThirtySevenTaxRate = singleThirtySevenPercent / inputIncome * 100;

        //Married tax rate
        double marriedTenTaxRate = singleTenPercent / inputIncome * 100;
        double marriedTwelveTaxRate = singleTwelvePercent / inputIncome * 100;
        double marriedTwentyTwoTaxRate = singleTwentyTwoPercent / inputIncome * 100;
        double marriedTwentyFourTaxRate = singleTwentyFourPercent / inputIncome * 100;
        double marriedThirtyTwoTaxRate = singleThirtyTwoPercent / inputIncome * 100;
        double marriedThirtyFiveTaxRate = singleThirtyFivePercent / inputIncome * 100;
        double marriedThirtySevenTaxRate = singleThirtySevenPercent / inputIncome * 100;

        if (inputStatus.equals("s")) {
            if (inputIncome >= 0 && inputIncome <= 10275) {
                System.out.printf("Your estimated taxes for 2023 are: $%.2f%n", singleTenPercent);
                System.out.printf("This result in an %.1f%% effective tax rate.%n", singleTenTaxRate);
            } else if (inputIncome >= 10276 && inputIncome <= 41775) {
                System.out.printf("Your estimated taxes for 2023 are: $%.2f%n", singleTwelvePercent);
                System.out.printf("This result in an %.1f%% effective tax rate.%n", singleTwelveTaxRate);
            } else if (inputIncome >= 41776 && inputIncome <= 89075) {
                System.out.printf("Your estimated taxes for 2023 are: $%.2f%n", singleTwentyTwoPercent);
                System.out.printf("This result in an %.1f%% effective tax rate.%n", singleTwentyTwoTaxRate);
            } else if (inputIncome >= 89076 && inputIncome <= 170050) {
                System.out.printf("Your estimated taxes for 2023 are: $%.2f%n", singleTwentyFourPercent);
                System.out.printf("This result in an %.1f%% effective tax rate.%n", singleTwentyFourTaxRate);
            } else if (inputIncome >= 170051 && inputIncome <= 215950) {
                System.out.printf("Your estimated taxes for 2023 are: $%.2f%n", singleThirtyTwoPercent);
                System.out.printf("This result in an %.1f%% effective tax rate.%n", singleThirtyTwoTaxRate);
            } else if (inputIncome >= 215951 && inputIncome <= 539900) {
                System.out.printf("Your estimated taxes for 2023 are: $%.2f%n", singleThirtyFivePercent);
                System.out.printf("This result in an %.1f%% effective tax rate.%n", singleThirtyFiveTaxRate);
            } else if (inputIncome >= 539901) {
                System.out.printf("Your estimated taxes for 2023 are: $%.2f%n", singleThirtySevenPercent);
                System.out.printf("This result in an %.1f%% effective tax rate.%n", singleThirtySevenTaxRate);
            }
        } else if (inputStatus.equals("j")) {
            if (inputIncome >= 0 && inputIncome <= 20550) {
                System.out.printf("Your estimated taxes for 2023 are: $%.2f%n",marriedTenPercent);
                System.out.printf("This result in an %.1f%% effective tax rate.%n",marriedTenTaxRate);
            } else if (inputIncome >= 10276 && inputIncome <= 83550) {
                System.out.printf("Your estimated taxes for 2023 are: $%.2f%n", marriedTwelvePercent);
                System.out.printf("This result in an %.1f %%effective tax rate.%n", marriedTwelveTaxRate);
            } else if (inputIncome >= 41776 && inputIncome <= 178150) {
                System.out.printf("Your estimated taxes for 2023 are: $%.2f%n", marriedTwentyTwoPercent);
                System.out.printf("This result in an %.1f%% effective tax rate.%n", marriedTwentyTwoTaxRate);
            } else if (inputIncome >= 89076 && inputIncome <= 340100) {
                System.out.printf("Your estimated taxes for 2023 are: $%.2f%n", marriedTwentyFourPercent);
                System.out.printf("This result in an %.1f %%effective tax rate.%n", marriedTwentyFourTaxRate);
            } else if (inputIncome >= 170051 && inputIncome <= 431900) {
                System.out.printf("Your estimated taxes for 2023 are: $%.2f%n", marriedThirtyTwoPercent);
                System.out.printf("This result in an %.1f%% effective tax rate.%n", marriedThirtyTwoTaxRate);
            } else if (inputIncome >= 215951 && inputIncome <= 647850) {
                System.out.printf("Your estimated taxes for 2023 are: $%.2f%n", marriedThirtyFivePercent);
                System.out.printf("This result in an %.1f%% effective tax rate.%n", marriedThirtyFiveTaxRate);
            } else if (inputIncome >= 647851) {
                System.out.printf("Your estimated taxes for 2023 are: $%.2f%n", marriedThirtySevenPercent);
                System.out.printf("This result in an %.1f%% effective tax rate.%n", marriedThirtySevenTaxRate);
            }
        } else {
            System.out.println("This is not a valid input");
        }
    }
}