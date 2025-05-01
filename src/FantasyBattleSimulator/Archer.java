package FantasyBattleSimulator;

public class Archer extends Character {
    public Archer(String name) {
        super(name, 100, 30);
    }

    @Override
    public void specialAbility(Character target) throws Exceptions.InvalidActionException {
        if (!this.isAlive) throw new Exceptions.InvalidActionException("Defeated characters can't take actions.");
        System.out.println("Archer has used Snipe Shot!");
        target.receiveDamage(40);
    }
}
