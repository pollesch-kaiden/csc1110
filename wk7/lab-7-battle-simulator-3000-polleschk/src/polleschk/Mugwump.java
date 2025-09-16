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
 * and hold the methods that make the Mugwump work.
 */
public class Mugwump {
    // add methods here
    private int hitPoints;
    private int maxHitPoints;
    private Die d100;
    private Die d20;
    private Die d10;
    private Die d6;
    /**
     * This constructor is where all instance variables are set
     * and held.
     */
    public Mugwump(){
        final int oneHundredSides = 100;
        final int twentySides = 20;
        final int tenSides = 10;
        final int sixSides = 6;
        d100 = new Die(oneHundredSides);
        d20 = new Die(twentySides);
        d10 = new Die(tenSides);
        d6 = new Die(sixSides);
        setInitialHitPoints();
    }
    public int getHitPoints(){
        return hitPoints;
    }
    /**
     * This method takes away health from the Mugwump as the Warrior attacks it.
     * @param damage is the input for how much damage the Warrior is dealing to
     *               the Mugwump.
     */
    public void takeDamage(int damage){
        if (hitPoints - damage < 0){
            hitPoints = 0;
        } else {
            hitPoints -= damage;
        }
    }
    private void setInitialHitPoints() {
        final int tenSides = 10;
        final int numRolls = 6;
        this.hitPoints = 0;
        d10 = new Die(tenSides);
        for (int i = 0; i < numRolls; i++) {
            d10.roll();
            hitPoints += d10.getCurrentValue();
        }
        maxHitPoints = hitPoints;
    }
    int getMaxHitPoints(){
        return maxHitPoints;
    }

    /**
     * This method handles the attack logic
     * @return the amount of damage an attack has caused, 0 if the attack misses or
     *         a negative amount of damage if the Mugwump heals itself
     */
    public int attack() {
        // get attack type from AI
        int attackType = ai();
        // roll attack die
        int roll = d20.getCurrentValue();
        // determine results and damage
        int damage;
        if (attackType == 1) {
            d20.roll();
            System.out.print("The Mugwump swings his claw");
            final int thirteen = 13;
            if (roll >= thirteen) {
                d6.roll();
                damage = d6.getCurrentValue();
                d6.roll();
                damage += d6.getCurrentValue();
                System.out.printf(" and hits causing %d damage\n", damage);
                // return the damage
                return damage;
            } else {
                System.out.println(", and misses!");
                return 0;
            }
        } else if (attackType == 2) {
            System.out.print("The Mugwump bites with his fangs");
            final int sixteen = 16;
            if (roll >= sixteen) {
                d6.roll();
                damage = d6.getCurrentValue();
                d6.roll();
                damage += d6.getCurrentValue();
                d6.roll();
                damage += d6.getCurrentValue();
                System.out.printf(" and hits causing %d damage\n", damage);
                // return the damage
                return damage;
            } else {
                System.out.println(", but misses!");
                return 0;
            }
        } else if (attackType == 3) {
            int healing = d6.getCurrentValue();
            System.out.printf("Mugwump heals himself by %d hit points\n", healing);
            if (this.hitPoints + healing <= this.maxHitPoints) {
                this.hitPoints += healing;
            } else if (this.hitPoints + healing > this.maxHitPoints) {
                int addedHitPoints = this.maxHitPoints - this.hitPoints;
                this.hitPoints += addedHitPoints;
            }
            return -healing;
        }
        final int impossibleInput = -999;
        return impossibleInput;
    }

    /**
     * This method determines what action the Mugwump performs
     * @return 1 for a Claw attack, 2 for a Bite, and 3 if the Mugwump licks its wounds
     */
    private int ai() {
        final int oneHundred = 100;
        final int sixty = 60;
        final int eightyFive = 85;
        d100 = new Die(oneHundred);
        int randNumber = d100.getCurrentValue();
        if (1 < randNumber && randNumber <= sixty){
            //this will return the claw attack
            return 1;
        } else if (sixty < randNumber && randNumber <= eightyFive) {
            //this will return the bite attack
            return 2;
        } else {
            //this will return the licking of wounds, and heal itself
            return 3;
        }
    }
}
