/*
 * 🧮 Function 15: Count Positive, Negative, and Zero Numbers
 *
 * Write a program that takes number inputs from the user until they choose to stop.
 * After the input ends, the program should display:
 * - Total count of positive numbers
 * - Total count of negative numbers
 * - Total count of zero values
 *
 * ➕ Example:
 * Input: 5, -3, 0, 10, -1
 * Output: Positives = 2, Negatives = 2, Zeros = 1
 */

import java.util.*;

public class CountNumbers {

    // ✅ Function to take input and count types of numbers
    public static void countNumbers() {
        Scanner sc = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        char choice;

        do {
            // 🔢 Ask for a number
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            // ➕➖0 Categorize the number
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            // 🔁 Ask if the user wants to continue
            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        // 📊 Final output
        System.out.println("\n--- Summary ---");
        System.out.println("Positive Numbers: " + positiveCount);
        System.out.println("Negative Numbers: " + negativeCount);
        System.out.println("Zeroes: " + zeroCount);

        sc.close();
    }

    public static void main(String[] args) {
        // 🚀 Call the function to start
        countNumbers();
    }
}
