package FantasyBattleSimulator;

public class BattleSystem {
    public void startBattle(Character c1, Character c2) {
        try {
            while (c1.isAlive && c2.isAlive) {
                c1.attack(c2);
                System.out.println(c2.getStatus());
                if (!c2.isAlive) break;

                c2.specialAbility(c1);
                System.out.println(c1.getStatus());
            }
        } catch (Exceptions.InvalidActionException e) {
            System.err.println("Battle Error: " + e.getMessage());
        } finally {
            System.out.println("Battle Ended.");
        }
    }
}
