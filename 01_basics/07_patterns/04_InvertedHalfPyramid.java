// 04_InvertedHalfPyramid.java
// JavaJuice - Pattern: Inverted half pyramid using nested for loops

/*
 * 🧵 Pattern 4: Inverted Half Pyramid
 *
 * Write a Java program to print an inverted left-aligned half pyramid of stars.
 * The number of rows `n` is taken as input from the user.
 *
 * Example:
 * Input: 5
 * Output:
 * *****
 * ****
 * ***
 * **
 * *
 *
 * ✅ Use nested `for` loops:
 *    - Outer loop: From n to 1 (rows)
 *    - Inner loop: From 1 to current row index (print stars)
 */


import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to read user input

        // Prompt the user to enter number of rows
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt(); // Store input in `n`

        // Outer loop: From n down to 1 (row control)
        for (int i = n; i >= 1; i--) {
            // Inner loop: Print i stars for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print star without newline
            }
            System.out.println(); // Move to next line after each row
        }

        sc.close(); // Close scanner to avoid resource leak
    }
}
