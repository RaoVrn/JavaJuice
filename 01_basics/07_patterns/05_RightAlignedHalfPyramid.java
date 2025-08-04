// 05_RightAlignedHalfPyramid.java
// JavaJuice - Pattern: Right-aligned half pyramid using nested loops

/*
 * 🧵 Pattern 5: Right-Aligned Half Pyramid
 *
 * Write a Java program to print a right-aligned half pyramid of stars (`*`).
 * The number of rows `n` is provided by the user.
 *
 * Example:
 * Input: 5
 * Output:
 *     *
 *    **
 *   ***
 *  ****
 * *****
 *
 * ✅ Use nested `for` loops:
 *    - First inner loop: Print spaces (n - i)
 *    - Second inner loop: Print stars (i times)
 */


import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to read input

        // Ask the user for number of rows
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt(); // Store user input

        // Outer loop: controls the number of rows
        for (int i = 1; i <= n; i++) {

            // First inner loop: print spaces (n - i times)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Second inner loop: print stars (i times)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next line after printing each row
            System.out.println();
        }

        sc.close(); // Close the scanner
    }
}
