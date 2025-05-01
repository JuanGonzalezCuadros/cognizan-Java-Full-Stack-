package FantasyBattleSimulator;

public abstract class Character {
    private String name;
    private int health;
    private int attack;
    protected boolean isAlive;


    public Character(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.isAlive = true;
    }

    public void attack(Character target) throws Exceptions.InvalidActionException {
        if(!this.isAlive || !target.isAlive){
            throw new Exceptions.InvalidActionException("Invalid action. One of the targets has already been defeated.");
        }
        target.receiveDamage(this.attack);
    }

    public void receiveDamage(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            this.isAlive = false;
            this.health = 0;
        }
    }

    public String getStatus() {
        return String.format("%s - HP: %d [%s]", name, health, isAlive ? "Alive" : "Defeated");
    }

    public abstract void specialAbility(Character target) throws Exceptions.InvalidActionException;
}
