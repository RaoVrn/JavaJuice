/*
 * ✅ Function 08: Print Table of a Number
 *
 * Write a function `printTable(int n)` that prints the multiplication table for the number.
 * - The table should go from n x 1 to n x 10.
 * - In the main method, take input from the user and call the function.
 */

import java.util.*;

public class Function {

    // ✅ Function to print the multiplication table of n
    public static void printTable(int n) {
        System.out.println("Multiplication Table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to print its table: ");
        int n = sc.nextInt();

        // ✅ Call the function
        printTable(n);

        sc.close();
    }
}
