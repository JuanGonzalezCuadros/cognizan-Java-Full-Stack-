package Humansvs.Goblins;

import java.util.Random;
import java.util.Scanner;

public class HumansVsGoblins {
    public static void main(String[] args) {
        GameWorld gameWorld = new GameWorld(10, 10);
        Scanner scanner = new Scanner(System.in);

        while (!gameWorld.isGameOver()) {
            gameWorld.displayGrid();
            System.out.println("\nWhat do you want to do?");
            System.out.print("Move (n/s/e/w): ");
            char moveDirection = scanner.next().charAt(0);
            GameWorld.getHuman().move(moveDirection);

            if (GameWorld.getHuman().getX() == GameWorld.getGoblin().getX() &&
                    GameWorld.getHuman().getY() == GameWorld.getGoblin().getY()) {
                System.out.println("\nCombat initiated!");
                GameWorld.getHuman().combat(GameWorld.getGoblin());
                GameWorld.getGoblin().combat(GameWorld.getHuman());
            }

            gameWorld.playTurn();
            if (gameWorld.isGameOver()) {
                break;
            }
        }

        if (!GameWorld.getHuman().isAlive()) {
            System.out.println("Game Over! The Human was defeated.");
        } else if (!GameWorld.getGoblin().isAlive()) {
            System.out.println("Congratulations! The Goblin was defeated.");
        }
    }
}
