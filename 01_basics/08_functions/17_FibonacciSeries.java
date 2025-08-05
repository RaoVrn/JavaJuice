/*
 * 🧮 Function 19: Fibonacci Series Generator
 *
 * Write a Java program to print the Fibonacci series of `n` terms.
 * The first two terms are 0 and 1.
 * Each next term is the sum of the previous two.
 *
 * Example:
 * Input: n = 9
 * Output: 0 1 1 2 3 5 8 13 21
 */

import java.util.*;

public class FibonacciSeries {

    public static void printFibonacci(int n) {
        int a = 0;  // First term
        int b = 1;  // Second term

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        // Print first n terms
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;  // Sum of previous two terms
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🔢 Input from user
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        // 🚀 Call the function
        printFibonacci(n);

        sc.close();
    }
}
