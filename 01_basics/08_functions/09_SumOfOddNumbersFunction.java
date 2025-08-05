/*
 * ➕ Function 10: Sum of All Odd Numbers till N
 *
 * Write a function `calculateOddSum(int n)` that calculates the sum of all odd numbers from 1 to n (inclusive).
 * - A number is odd if it leaves a remainder when divided by 2 (i % 2 != 0).
 * - In main(), take user input for n.
 * - Print the sum returned by the function.
 */


import java.util.*;

public class Function {

    // ➕ Function to calculate sum of odd numbers from 1 to n
    public static int calculateOddSum(int num) {
        int result = 0;

        // Loop from 1 to num (inclusive)
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) { // If the number is odd
                result += i;  // Add it to the result
            }
        }

        return result; // Return the total sum
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🔢 Input number from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // 📞 Call function and print result
        int oddSum = calculateOddSum(num);
        System.out.println("Sum of odd numbers till " + num + " = " + oddSum);

        sc.close();
    }
}
