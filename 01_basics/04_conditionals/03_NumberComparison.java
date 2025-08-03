// 07_NumberComparison.java
// JavaJuice - Homework: Compare two numbers using if-else-if
/*
 * 📝 Homework:
 * Compare two numbers and print:
 * - "Equal" if both are the same
 * - "a is greater than b" if a > b
 * - "a is smaller than b" if a < b
*/

import java.util.*; // Import Scanner for input

public class NumberComparison {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner to take input

        // Prompt and read two integers
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        // Use if-else-if to compare a and b
        if (a == b) {
            System.out.println("Equal");
        } else if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is smaller than b");
        }

        sc.close(); // Always close the scanner to avoid resource leaks
    }
}
