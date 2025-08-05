/*
 * 🧮 Function 17: Power Function (xⁿ)
 *
 * Write a function that takes two integers `x` and `n` from the user and returns `x` raised to the power `n`.
 * For example, if x = 2 and n = 3, the output should be 8 (2^3).
 *
 * Do not use Math.pow() here — use loops and logic.
 */

import java.util.*;

public class PowerFunction {

    // ✅ Function to calculate x raised to the power n
    public static int calculatePower(int x, int n) {
        int result = 1;

        // Multiply x by itself n times
        for (int i = 1; i <= n; i++) {
            result *= x;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🧾 Take input from user
        System.out.print("Enter base (x): ");
        int x = sc.nextInt();

        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();

        // 🔢 Call the function and print result
        int power = calculatePower(x, n);
        System.out.println(x + " raised to the power " + n + " is: " + power);

        sc.close();
    }
}
