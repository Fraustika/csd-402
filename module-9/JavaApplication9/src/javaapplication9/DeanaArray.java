/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

import java.util.ArrayList;
import java.util.Scanner;

public class DeanaArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grape");
        list.add("Honeydew");
        list.add("Kiwi");
        list.add("Lemon");

        // Using a for-each loop to print the ArrayList
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Asking the user for an index
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which element would you like to see again (0-9)? ");
        int index = scanner.nextInt();

        // Try/catch block to handle potential out of bounds
        try {
            System.out.println("You selected: " + list.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }
    }
}
