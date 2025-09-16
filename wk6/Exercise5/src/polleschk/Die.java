package polleschk;

public class Die{

    private int numSides;
    private int currentValue;

    public Die() {
        this.numSides = 6;
        roll(numSides);
    }
    public Die(int numSides){
        if (numSides > 100){
            this.numSides = 6;
        }
        this.numSides = numSides;
        roll(numSides);
    }
    public void roll(int numSides){
        double randomValue = Math.random();
        currentValue = (int) (randomValue * numSides) + 1;
    }
    public int getCurrentValue(){
        return currentValue;
    }
}
