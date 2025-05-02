package HumansVsGoblins;

public class Item {
    private String name;
    private int attackBonus;
    private int defenseBonus;


    public Item(String name, int attackBonus, int defenseBonus) {
        this.name = name;
        this.attackBonus = attackBonus;
        this.defenseBonus = defenseBonus;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attackBonus;
    }

    public int getDefense() {
        return defenseBonus;
    }

    public String toString() {
        return name + "(Atk: +" + attackBonus + ", Def: +" + defenseBonus + ")";
    }
}
