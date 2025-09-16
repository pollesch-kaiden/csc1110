/*
 * Course: CSC-1110 - 171
 * Fall 2023
 * Lab 5 - Growth Rate
 * Name: Kaiden Pollesch
 * Last Updated: 9/25/2023
 */

package polleschk;
import java.util.Scanner;
import java.lang.Math;

/**
 * This will class will randomly generate a number of weeks,
 * then randomly generate a number between 0 -5000 that the uncle will
 * give you every week, and then they pick option one which is linear,
 * or option two which is exponential and depending on the random numbers
 * they will either get more money than the other option or less than
 * the other option.
 */

public class GrowthRate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner again = new Scanner(System.in);
        int i = 1;
        while (i == 1) {
            System.out.println("""
                    Your favorite grandmother gives you two options.\s
                    The first option gives you a random amount of money that doubles every week as long as she is alive, (random amount of weeks) Enter "1"
                    The second option, you get a pennie that exponentially grows every week. (doubling from the previous week) Enter "2"
                    Finally Enter "3" to quit the game.""");
            String option = in.nextLine();
            //Generates a number between 0 and 5000 for the number they would get every week
            double linearGrowthNumber = Math.random() * 5000;
            //Generates a number between 0 and 40 for the number of weeks until the Uncle dies
            int numOfWeeks = (int) (Math.random() * 40);
            //User chose linear amount of money.
            if (option.equalsIgnoreCase("1")) {
                for (i = 1; i < numOfWeeks; i++) {
                    double linearGrowth = linearGrowthNumber * i;
                    double exponentialGrowth = 0.01 * (Math.pow(2, i - 1));
                    if (linearGrowth > exponentialGrowth) {
                        System.out.printf("Week %d Linear: %.2f, Exponential: %.2f\n", i, linearGrowth, exponentialGrowth);
                    }
                }
                System.out.println("Your favorite grandmother dies after " + numOfWeeks + " weeks so you");
                double linearGrowth = linearGrowthNumber * i;
                double exponentialGrowth = 0.01 * (Math.pow(2, i - 1));
                if (linearGrowth > exponentialGrowth) {
                    double difference = linearGrowth - exponentialGrowth;
                    System.out.printf("got lucky and ended up with an extra $%.2f.\n", difference);
                    //Play again question
                    System.out.println("Do you want to play again? (1 for yes) or (0 for no)");
                    String playAgain = again.nextLine();
                    if (playAgain.equalsIgnoreCase("1")) {
                        i = 1;
                    }

                } else {
                    double difference = exponentialGrowth - linearGrowth;
                    System.out.printf("got unlucky and missed out on $%.2f.\n", difference);
                    //Play again question
                    System.out.println("Do you want to play again? (1 for yes) or (0 for no)");
                    String playAgain = again.nextLine();
                    if (playAgain.equalsIgnoreCase("1")) {
                        i = 1;
                    }
                }
            }
            //User chose exponential amount of money.
            else if (option.equalsIgnoreCase("2")) {
                for (i = 0; i < numOfWeeks; i++) {
                    double linearGrowth = linearGrowthNumber * i;
                    double exponentialGrowth = 0.01 * (Math.pow(2, i - 1));
                    System.out.printf("Week %d Linear: %.2f, Exponential: %.2f\n", i, linearGrowth, exponentialGrowth);
                }
                System.out.println("Your favorite grandmother dies after " + numOfWeeks + " weeks so you");
                double linearGrowth = linearGrowthNumber * i;
                double exponentialGrowth = 0.01 * (Math.pow(2, i - 1));
                if (linearGrowth < exponentialGrowth) {
                    double difference = exponentialGrowth - linearGrowth;
                    System.out.printf("got lucky and ended up with an extra $%.2f.\n", difference);
                    //Play again question
                    System.out.println("Do you want to play again? (1 for yes) or (0 for no)");
                    String playAgain = again.nextLine();
                    if (playAgain.equalsIgnoreCase("1")) {
                        i = 1;
                    }
                } else {
                    double difference = linearGrowth - exponentialGrowth;
                    System.out.printf("got unlucky and missed out on $%.2f.\n", difference);
                    //Play again question
                    System.out.println("Do you want to play again? (1 for yes) or (0 for no)");
                    String playAgain = again.nextLine();
                    if (playAgain.equalsIgnoreCase("1")) {
                        i = 1;
                    }
                }
                //User chose to quite the game
            } else if (option.equalsIgnoreCase("3")) {
                System.out.println("You have chosen to quit this game.");
                break;

            }
        }
    }
}