package polleschk;

public class MugwumpTester {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Mugwump mugwump = new Mugwump();
            assert (mugwump.getHitPoints() >= 6 && mugwump.getHitPoints() <= 60);
            System.out.println(mugwump.getHitPoints());
            assert (mugwump.getMaxHitPoints() == mugwump.getHitPoints());
            System.out.println(mugwump.getMaxHitPoints());
        }

    }
}
