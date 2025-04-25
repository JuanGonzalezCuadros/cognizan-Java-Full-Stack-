public class ImplementingArrays {
    public static void main(String[] args) {
        //Part 1: Understanding Arrays
        System.out.println("\n");
        // Declare an array of integers
        int[] numbers;

        // Initialize the array with 5 elements
        numbers = new int[5];

        // Access and assign values to array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Print the first element of the array
        System.out.println(numbers[0]); // Output: 10

        //Part 2: Declaring and Initializing Arrays
        System.out.println("\n");
        double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        for(double value: doubleArray){
            System.out.println(value);
        }

        //Part 3: Traversing and Updating Arrays
        System.out.println("\n");
        numbers[2] = 100;

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //Part 4: Common Array Operations
        System.out.println("\n");
        int[] array10 = new int[10];
        for(int i = 1; i <= array10.length; i++) {
            array10[i - 1] = (i * 3);
        }
        System.out.println("Array length: " + array10.length);
        for(int m3: array10){
            System.out.println(m3);
        }
    }
}