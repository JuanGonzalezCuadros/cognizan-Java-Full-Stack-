import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int selector;
        int retry;
        do {
            System.out.println("Welcome to Guess the Number?");
            System.out.println("Select your difficulty:");
            System.out.println("1. Easy (0 - 9)");
            System.out.println("2. Medium (0 - 99)");
            System.out.println("3. Hard (0 - 999)");
            System.out.println("4. Exit");
            selector = scn.nextInt();

            Random rand = new Random();
            int randomNumber = 0;
            int range = 0;
            int attempts = 0;
            switch (selector){
                case 1:
                    randomNumber = rand.nextInt(10);
                    range = 9;
                    attempts = 5;
                    break;
                case 2:
                    randomNumber = rand.nextInt(100);
                    range = 99;
                    attempts = 8;
                    break;
                case 3:
                    randomNumber = rand.nextInt(1000);
                    range = 999;
                    attempts = 10;
                    break;
                default:
                    System.out.println("Invalid Selection!");
                    break;
            }

            int number = 0;
            boolean flag = false;
            if(0 < selector && selector < 4){
                do{
                    System.out.printf("\nYou got %d attempts left!\n", attempts);
                    System.out.print("Enter your Guess: ");
                    number = scn.nextInt();
                    if(attempts > 0) {
                        if (0 <= number && number <= range) {
                            if (number == randomNumber) {
                                System.out.println("\nCongratulations! You WIN!\n" +
                                        "You Guessed the correct number!\n");
                                flag = true;
                            } else if (number > randomNumber) {
                                System.out.println("Your guess is too HIGH");
                            } else {
                                System.out.println("Your guess is too LOW");
                            }
                        } else {
                            System.out.println("Number outside of range.");
                        }
                    }
                    if(attempts == 0) {
                        System.out.println("\nYOU LOSE!\n" +
                                "Run out of attempts!\n");
                    }
                    attempts--;
                } while (attempts > 0 && !flag);
            }

            System.out.println("Do you want to start again?");
            System.out.println("YES: Press 1");
            System.out.println("NO:  Press 2");
            retry = scn.nextInt();
        } while (selector != 4 && retry != 2);
    }
}
