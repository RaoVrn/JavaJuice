// 10_SwitchCalculator.java
// JavaJuice - Homework: Simple calculator using switch-case

/*
 * 📝 Homework:
 * Make a Calculator using switch-case.
 * - Ask the user to enter two integers `a` and `b`.
 * - Ask the user to choose an operation by entering a number:
 *     1 → Addition (a + b)
 *     2 → Subtraction (a - b)
 *     3 → Multiplication (a * b)
 *     4 → Division (a / b)
 *     5 → Modulo (a % b)
 * 
 * ✅ Use switch-case to handle each operation.
 * ✅ Display the result.
 */

import java.util.*;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for two numbers
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        // Ask user for the operation
        System.out.println("Choose operation:");
        System.out.println("1: Addition (+)");
        System.out.println("2: Subtraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");
        System.out.println("5: Modulo (%)");
        System.out.print("Enter your choice (1-5): ");
        int operation = sc.nextInt();

        // Perform the operation using switch
        switch (operation) {
            case 1:
                System.out.println("Result: " + (a + b));
                break;
            case 2:
                System.out.println("Result: " + (a - b));
                break;
            case 3:
                System.out.println("Result: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            case 5:
                if (b != 0) {
                    System.out.println("Result: " + (a % b));
                } else {
                    System.out.println("Error: Cannot modulo by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation choice.");
        }

        sc.close();
    }
}
