// 07_InvertedNumberHalfPyramid.java
// JavaJuice - Pattern: Inverted number half pyramid

/*
 * 🧵 Pattern 7: Inverted Number Half Pyramid
 *
 * Write a Java program to print a half pyramid of numbers in decreasing rows.
 * Each row starts from 1 up to the current row length, but total rows decrease from n to 1.
 *
 * Example:
 * Input: 5
 * Output:
 * 12345
 * 1234
 * 123
 * 12
 * 1
 *
 * ✅ Use nested `for` loops:
 *    - Outer loop: From n down to 1
 *    - Inner loop: From 1 to i (print increasing numbers)
 */



import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for input

        // Ask user for the number of rows
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt(); // Read input

        // Outer loop: from n down to 1 (controls rows)
        for (int i = n; i >= 1; i--) {
            // Inner loop: print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // Print number in same line
            }
            System.out.println(); // Newline after each row
        }

        sc.close(); // Close Scanner
    }
}
