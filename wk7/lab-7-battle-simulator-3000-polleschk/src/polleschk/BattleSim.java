/*
 * Course: CS1011 - 171
 * Fall 2022
 * Lab 7 - Battle Simulator 3000
 * Name: Kaiden Pollesch
 * Created: 10/11/2023
 */
package polleschk;

import java.util.Scanner;


/**
 * BattleSim Driver for Battle Simulator 3000
 */
public class BattleSim {
    /**
     * This static int holds 1 and says that the Warrior will attack first
     */
    public static final int WARRIOR_HAS_INITIATIVE = 1;
    /**
     * This static int holds 2 and says that the Mugwump will attack first
     */
    public static final int MUGWUMP_HAS_INITIATIVE = 2;

    /**
     * Ten-sided die to be used for checking initiative by all classes
     */
    private static boolean programOn = true;

    public static void main(String[] args) {
        // Local variables
        // Include any variable that will need to be accessed throughout the program here

        // sentinel value for the game loop
        // String used to determine the winner of the epic battle
        String victor = "none";
        // game loop
        do {
            // print the introduction and rules
            intro();

            // initialize game
            // Initialize the Warrior and Mugwump classes, set the current victor to "none"
            Warrior warrior = new Warrior();
            Mugwump mugwump = new Mugwump();
            Scanner in = new Scanner(System.in);

            // while neither combatant has lost all of their hit points, report status and battle!
            while (victor.equalsIgnoreCase("none")) {
                report(warrior, mugwump);
                victor = battle(warrior, mugwump, in);
            }
            // declare the winner
            victory(victor);
            // ask to play again
            programOn = playAgain(in);
            victor = "none";
        } while(programOn);
        // Thank the user for playing your game
        System.out.println("Thank you for playing Battle Simulator 3000!");
    }

    /**
     * This method displays the introduction to the game and gives a description of the rules.
     */
    private static void intro() {
        // Write a suitable introduction to your game
        System.out.println("""
                    Welcome to Battle Simulator 3000! The world's more low tech battle simulator!
                    You are a Valiant Warrior defending your humble village from an evil Mugwump!
                    Fight bravely, or the citizens of your town will be the Mugwump's dinner!
                    
                    You have your Trusty Sword,
                    which deals decent damage, but can be tough to hit with sometimes.
                    You also have your Shield of Light,
                    which is not as strong as your sword, but is easier to deal damage with.
                    Let the epic battle begin!""");
    }

    /**
     * This method handles the battle logic for the game.
     * @param warrior The Warrior of Light!
     * @param mugwump The Evil Mugwump!
     * @return The name of the victor, or "none", if the battle is still raging on
     */
    private static String battle(Warrior warrior, Mugwump mugwump, Scanner in) {
        // determine who attacks first (Roll! For! Initiative!) and store the result

        int whoGoesFirst = initiative();
        if (whoGoesFirst == WARRIOR_HAS_INITIATIVE) {
            // attack code
            System.out.println("The Warrior attacks first!");
            // If the Warrior attacks first
            int warAttackDamage = warrior.attack(attackChoice(in));
            // Warrior attacks and assigns the resulting damage to the Mugwump
            mugwump.takeDamage(warAttackDamage);

            report(warrior, mugwump);

            // Check if the Mugwump has been defeated
            // If not, Mugwump attacks!
            if (mugwump.getHitPoints() <= 0) {
                return "warrior";
            } else {
                int mugAttackDamage = mugwump.attack();
                if (!(mugAttackDamage < 0)){
                    warrior.takeDamage(mugAttackDamage);
                }
                if (warrior.getHitPoints() <= 0) {
                    return "mugwump";
                } else {
                    return "none";
                }
            }
            // Otherwise, the Warrior wins!
        } else {
            // attack code
            System.out.println("The Mugwump attacks first!");
            // If the Mugwump attacks first
            int mugAttackDamage = mugwump.attack();
            // Mugwump attacks and assigns the resulting damage to the Warrior
            if (!(mugAttackDamage < 0)){
                warrior.takeDamage(mugAttackDamage);
            }
            report(warrior, mugwump);

            // Check if the Warrior has been defeated
            // If not, Warrior attacks!
            if (warrior.getHitPoints() <= 0) {
                return "mugwump";
            } else {
                int warAttackDamage = warrior.attack(attackChoice(in));
                mugwump.takeDamage(warAttackDamage);
                if (mugwump.getHitPoints() <= 0) {
                    return "warrior";
                } else {
                    return "none";
                }

            }
            // Otherwise, the Mugwump wins!

        }
        // If neither combatant is defeated, the battle rages on!
    }

    /**
     * This method reports the status of the combatants
     * @param warrior The Warrior of Light!
     * @param mugwump The Evil Mugwump!
     */
    private static void report(Warrior warrior, Mugwump mugwump) {
        System.out.println("Warrior HP: " + warrior.getHitPoints());
        System.out.println("Mugwump HP: " + mugwump.getHitPoints());
    }
    /**
     * This method asks the user what attack type they want to use and returns the result
     * @return 1 for sword, 2 for shield
     */
    private static int attackChoice(Scanner in) {
        System.out.print("""
                How would you like to attack?
                (If a number other than 1 or 2 is entered, that will result in a loss of a turn)
                1. Your Trusty Sword
                2. Your Shield of Light
                Enter Your Choice: """);
        return in.nextInt();
    }

    /**
     * Determines which combatant attacks first and returns the result. In the case of a tie,
     * re-roll.
     * @return 1 if the warrior goes first, 2 if the mugwump goes first
     */
    private static int initiative() {
        final int tenSideDie = 10;
        // roll for initiative for both combatantsDie
        Die dieMug = new Die(tenSideDie);
        Die dieWar = new Die(tenSideDie);
        int mugwump = dieMug.getCurrentValue();
        int warrior = dieWar.getCurrentValue();

        while (mugwump == warrior) {
            dieMug.roll();
            dieWar.roll();
            mugwump = dieMug.getCurrentValue();
            warrior = dieWar.getCurrentValue();
        }
        if (warrior > mugwump){
            return WARRIOR_HAS_INITIATIVE;
        } else {
            return MUGWUMP_HAS_INITIATIVE;
        }
        // until one initiative is greater than the other
    }

    /**
     * This method declares the victor of the epic battle
     * @param victor the name of the victor of the epic battle
     */
    private static void victory(String victor) {
        if (victor.equalsIgnoreCase("warrior")){
            System.out.println("The Warrior is the victor of the epic battle.\n" +
                    "The citizens cheer and invite you back to town for a feast," +
                    " as thanks for saving their lives (again)!");
        } else {
            System.out.println("The Mugwump is the victor of the epic battle.\n" +
                    "The citizens of the town are all dead as the Mugwump takes their lives!");
        }
    }

    /**
     * This method asks the user if they would like to play again
     * @param in Scanner
     * @return true if yes, false otherwise
     */

    private static boolean playAgain(Scanner in) {
        while (true) {
            System.out.print("Would you like to play again? (yes/no): ");
            String input = in.next().toLowerCase();
            if (input.equals("yes") || input.equals("y")) {
                return true;
            } else if (input.equals("no") || input.equals("n")) {
                return false;
            } else {
                System.out.println("That was an invalid input!\n" +
                        "Please enter a valid input 'yes' or 'no'");
            }
        }
    }
}