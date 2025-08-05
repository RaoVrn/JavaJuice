// 03_CalculateProductFunction.java
// JavaJuice - Function to calculate product of two numbers

/*
 * ✖️ Function 03: Calculate Product of Two Numbers
 *
 * Write a Java function that accepts two integers, multiplies them, and returns the result.
 *
 * Steps:
 * 1. Define a method `calculateProduct(int a, int b)` that returns `a * b`.
 * 2. In `main()`, read two integers from the user.
 * 3. Call the method and print the product to the console.
 *
 * Example:
 * Input: 7 6
 * Output: 42
 *
 * ✅ Concepts Covered:
 * - Function with return type
 * - Parameter passing
 * - Basic arithmetic logic
 */


import java.util.*;

public class Function {

    // ✅ Function that calculates and returns the product
    public static int calculateProduct(int num1, int num2) {
        int mul = num1 * num2; // Multiply the numbers
        return mul;            // Return the result
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner to take input

        // Read two integers from the user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // ✅ Call the function and store the result
        int mul = calculateProduct(num1, num2);

        // Print the product
        System.out.println("Product: " + mul);

        sc.close(); // Close Scanner
    }
}
