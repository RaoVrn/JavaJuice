// 12_NumberPyramid_RowValue.java
// JavaJuice - Pattern: Pyramid with same number as row index

/*
 * 🧵 Pattern 12: Number Pyramid (Row Value Pattern)
 *
 * Write a Java program to print a centered number pyramid pattern.
 * Each row should contain the row number repeated `i` times, with leading spaces to align the pyramid.
 *
 * Example (n = 5):
 *     1
 *    2 2
 *   3 3 3
 *  4 4 4 4
 * 5 5 5 5 5
 *
 * ✅ Use nested loops:
 *   - First inner loop: Print leading spaces (n - i)
 *   - Second inner loop: Print `i` times the value of `i`, with space
 */




import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create scanner for input

        // Ask user for number of rows
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();  // Read input

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Print leading spaces (to align the pyramid)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print row number i, i times with space
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();  // Move to the next line
        }

        sc.close(); // Close scanner
    }
}
