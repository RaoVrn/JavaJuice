/*
 * 📝 BONUS Homework:
 * Write a program to check if a number is prime.
 * - A number is prime if it has no divisors other than 1 and itself.
 * - 0 and 1 are NOT prime.
 * ✅ Use a `for` loop from 2 to sqrt(n).
 */

import java.util.*;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int n = sc.nextInt();

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is Prime.");
        } else {
            System.out.println(n + " is NOT Prime.");
        }

        sc.close();
    }
}