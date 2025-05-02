package HumansVsGoblins;

public class Cell {
    private Object occupant;

    public Cell() {
        this.occupant = null;
    }

    public Object getOccupant() {
        return occupant;
    }

    public void setOccupant(Object occupant) {
        this.occupant = occupant;
    }

    @Override
    public String toString() {
        if (occupant instanceof Human) {
            return "H";
        } else if (occupant instanceof Goblin) {
            return "G";
        } else if (occupant instanceof TreasureChest) {
            return "T";
        }
        return ".";
    }
}
