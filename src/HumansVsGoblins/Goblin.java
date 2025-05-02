package HumansVsGoblins;

import java.util.Random;

public class Goblin extends Character {
    public Goblin(int health, int attack, int defense) {
        super(health, attack, defense);
    }

    @Override
    public void move(char direction) {
        int humanX = GameWorld.getHuman().getX();
        int humanY = GameWorld.getHuman().getY();

        if (x < humanX) x++;
        else if (x > humanX) x--;

        if (y < humanY) y++;
        else if (y > humanY) y--;
    }

    public void combat(Character opponent) {
        if (opponent instanceof Human) {
            Random rand = new Random();
            int damage = rand.nextInt(this.attack) - ((Human) opponent).getTotalDefense();
            if (damage > 0) {
                opponent.setHealth(opponent.getHealth() - damage);
                System.out.println("Goblin dealt " + damage + " damage to Human.");
                System.out.println("Goblin health: " + getHealth());
            } else {
                System.out.println("Goblin's attack was ineffective.");
            }

            if (!opponent.isAlive()) {
                System.out.println("Human has been defeated!");
            }
        }
    }
}
