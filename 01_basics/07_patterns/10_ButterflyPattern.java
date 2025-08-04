// 10_ButterflyPattern.java
// JavaJuice - Pattern: Symmetrical Butterfly Pattern using nested loops

/*
 * 🧵 Pattern 10: Butterfly Pattern
 *
 * Write a Java program to print the Butterfly Star Pattern.
 * The pattern consists of two symmetrical triangles on each side
 * separated by a growing/shrinking gap of spaces.
 *
 * Example (n = 5):
 * *        *
 * **      **
 * ***    ***
 * ****  ****
 * **********
 * **********
 * ****  ****
 * ***    ***
 * **      **
 * *        *
 *
 * ✅ Use nested loops:
 *    - First outer loop for top half (1 to n)
 *    - Second outer loop for bottom half (n to 1)
 *    - Inner loops: print stars on both sides and spaces in the middle
 */



import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for input

        // Ask user for number of rows (height of half pattern)
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // 🔼 Top Half of Butterfly
        for (int i = 1; i <= n; i++) {
            // Left Wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Middle spaces: total = 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right Wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to next line
        }

        // 🔽 Bottom Half of Butterfly
        for (int i = n; i >= 1; i--) {
            // Left Wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Middle spaces: total = 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right Wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to next line
        }

        sc.close(); // Close scanner
    }
}
