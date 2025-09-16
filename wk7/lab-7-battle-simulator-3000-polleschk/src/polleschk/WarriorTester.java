package polleschk;

public class WarriorTester {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Warrior warrior = new Warrior();
            assert (warrior.getHitPoints() >= 6 && warrior.getHitPoints() <= 60);
            System.out.println(warrior.getHitPoints());
        }

    }
}
