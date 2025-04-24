import java.util.Scanner;

public class LoopsInJava {
    public static void main(String[] args) {
        //Assignment 1: Using For Loops
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        int sum = 0;
        for (int j = 1; j <= 10; j++) {
            sum += j;
        }
        System.out.println(sum);

        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        for (int k = 1; k <= 10; k++) {
            System.out.println(number * k);
        }

        //Assignment 2: Using While Loops
        int n = scn.nextInt();
        int digitSum = 0;
        while(n > 0){
            digitSum += (n % 10);
            n /= 10;
        }
        System.out.println(digitSum);

        //Assignment 3: Using Do-While Loops
        int firstNumber = 0;
        int secondNumber = 0;
        int selection;
        do {
            System.out.print("\n");
            System.out.println("Welcome to the Calculator!\n");
            System.out.println("Please select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            selection = scn.nextInt();

            if(selection != 5){
                System.out.print("\n");
                System.out.print("Enter the first number: ");
                firstNumber = scn.nextInt();
                System.out.print("Enter the second number: ");
                secondNumber = scn.nextInt();
                System.out.print("\n");
            }

            switch (selection){
                case 1:
                    System.out.printf("Result: %d + %d = %d\n", firstNumber, secondNumber, (firstNumber + secondNumber));
                    break;
                case 2:
                    System.out.printf("Result: %d - %d = %d\n", firstNumber, secondNumber, (firstNumber - secondNumber));
                    break;
                case 3:
                    System.out.printf("Result: %d * %d = %d\n", firstNumber, secondNumber, (firstNumber * secondNumber));
                    break;
                case 4:
                    System.out.printf("Result: %d / %d = %f\n", firstNumber, secondNumber, ((float)firstNumber / (float)secondNumber));
                    break;
                case 5:
                    System.out.println("Exiting the calculator. Thank you!");
                    break;
                default: System.out.println("Invalid choice. Enter a valid choice.");
            }
        } while (selection != 5);
        scn.close();
    }
}
