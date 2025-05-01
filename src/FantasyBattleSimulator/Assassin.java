package FantasyBattleSimulator;

public class Assassin extends Character {
    public Assassin(String name) {
        super(name, 90, 35);
    }

    @Override
    public void specialAbility(Character target) throws Exceptions.InvalidActionException {
        if (!this.isAlive) throw new Exceptions.InvalidActionException("Defeated characters can't take actions.");
        System.out.println("Assassin has used Assassination!");
        target.receiveDamage(60);
    }
}
