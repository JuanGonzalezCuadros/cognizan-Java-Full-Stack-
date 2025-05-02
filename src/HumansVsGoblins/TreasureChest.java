package HumansVsGoblins;

public class TreasureChest extends Object{
    private int x, y;
    private Item item;

    public TreasureChest(Item item) {
        this.item = item;
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

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
