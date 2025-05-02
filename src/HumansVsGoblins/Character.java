package HumansVsGoblins;

public abstract class Character {
    protected int health;
    protected int attack;
    protected int defense;
    protected int x, y;

    public Character(int health, int attack, int defense) {
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    public abstract void move(char direction);
    public abstract void combat(Character other);

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isAlive(){
        return this.health > 0;
    }
}
