// 14_DiamondStarPattern.java
// JavaJuice - Pattern: Full Diamond using stars

/*
 * 💎 Pattern 14: Diamond Star Pattern
 *
 * Write a Java program to print a full diamond pattern using stars (*).
 * The diamond has two symmetrical parts:
 *   - Top half: Center-aligned full pyramid of height `n`
 *   - Bottom half: Inverted full pyramid of height `n`
 *
 * Example (n = 5):
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 *
 * ✅ Use nested loops:
 *   - 1st outer loop for the top half (1 to n)
 *   - 2nd outer loop for the bottom half (n to 1)
 *   - Inner loops handle leading spaces and stars
 */




import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input scanner

        // Ask user for number of rows for the upper half
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // 🔼 Top Half of the Diamond (1 to n)
        for (int i = 1; i <= n; i++) {
            // Print leading spaces (n - i)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars (2*i - 1)
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println(); // New line after each row
        }

        // 🔽 Bottom Half of the Diamond (n to 1)
        for (int i = n; i >= 1; i--) {
            // Print leading spaces (n - i)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars (2*i - 1)
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println(); // New line after each row
        }

        sc.close(); // Close the scanner
    }
}
