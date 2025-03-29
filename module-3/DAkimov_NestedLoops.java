package module03;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

public class NestedLoops {
    public static void main(String[] args) {
        int rows = 7; // Total number of rows

        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("  ");
            }

            // Print the left half of the pattern
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num *= 2; // Double the number for the next position
            }

            // Print the right half of the pattern
            num /= 4; // Adjust to start from the second half
            for (int j = 0; j < i; j++) {
                System.out.print(num + " ");
                num /= 2; // Halve the number for the next position
            }

            // Print the "@" symbol aligned to the right
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("  ");
            }
            System.out.println("@");
        }
    }
}