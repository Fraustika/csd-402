package javaapplication10;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;

public class DeanaFiles {
    public static void main(String[] args) {
        File file = new File("data.file");
        Random random = new Random();

        try {
            // Create file if it does not exist
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Write 10 random numbers to the file
            FileWriter writer = new FileWriter(file, true); // true for appending
            for (int i = 0; i < 10; i++) {
                writer.write(random.nextInt(100) + " "); // Random number between 0 and 99
            }
            writer.close();

            // Read and display the numbers from the file
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("Numbers in the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}