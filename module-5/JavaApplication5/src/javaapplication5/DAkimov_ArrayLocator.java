package javaapplication5;

public class DAkimov_ArrayLocator {

    // Method to locate the largest element in a 2D array of doubles
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = new int[2]; // Array to hold the row and column index of the largest element
        double largest = arrayParam[0][0]; // Initialize largest with the first element of the array
        for (int i = 0; i < arrayParam.length; i++) { // Loop through each row
            for (int j = 0; j < arrayParam[i].length; j++) { // Loop through each column in the row
                // Check if the current element is larger than the largest found so far
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j]; // Update largest
                    location[0] = i; // Update row index
                    location[1] = j; // Update column index
                }
            }
        }
        return location; // Return the location of the largest element
    }

    // Method to locate the largest element in a 2D array of integers
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = new int[2]; // Array to hold the row and column index of the largest element
        int largest = arrayParam[0][0]; // Initialize largest with the first element of the array
        for (int i = 0; i < arrayParam.length; i++) { // Loop through each row
            for (int j = 0; j < arrayParam[i].length; j++) { // Loop through each column in the row
                // Check if the current element is larger than the largest found so far
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j]; // Update largest
                    location[0] = i; // Update row index
                    location[1] = j; // Update column index
                }
            }
        }
        return location; // Return the location of the largest element
    }

    // Method to locate the smallest element in a 2D array of doubles
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = new int[2]; // Array to hold the row and column index of the smallest element
        double smallest = arrayParam[0][0]; // Initialize smallest with the first element of the array
        for (int i = 0; i < arrayParam.length; i++) { // Loop through each row
            for (int j = 0; j < arrayParam[i].length; j++) { // Loop through each column in the row
                // Check if the current element is smaller than the smallest found so far
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j]; // Update smallest
                    location[0] = i; // Update row index
                    location[1] = j; // Update column index
                }
            }
        }
        return location; // Return the location of the smallest element
    }


 public static int[] locateSmallest(int[][] arrayParam) {
    int[] location = new int[2]; // Array to store the location of the smallest element
    int smallest = arrayParam[0][0]; // Initialize smallest with the first element of the array

    // Loop through each row of the 2D array
    for (int i = 0; i < arrayParam.length; i++) {
        // Loop through each column of the current row
        for (int j = 0; j < arrayParam[i].length; j++) {
            // Check if the current element is smaller than the smallest found so far
            if (arrayParam[i][j] < smallest) {
                smallest = arrayParam[i][j]; // Update smallest
                location[0] = i; // Update row index of the smallest element
                location[1] = j; // Update column index of the smallest element
            }
        }
    }
    return location; // Return the location of the smallest element
}

public static void main(String[] args) {
    // Example usage of locateSmallest and locateLargest methods
    double[][] doubleArray = {{1.5, 2.3, 3.8}, {4.1, 0.5, 2.9}};
    int[][] intArray = {{5, 3, 8}, {1, 4, 9}};

    // Find locations of largest and smallest elements in the double array
    int[] largestLocationDouble = locateLargest(doubleArray);
    int[] smallestLocationDouble = locateSmallest(doubleArray);
    
    // Find locations of largest and smallest elements in the integer array
    int[] largestLocationInt = locateLargest(intArray);
    int[] smallestLocationInt = locateSmallest(intArray);

    // Print the locations of the largest and smallest elements
    System.out.println("Largest double at: " + largestLocationDouble[0] + ", " + largestLocationDouble[1]);
    System.out.println("Smallest double at: " + smallestLocationDouble[0] + ", " + smallestLocationDouble[1]);
    System.out.println("Largest int at: " + largestLocationInt[0] + ", " + largestLocationInt[1]);
    System.out.println("Smallest int at: " + smallestLocationInt[0] + ", " + smallestLocationInt[1]);
}
}