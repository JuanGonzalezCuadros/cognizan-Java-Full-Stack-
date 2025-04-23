import java.util.Scanner;

public class DragonCave {
    public static void main(String[] args) {
        System.out.println("You are in a land full of dragons. In front of you,\n" +
                "You see two caves. In one cave, the dragon is friendly\n" +
                "and will share his treasure with you. The other dragon\n" +
                "is greedy and hungry and will eat you on sight.\n" +
                "Which cave will you go into? (1 or 2)");

        Scanner scn = new Scanner(System.in);
        int choice = scn.nextInt();

        if(choice == 1){
            System.out.println("You approach the cave…\n" +
                    "It is dark and spooky…\n" +
                    "A large dragon jumps out in front of you!\n" +
                    "He opens his jaws and…\n" +
                    "Gobbles you down in one bite!");
        } else if (choice == 2) {
            System.out.println("You approach the cave…\n" +
                    "It is dark and spooky…\n" +
                    "A large dragon jumps out in front of you!\n" +
                    "He stares at you and…\n" +
                    "Offers you some treasure!");
        } else {
            System.out.println("You decide to leave the caves and head back home…\n" +
                    "Which type of dragon inhabits what cave for another reckless adventurer to discover.");
        }

        scn.close();
    }
}