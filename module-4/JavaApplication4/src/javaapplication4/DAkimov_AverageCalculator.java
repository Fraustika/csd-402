package javaapplication4;

public class AverageCalculator {

    // Method to calculate the average of a short array
    public static short average(short[] array) {
        short sum = 0; // Initialize sum to 0
        // Iterate through each element in the array
        for (short num : array) {
            sum += num; // Add each element to the sum
        }
        // Return the average by casting the result to short
        return (short) (sum / array.length);
    }

    // Method to calculate the average of an int array
    public static int average(int[] array) {
        int sum = 0; // Initialize sum to 0
        // Iterate through each element in the array
        for (int num : array) {
            sum += num; // Add each element to the sum
        }
        // Return the average
        return sum / array.length;
    }

    // Method to calculate the average of a long array
    public static long average(long[] array) {
        long sum = 0; // Initialize sum to 0
        // Iterate through each element in the array
        for (long num : array) {
            sum += num; // Add each element to the sum
        }
        // Return the average
        return sum / array.length;
    } 

    // Method to calculate the average of a double array
    public static double average(double[] array) {
        double sum = 0; // Initialize sum to 0
        // Iterate through each element in the array
        for (double num : array) {
            sum += num; // Add each element to the sum
        }
        // Return the average
        return sum / array.length;
    }

    // Main method to test the average methods
    public static void main(String[] args) {
        // Create arrays of different types and sizes
        short[] shortArray = {1, 2, 3, 4, 5};
        int[] intArray = {10, 20, 30, 40, 50, 60};
        long[] longArray = {1000L, 2000L, 3000L};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5};

        // Display the short array and its average
        System.out.println("Short Array: ");
        System.out.println("Elements: " + java.util.Arrays.toString(shortArray));
        System.out.println("Average: " + average(shortArray));

        // Display the integer array and its average
        System.out.println("\nInteger Array: ");
        System.out.println("Elements: " + java.util.Arrays.toString(intArray));
        System.out.println("Average: " + average(intArray));

        // Display the long array and its average
        System.out.println("\nLong Array: ");
        System.out.println("Elements: " + java.util.Arrays.toString(longArray));
        System.out.println("Average: " + average(longArray));

        // Display the double array and its average
        System.out.println("\nDouble Array: ");
        System.out.println("Elements: " + java.util.Arrays.toString(doubleArray));
        System.out.println("Average: " + average(doubleArray));
    }
}