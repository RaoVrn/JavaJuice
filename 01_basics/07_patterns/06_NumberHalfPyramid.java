// 06_NumberHalfPyramid.java
// JavaJuice - Pattern: Half pyramid with increasing numbers

/*
 * 🧵 Pattern 6: Half Pyramid with Numbers
 *
 * Write a Java program to print a half pyramid of numbers.
 * Each row contains numbers starting from 1 up to the current row number.
 *
 * Example:
 * Input: 5
 * Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 *
 * ✅ Use nested `for` loops:
 *    - Outer loop: Controls the number of rows (1 to n)
 *    - Inner loop: Prints numbers from 1 up to current row number
 */



import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        // Ask user for number of rows
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt(); // Store user input

        // Outer loop: from 1 to n (row count)
        for (int i = 1; i <= n; i++) {
            // Inner loop: print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // Print number without space
            }
            System.out.println(); // Move to next line after each row
        }

        sc.close(); // Close Scanner
    }
}
