/*
 * ➗ Function 09: Calculate Average of 3 Numbers
 *
 * Write a Java function `calculateAverage(int a, int b, int c)` that returns the average of three integers.
 * - The function should return the result as an integer (floor value if decimal).
 * - Take three numbers from the user as input in `main()`.
 * - Call the function and print the average.
 */

import java.util.*;

public class Function {

    // ➗ Function to calculate average of 3 numbers
    public static int calculateAverage(int num1, int num2, int num3) {
        // Sum all 3 numbers and divide by 3 to get the average
        int result = (num1 + num2 + num3) / 3;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🔢 Take 3 numbers as input from user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        // 📞 Call the function and store the result
        int avg = calculateAverage(num1, num2, num3);

        // 📤 Output the average
        System.out.println("Average = " + avg);

        sc.close();
    }
}
