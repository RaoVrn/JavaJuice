/*
 * 📝 Homework:
 * Write a Java program to print all even numbers from 0 to n (inclusive).
 * ✅ Use a `for` loop.
 * ✅ An even number is divisible by 2 (i % 2 == 0)
 */

import java.util.*; // Import the Scanner class for taking user input

// Class definition
public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object to read input from user

        // Ask user to enter the upper limit number
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // Read the number and store it in variable `n`

        // Loop from 0 to n (inclusive)
        for (int i = 0; i <= n; i++) {
            // Check if the number is even (divisible by 2)
            if (i % 2 == 0) {
                System.out.println(i); // If even, print the number
            }
        }

        sc.close(); // Close the Scanner object to avoid memory leaks
    }
}
