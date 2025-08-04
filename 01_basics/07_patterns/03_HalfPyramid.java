// 03_HalfPyramid.java
// JavaJuice - Pattern: Left-aligned half pyramid using nested for loops

/*
 * 🧵 Pattern 3: Left-Aligned Half Pyramid
 *
 * Write a Java program that prints a left-aligned triangle (half pyramid)
 * made of stars `*` with height `n`.
 *
 * Example:
 * Input: 5
 * Output:
 * *
 * **
 * ***
 * ****
 * *****
 *
 * ✅ Use nested `for` loops:
 *    - Outer loop: Controls the number of rows (1 to n)
 *    - Inner loop: Controls how many stars to print in that row
 */


import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner to take input

        // Ask the user to enter number of rows
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt(); // Read user input for height of the pyramid

        // Outer loop for rows (from 1 to n)
        for (int i = 1; i <= n; i++) {
            // Inner loop for printing stars (from 1 to current row number)
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print star without moving to next line
            }
            System.out.println(); // After each row, move to the next line
        }

        sc.close(); // Close the scanner
    }
}
