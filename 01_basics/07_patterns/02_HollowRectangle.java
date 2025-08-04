// 02_HollowRectangle.java
// JavaJuice - Pattern: Hollow Rectangle using nested for loops

/*
 * 🧵 Pattern 2: Hollow Rectangle
 *
 * Write a Java program to print a rectangle of size n x m using stars `*`, 
 * where only the border has stars and the inside is hollow (empty).
 *
 * Example:
 * Input:
 * n = 4
 * m = 5
 * Output:
 * *****
 * *   *
 * *   *
 * *****
 *
 * ✅ Use nested for loops:
 *    - Print `*` if the current cell is on the border.
 *    - Else, print a space.
 */


import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number of rows (n) and columns (m) as input
        System.out.print("Enter rows (n): ");
        int n = sc.nextInt();

        System.out.print("Enter columns (m): ");
        int m = sc.nextInt();

        // Outer loop for each row (1 to n)
        for (int i = 1; i <= n; i++) {
            // Inner loop for each column (1 to m)
            for (int j = 1; j <= m; j++) {
                // Check if the current position is on the border
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*"); // Print star at border
                } else {
                    System.out.print(" "); // Print space inside
                }
            }
            System.out.println(); // Move to the next line after each row
        }

        sc.close(); // Close the scanner
    }
}
