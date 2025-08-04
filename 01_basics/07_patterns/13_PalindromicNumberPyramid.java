// 13_PalindromicNumberPyramid.java
// JavaJuice - Pattern: Centered Palindromic Number Pyramid

/*
 * 🧵 Pattern 13: Palindromic Number Pyramid
 *
 * Write a Java program to print a center-aligned palindromic number pyramid.
 * Each row contains numbers decreasing from `i` to 1 and increasing from 2 to `i`.
 * Leading spaces help center-align the pyramid.
 *
 * Example (n = 5):
 *     1
 *    2 1 2
 *   3 2 1 2 3
 *  4 3 2 1 2 3 4
 * 5 4 3 2 1 2 3 4 5
 *
 * ✅ Use nested loops:
 *   - Loop 1: Print leading spaces
 *   - Loop 2: Print descending numbers from i to 1
 *   - Loop 3: Print ascending numbers from 2 to i
 */



import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to take input

        // Ask user for the number of rows
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();  // Read input

        // Outer loop for each row
        for (int i = 1; i <= n; i++) {

            // Print leading spaces to center-align
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print descending numbers from i to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Print ascending numbers from 2 to i
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            // Move to next line
            System.out.println();
        }

        sc.close(); // Close scanner
    }
}
