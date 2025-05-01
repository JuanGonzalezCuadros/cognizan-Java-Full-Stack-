package FantasyBattleSimulator;

public class Saber extends Character {
    public Saber(String name) {
        super(name, 120, 35);
    }

    @Override
    public void specialAbility(Character target) throws Exceptions.InvalidActionException {
        if (!this.isAlive) throw new Exceptions.InvalidActionException("Defeated characters can't take actions.");
        System.out.println("Warrior has used Heavy Strike!");
        target.receiveDamage(30);
    }
}
