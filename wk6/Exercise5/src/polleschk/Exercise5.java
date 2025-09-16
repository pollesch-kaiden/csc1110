package polleschk;

/* Course: CSC-1110
 * Fall 2023
 * Exercise 5 - Dice
 * Name: Kaiden Pollesch
 * Last Updated: 7-26-23
 */

/**
 * Driver class for some dice
 */
public class Exercise5 {
    public static void main(String[] args) {
        /* This is for user input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of sides for one of your Die: ");
        String input = in.nextLine();
        int userInput = Integer.parseInt(input);
        */
        final int twentySides = 20;
        Die coin = new Die(2);
        Die d6 = new Die();
        Die d20 = new Die(twentySides);
        System.out.println("Flipping a coin: " + flipCoin(coin));
        System.out.println("Rolling a d6 and d20: " + rollTwoDice(d6, d20));
    }

    private static int flipCoin(Die coin) {
        return coin.getCurrentValue();
    }

    private static int rollTwoDice(Die d1, Die d2) {
        int sum = d1.getCurrentValue() + d2.getCurrentValue();
        return sum;
    }
}