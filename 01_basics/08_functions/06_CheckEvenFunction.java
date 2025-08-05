/*
 * ✅ Function 07: Check if a number is even
 *
 * Write a function `isEven(int n)` that returns true if the number is even, false otherwise.
 * - A number is even if it is divisible by 2 (i.e., n % 2 == 0).
 * - In the main method, take input from the user.
 * - Use the function to check and print whether it's even or not.
 */


import java.util.*;

public class Function {

    // ✅ Function to check if a number is even
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // ✅ Ternary to print result
        System.out.println(isEven(n) ? n + " is Even" : n + " is Odd");

        sc.close();
    }
}
