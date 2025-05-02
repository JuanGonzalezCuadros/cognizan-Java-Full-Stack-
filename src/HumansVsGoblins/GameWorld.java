package HumansVsGoblins;

public class GameWorld {
    private Cell[][] grid;
    private int rows, cols;
    private static Human human;
    private static Goblin goblin;
    private static TreasureChest treasureChest;

    public GameWorld(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.grid = new Cell[rows][cols];
        human = new Human(100, 20, 5);
        goblin = new Goblin(80, 15, 3);
        initializeGrid();
    }

    private void initializeGrid() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = new Cell();
            }
        }
        addHuman(human, 0, 0);
        addGoblin(goblin, 5, 5);
        Item sword = new Item("Sword", 5, 2);
        treasureChest = new TreasureChest(sword);
        addTreasureChest(treasureChest, 3, 2);
    }

    public void addHuman(Human human, int x, int y) {
        GameWorld.human = human;
        GameWorld.human.setX(x);
        GameWorld.human.setY(y);
        grid[x][y].setOccupant(human);
    }

    public void addGoblin(Goblin goblin, int x, int y) {
        GameWorld.goblin = goblin;
        GameWorld.goblin.setX(x);
        GameWorld.goblin.setY(y);
        grid[x][y].setOccupant(goblin);
    }

    public void addTreasureChest(TreasureChest treasureChest, int x, int y) {
        GameWorld.treasureChest = treasureChest;
        GameWorld.treasureChest.setX(x);
        GameWorld.treasureChest.setY(y);
        grid[x][y].setOccupant(treasureChest);
    }

    public static Human getHuman() {
        return human;
    }

    public static Goblin getGoblin() {
        return goblin;
    }

    public static TreasureChest getTreasureChest() {
        return treasureChest;
    }

    public void displayGrid() {
        System.out.println("Grid: ");
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                if (i == human.getY() && j == human.getX()) {
                    System.out.print("H ");
                } else if (i == goblin.getY() && j == goblin.getX()) {
                    System.out.print("G ");
                } else if (treasureChest != null && i == treasureChest.getY() && j == treasureChest.getX()) {
                    System.out.print("T ");
                }else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    public void playTurn() {
        System.out.println("\nHuman's Turn:");
        isGameOver();
        displayGrid();

        if (treasureChest != null && human.getX() == treasureChest.getX() && human.getY() == treasureChest.getY()) {
            human.collectItem(treasureChest.getItem());
            treasureChest = null;
            human.displayInventory();
        }

        System.out.println("\nGoblin's Turn:");
        isGameOver();
        displayGrid();
    }

    public boolean isGameOver() {
        return !human.isAlive() || !goblin.isAlive();
    }
}
