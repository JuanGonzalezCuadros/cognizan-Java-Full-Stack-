package FantasyBattleSimulator;

public class Exceptions {
    public static class InvalidActionException extends Exception {
        public InvalidActionException(String message) {
            super(message);
        }
    }

    public static class CharacterNotFoundException extends Exception {
        public CharacterNotFoundException(String message) {
            super(message);
        }
    }
}
