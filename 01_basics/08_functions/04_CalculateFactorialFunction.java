// 04_CalculateFactorialFunction.java
// JavaJuice - Function to calculate factorial of a number

/*
 * 🔢 Function 04: Calculate Factorial of a Number
 *
 * Write a Java program to calculate the factorial of a given number using a function.
 *
 * Factorial of a number n (denoted as n!) is the product of all positive integers less than or equal to n.
 * Example: 5! = 5 × 4 × 3 × 2 × 1 = 120
 *
 * Steps:
 * 1. Create a function `calculateFactorial(int num)` that returns the factorial.
 * 2. Take an integer input from the user in `main()`.
 * 3. Call the function and print the result.
 *
 * ✅ Concepts Covered:
 * - Functions with return type
 * - Looping (for loop)
 * - Integer arithmetic
 */


import java.util.*;

public class Function {

    // ✅ This function returns the factorial of a given number
    public static int calculateFactorial(int num) {
        int fact = 1;

        // Multiply all numbers from 1 to num
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        return fact; // Return the final result
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        // Prompt user for input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // ✅ Call the function and store result
        int fact = calculateFactorial(num);

        // Print the factorial
        System.out.println("Factorial: " + fact);

        sc.close(); // Close the Scanner
    }
}
