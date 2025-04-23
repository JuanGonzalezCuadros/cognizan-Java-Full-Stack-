import java.util.Scanner;

public class exploringJavaConcepts {
    public static void main(String[] args) {
        //Part 1: Exploring Variables and Primitive Types
        int age = 26;
        double height = 70.8661d;
        char initial = 'J';
        boolean isStudent = false;

        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Initial: " + initial);
        System.out.println("Is student: " + isStudent);

        //Part 2: Increment and Decrement Operations
        int counter = 10;
        counter++;
        System.out.println(counter);
        counter--;
        System.out.println(counter);

        for(; counter < 15; counter++){
            System.out.println(counter);
        }

        while(counter > 10){
            System.out.println(counter);
            counter--;
        }

        //Part 3: Working with Strings and User Input
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scn.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scn.nextLine();

        String fullName = firstName.concat(lastName);
        String uFullName = fullName.toUpperCase();

        int countFC = 0;
        for (int i = 0; i < fullName.length(); i++) {
            if (fullName.charAt(i) == fullName.charAt(0)) {
                countFC++;
            }
        }

        System.out.println("Full name: " + fullName);
        System.out.println("Uppercase full name: " + uFullName);
        System.out.println("Count first letter: " + countFC);

        //Assignment 4: Using Conditionals, Logical Operators, and Switch Statements
        int tScore1 = 40;
        int tScore2 = 75;
        int tScore3 = 95;
        int averageScore = (tScore1 + tScore2 + tScore3) / 3;

        if(90 <= averageScore && averageScore <= 100){
            System.out.println("Excellent");
        } else if(70 <= averageScore && averageScore <= 89){
            System.out.println("Good");
        } else if(50 <= averageScore && averageScore <= 69){
            System.out.println("Average");
        } else if(averageScore < 50){
            System.out.println("Poor");
        }

        int day = 7;
        switch (day){
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid day"); break;
        }

        //Part 5: Basic Calculator
        int num1=0;
        int num2 = 0;
        int result = 0;
        char operation = '+';

        num1 = scn.nextInt();
        num2 = scn.nextInt();
        String input = scn.next();
        operation = input.charAt(0);

        if (operation == '+') {
            result = num1 + num2;
            System.out.println(result);
        } else if (operation == '-') {
            result = num1 - num2;
            System.out.println(result);
        }else if (operation == '*') {
            result = num1 * num2;
            System.out.println(result);
        } else if (operation == '/') {
            result = num1 / num2;
            System.out.println(result);
        } else if (operation == 'i') {
            result++;
            System.out.println(result);
        } else if (operation == 'd') {
            result--;
            System.out.println(result);
        }

        switch (operation){
            case '+':
                result = num1 + num2;
                System.out.println(result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(result);
                break;
            case 'i':
                result++;
                System.out.println(result);
                break;
            case 'd':
                result--;
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }

        scn.close();
    }
}
