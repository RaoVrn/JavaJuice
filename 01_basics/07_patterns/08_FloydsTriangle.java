// 08_FloydsTriangle.java
// JavaJuice - Pattern: Floyd's Triangle using nested for loops

/*
 * 🧵 Pattern 8: Floyd's Triangle
 *
 * Write a Java program to print Floyd’s Triangle.
 * It starts with 1 and prints numbers sequentially in a right-angled triangular form.
 *
 * Example:
 * Input: 5
 * Output:
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 *
 * ✅ Use nested loops:
 *    - Outer loop: From 1 to n (rows)
 *    - Inner loop: From 1 to i (print increasing numbers)
 *    - Maintain a counter `num` to keep track of the next number
 */


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for user input

        // Ask user for number of rows
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt(); // Read input

        int num = 1; // Start counter from 1

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop to print 'i' numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " "); // Print current number with space
                num++; // Move to the next number
            }
            System.out.println(); // New line after each row
        }

        sc.close(); // Close Scanner
    }
}
