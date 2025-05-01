package FantasyBattleSimulator;

public class Caster extends Character {
    public Caster(String name) {
        super(name, 80, 40);
    }

    @Override
    public void specialAbility(Character target) throws Exceptions.InvalidActionException {
        if (!this.isAlive) throw new Exceptions.InvalidActionException("Defeated characters can't take actions.");
        System.out.println("Mage has used Fireball!");
        target.receiveDamage(50);
    }
}
