/*
 * 🧮 Function 18: Greatest Common Divisor (GCD)
 *
 * Write a function that calculates the GCD (or HCF) of two given integers.
 * GCD is the largest number that divides both numbers without leaving a remainder.
 *
 * Example:
 * Input: a = 12, b = 18
 * Output: GCD = 6
 */

import java.util.*;

public class GCD {

    // ✅ Function to compute GCD using Euclidean Algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;  // Get remainder
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 📥 Take input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // ⚙️ Call GCD function
        int result = calculateGCD(num1, num2);

        // 📤 Output
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);

        sc.close();
    }
}
