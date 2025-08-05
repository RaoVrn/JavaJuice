/*
 * ➕ Function 11: Sum of All Odd Numbers Between Two Numbers
 *
 * Write a function `calculateOddSum(int a, int b)` that calculates the sum of all odd numbers between a and b (inclusive).
 * - First, find the smaller and larger value between a and b.
 * - Loop from the smaller to the larger value.
 * - Add only odd numbers to the sum.
 * - Return the final sum and print it from `main()`.
 */

import java.util.*;

public class Function {

    // ➕ Function to calculate sum of odd numbers between num1 and num2 (inclusive)
    public static int calculateOddSum(int num1, int num2) {
        int sum = 0;

        // Ensure num1 is smaller than or equal to num2
        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        // Loop from start to end
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) { // If the number is odd
                sum += i;
            }
        }

        return sum; // Return the final result
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🔢 Input two numbers from user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // 📞 Call the function and print the result
        int oddSum = calculateOddSum(num1, num2);
        System.out.println("Sum of odd numbers between " + num1 + " and " + num2 + " = " + oddSum);

        sc.close();
    }
}
