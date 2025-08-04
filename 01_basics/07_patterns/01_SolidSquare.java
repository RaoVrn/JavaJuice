/*
 * 🧵 Pattern 1: Solid Square
 * 
 * Write a Java program to print a solid square pattern using asterisks `*`.
 * The size of the square is `n`, which is input by the user.
 * 
 * Example:
 * Input: 4
 * Output:
 * ****
 * ****
 * ****
 * ****
 *
 * ✅ Use nested `for` loops:
 *    - Outer loop: Rows (0 to n-1)
 *    - Inner loop: Columns (0 to n-1)
 */


// 01_SolidSquare.java
// JavaJuice - Pattern: Solid Square using nested for loops

import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input
        System.out.print("Enter size of square (n): ");
        int n = sc.nextInt(); // Read size of the square

        // Outer loop for each row
        for (int i = 0; i < n; i++) {
            // Inner loop for each column in that row
            for (int j = 0; j < n; j++) {
                System.out.print("*"); // Print a star without newline
            }
            System.out.print("\n"); // Move to next line after each row
        }

        sc.close(); // Close the scanner
    }
}
