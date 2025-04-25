import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] grades = new int[10];
        inputScore(grades, scn);
        printAverage(grades);
        printHLScore(grades);
        printGrades(grades);
        scn.close();
    }

    public static void inputScore(int[] arr, Scanner scn){
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("Enter grade of student %d: \n", (i + 1));
            arr[i] = scn.nextInt();
        }
    }

    public static void printAverage(int[] arr){
        int sum = 0;
        for(int grade: arr){
            sum += grade;
        }
        System.out.println("The average grade is: " + (sum / arr.length));
    }

    public static void printHLScore(int[] arr){
        int high = arr[0];
        int low = arr[0];
        for(int grade: arr){
            if(grade > high){
                high = grade;
            }
            if(grade < low){
                low = grade;
            }
        }
        System.out.println("The highest grade is: " + high);
        System.out.println("The lowest grade is: " + low);
    }

    public static void printGrades(int[] arr){
        int index = 1;
        for(int grade: arr){
            System.out.printf("The grade of student %d is: %d\n", index, grade);
            index++;
        }
    }
}
