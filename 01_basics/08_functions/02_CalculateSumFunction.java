// 02_CalculateSumFunction.java
// JavaJuice - Function to calculate sum of two numbers

/*
 * ➕ Function 02: Calculate Sum of Two Numbers
 *
 * Write a Java function that takes two integers as input parameters,
 * calculates their sum, and returns the result.
 *
 * Steps:
 * 1. Define a method `calculateSum(int a, int b)` that returns `a + b`.
 * 2. In `main()`, take two integers as input from the user.
 * 3. Call the function and print the returned sum.
 *
 * Example:
 * Input: 10 15
 * Output: 25
 *
 * ✅ Concepts Covered:
 * - Function with return type
 * - Passing multiple parameters
 * - Returning result from a method
 */


import java.util.*;

public class Function {

    // ✅ Function that accepts two integers and returns their sum
    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2; // Add the two numbers
        return sum;            // Return the result to the caller
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input scanner

        // Read two integers from user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // ✅ Call the function and store the returned value
        int sum = calculateSum(num1, num2);

        // Print the result
        System.out.println("Sum: " + sum);

        sc.close(); // Close scanner
    }
}
