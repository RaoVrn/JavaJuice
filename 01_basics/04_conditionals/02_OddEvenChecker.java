// 06_OddEvenChecker.java
// JavaJuice - Homework: Check if a number is even or odd using if-else
/*
 * 📝 Homework:
 * Write a Java program that:
 * - Takes an integer input from the user.
 * - Checks whether the number is even or odd.
 * - Prints "Even" if divisible by 2, otherwise prints "Odd".
*/

import java.util.*; // Import Scanner class to take user input

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for input

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read integer input from user

        /*
         * Use modulus operator (%) to find the remainder
         * - If number % 2 == 0, it’s even
         * - Else, it's odd
         */
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        sc.close(); // Close the Scanner object
    }
}
