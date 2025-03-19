package module01;

/**
 * Deana Akimov, March 18, 2025
 * CSD402-O307 Java for Programmers (2255-DD), Programming Assignment 01
 * 
 * The WaterHeatingEnergy class calculates the energy required to heat a given mass of water
 * from an initial temperature to a final temperature.
 * 
 * Using the Q = waterMass * (finalTemperature - initialTemperature) * 4184 formula
 * the program does calculations and then displays in Joules
 * 
 * Reference:
 * https://learn.saylor.org/mod/book/view.php?id=67455&chapterid=61462
 */

import java.util.Scanner;

public class WaterHeatingEnergy {
    public static void main(String[] args) {
        // Prompt user for input
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt user for the amount of water in kilograms
            System.out.print("Enter the amount of water in kilograms: ");
            double waterMass = scanner.nextDouble();
            
            // Prompt user for the initial temperature in Celsius
            System.out.print("Enter the initial temperature in Celsius: ");
            double initialTemperature = scanner.nextDouble();
            
            // Prompt user for the final temperature in Celsius
            System.out.print("Enter the final temperature in Celsius: ");
            double finalTemperature = scanner.nextDouble();
            
            // Calculate energy needed using the formula Q = waterMass * (finalTemperature - initialTemperature) * 4184
            double energyNeeded = waterMass * (finalTemperature - initialTemperature) * 4184;
            
            // Display the result
            System.out.println("The energy needed to heat the water is: " + energyNeeded + " Joules");
            // Close the scanner
        }
    }
}