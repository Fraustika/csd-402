import java.util.Random;
import java.util.Scanner;

/**
 * Simple rock paper scissors game with colored text for easier readability of the answer
 * Reference
 * Rajput, H. (2023, May 24). 
 * Rock Paper Scissors Program in Java (full code). Favtutor. https://favtutor.com/blogs/rock-paper-scissors-java
 */
public class RockPaperScissors {

    // code for text colors based on the output
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create a Random object for computer's choice
        Random random = new Random();
        
        // Generate a random choice for the computer (1: Rock, 2: Paper, 3: Scissors)
        int computerChoice = random.nextInt(3) + 1;

        // Ask the user to type a number
        System.out.println("Type number: 1 for Rock, 2 for Paper, 3 for Scissors");
        int userChoice = scanner.nextInt();

        // Display the choices
        System.out.println("Computer's choice: " + computerChoice);
        System.out.println("Your choice: " + userChoice);

        // If statements of the winner algorithm 
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) || 
                   (userChoice == 2 && computerChoice == 1) || 
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println(GREEN + "You win!" + RESET);
        } else {
            System.out.println(RED + "You lose!" + RESET);
        }

        // Close the scanner
        scanner.close();
    }
}