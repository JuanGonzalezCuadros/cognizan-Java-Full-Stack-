package FantasyBattleSimulator;

import java.util.HashMap;
import java.util.Scanner;

public class GameManager {
    private HashMap<String, Character> characters = new HashMap<>();

    public void createCharacters() {
        characters.put("SABER", new Saber("Gawain"));
        characters.put("ARCHER", new Archer("Arjuna"));
        characters.put("CASTER", new Caster("Circe"));
        characters.put("ASSASSIN", new Assassin("Hassan-i Sabbah"));
    }

    public Character selectCharacter(String name) throws Exceptions.CharacterNotFoundException {
        Character character = characters.get(name);
        if (character == null) throw new Exceptions.CharacterNotFoundException("Character '" + name + "' not found.");
        return character;
    }

    public void runGame() {
        Scanner scanner = new Scanner(System.in);
        createCharacters();

        try {
            System.out.print("Choose first character (Saber/Archer/Caster/Assassin): ");
            Character c1 = selectCharacter(scanner.nextLine().toUpperCase());

            System.out.print("Choose second character (Saber/Archer/Caster/Assassin): ");
            Character c2 = selectCharacter(scanner.nextLine().toUpperCase());

            new BattleSystem().startBattle(c1, c2);
        } catch (Exceptions.CharacterNotFoundException e) {
            System.err.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        new GameManager().runGame();
    }
}
