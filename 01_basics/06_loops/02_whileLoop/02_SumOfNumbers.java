// 02_SumOfNumbers.java
// JavaJuice - Homework: Sum of numbers from 0 to n using while loop

/*
 * 📝 Homework:
 * Write a Java program that:
 * - Takes an integer input `n` from the user.
 * - Calculates the sum of all numbers from 0 to `n` using a `while` loop.
 * - Prints the final sum.
 *
 * ✅ Use a loop (not formula).
 * ✅ Start from 0 and keep adding up to `n`.
 */

import java.util.*;

public class Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for upper limit 'n'
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0; // To store the total sum
        int i = 0;   // Loop counter starting from 0

        // Loop to add all numbers from 0 to n
        while (i <= n) {
            sum += i; // Add current number to sum
            i++;      // Move to next number
        }

        // Print the final result
        System.out.println("Sum from 0 to " + n + " is: " + sum);

        sc.close(); // Close the Scanner
    }
}
