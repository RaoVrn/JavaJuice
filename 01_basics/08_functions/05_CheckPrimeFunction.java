// 05_CheckPrimeFunction.java
// JavaJuice - Function to check if a number is prime

/*
 * 🧠 Function 05: Check if a Number is Prime
 *
 * Write a Java function that checks whether a number is prime or not.
 *
 * A prime number is greater than 1 and has no divisors other than 1 and itself.
 * 
 * Steps:
 * 1. Create a function `isPrime(int num)` that returns a boolean.
 * 2. If the number is <= 1, return false.
 * 3. Loop from 2 to sqrt(num), and check if num is divisible.
 * 4. In `main()`, read input and call the function.
 * 5. Print whether it's a prime or not based on the return value.
 *
 * ✅ Concepts Covered:
 * - Prime number logic
 * - Looping and conditionals
 * - Returning boolean from a function
 */


import java.util.*;

public class Function {

    // ✅ Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0, 1, and negative numbers are not prime
        }

        // Loop from 2 to sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Found a divisor → not prime
            }
        }

        return true; // No divisors found → prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to take input
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read user input

        // ✅ Call the function and store the result
        boolean result = isPrime(num);

        // Print result
        if (result) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is NOT a Prime number.");
        }

        sc.close();
    }
}
