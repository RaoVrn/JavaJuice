// 11_RightAlignedRectangleWithTail.java
// JavaJuice - Pattern: Right-aligned rectangle with leading & trailing spaces

/*
 * 🧵 Pattern 11: Right-Aligned Solid Rectangle with Trailing Spaces
 *
 * Write a Java program to print a right-aligned solid rectangle of stars,
 * where each row has (n - i) leading spaces before the stars,
 * and (i - 1) trailing spaces after the stars.
 *
 * Example (n = 5):
 *     *****  
 *    ***** 
 *   *****  
 *  *****   
 * *****    
 *
 * ✅ Use nested loops:
 *    - First inner loop prints leading spaces
 *    - Second inner loop prints stars
 *    - Third inner loop prints trailing spaces
 */



import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input scanner

        // Ask user for number of rows/columns
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // Read input

        // Outer loop for n rows
        for (int i = 1; i <= n; i++) {
            // Print leading spaces (n - i)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars (fixed count = n)
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            // Print trailing spaces (i - 1)
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println(); // Move to next line
        }

        sc.close(); // Close scanner
    }
}
