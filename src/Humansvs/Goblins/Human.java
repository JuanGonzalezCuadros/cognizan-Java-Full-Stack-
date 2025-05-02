package Humansvs.Goblins;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Human extends Character {
    protected List<Item> inventory;

    public Human(int health, int attack, int defense) {
        super(health, attack, defense);
        this.inventory = new ArrayList<>();
    }

    public void collectItem(Item item) {
        inventory.add(item);
        System.out.println("Human collected: " + item.getName());
    }

    public void displayInventory() {
        for (Item item : inventory) {
            System.out.println(item);
        }
    }

    public int getTotalAttack() {
        for(Item item : inventory){
            this.attack += item.getAttack();
        }
        return this.attack;
    }

    public int getTotalDefense() {
        for(Item item : inventory){
            this.defense += item.getDefense();
        }
        return this.defense;
    }

    @Override
    public void move(char direction) {
        switch (direction) {
            case 'n': // Move north
                y--;
                break;
            case 's': // Move south
                y++;
                break;
            case 'e': // Move east
                x++;
                break;
            case 'w': // Move west
                x--;
                break;
            default:
                System.out.println("Invalid direction.");
        }
    }

    @Override
    public void combat(Character opponent) {
        if (opponent instanceof Goblin) {
            Random rand = new Random();
            int damage = rand.nextInt(this.getTotalAttack()) - opponent.getDefense();
            if (damage > 0) {
                opponent.setHealth(opponent.getHealth() - damage);
                System.out.println("Human dealt " + damage + " damage to Goblin.");
                System.out.println("Human health: " + getHealth());
            } else {
                System.out.println("Human's attack was ineffective.");
            }

            if (!opponent.isAlive()) {
                System.out.println("Goblin has been defeated!");
            }
        }
    }
}
