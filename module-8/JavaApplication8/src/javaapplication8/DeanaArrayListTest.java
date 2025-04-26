package javaapplication8;
import java.util.ArrayList;
import java.util.Scanner;

public class DeanaArrayListTest {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int input;

        System.out.println("Enter integers (0 to stop):");
        while (true) {
            input = scanner.nextInt();
            numbers.add(input);
            if (input == 0) {
                break;
            }
        }

        Integer maxNumber = max(numbers);
        System.out.println("The largest value is: " + maxNumber);
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        Integer max = list.get(0);
        for (Integer number : list) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}