// 09_BinaryTriangle.java
// JavaJuice - Pattern: 0–1 triangle using (i + j) % 2

/*
 * 🧵 Pattern 9: 0–1 Triangle (Binary Triangle)
 *
 * Write a Java program to print a triangle with alternating 1s and 0s.
 * The rule is:
 *    - If (i + j) is even, print 1
 *    - If (i + j) is odd, print 0
 *
 * Example:
 * Input: 5
 * Output:
 * 1
 * 01
 * 101
 * 0101
 * 10101
 *
 * ✅ Use nested loops:
 *    - Outer loop: Controls rows (1 to n)
 *    - Inner loop: Controls columns (1 to i)
 *    - Apply condition on (i + j) to print 1 or 0
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create scanner to take input

        // Ask user for number of rows
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt(); // Read input

        // Outer loop: rows from 1 to n
        for (int i = 1; i <= n; i++) {
            // Inner loop: columns from 1 to current row index
            for (int j = 1; j <= i; j++) {
                // If sum of row and column is even, print 1; else print 0
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println(); // Move to next line after each row
        }

        sc.close(); // Close scanner
    }
}
