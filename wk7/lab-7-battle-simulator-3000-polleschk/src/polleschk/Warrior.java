/*
 * Course: CS1011 - 171
 * Fall 2022
 * Lab 7 - Battle Simulator 3000
 * Name: Kaiden Pollesch
 * Created: 10/11/2023
 */

package polleschk;
/**
 * This class declares all variables for the class
 * and hold the methods that make the Warrior work.
 */
public class Warrior {
    private int hitPoints;
    private Die d20;
    private Die d10;
    private Die d8;
    private Die d4;

    /**
     * This constructor is where all instance variables are set
     * and held.
     */
    public Warrior(){
        final int twentySides = 20;
        final int tenSides = 10;
        final int eightSides = 8;
        final int fourSides = 4;
        d20 = new Die(twentySides);
        d10 = new Die(tenSides);
        d8 = new Die(eightSides);
        d4 = new Die(fourSides);
        setInitialHitPoints();
    }
    public int getHitPoints(){
        return hitPoints;
    }

    /**
     * This method takes away health from the Warrior as the mugwump attacks it.
     * @param damage is the input for how much damage the Mugwump is dealing to
     *               the Warrior.
     */
    public void takeDamage(int damage){
        if (hitPoints - damage < 0){
            hitPoints = 0;
        } else {
            hitPoints -= damage;
        }
    }

    /**
     * This method takes input from the user to determine what attack they
     * want to use when attacking the Mugwump.
     * @param type '1' or '2' depending on what attack you want to do
     * @return it will return the amount of damage that, that attack will deal.
     */
    public int attack(int type){
        int attackDamage;
        d20.roll();
        int roll = d20.getCurrentValue();
        if (type == 1) {
            System.out.print("You swing your sword and");
            final int twelve = 12;
            if (roll >= twelve) {
                d8.roll();
                attackDamage = d8.getCurrentValue();
                d8.roll();
                attackDamage += d8.getCurrentValue();
                System.out.printf(", and hit the foul creature causing %d " +
                        "hit points of damage.\n", attackDamage);
                return attackDamage;
            } else {
                System.out.println(", miss the foul creature!");
                return 0;
            }
        } else if (type == 2) {
            System.out.print("You swing your Shield of Light");
            final int six = 6;
            if (roll >= six){
                d4.roll();
                attackDamage = d4.getCurrentValue();
                System.out.printf(", and hit the foul creature causing %d " +
                        "hit points of damage.\n", attackDamage);
                return attackDamage;
            } else {
                System.out.println(", and miss the foul creature!");
                return 0;
            }
        } else {
            System.out.println("Please enter a valid number. '1' or '2'");
            return 0;
        }
    }
    private void setInitialHitPoints(){
        final int tenSides = 10;
        int numRolls = 4;
        this.hitPoints = 0;
        d10 = new Die(tenSides);
        for (int i = 0; i < numRolls; i++) {
            d10.roll();
            hitPoints += d10.getCurrentValue();
        }
    }



}
