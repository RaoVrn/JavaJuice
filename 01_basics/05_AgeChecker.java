// AgeChecker.java
// JavaJuice - Homework: Check if user is an adult using if-else

/*
 * 📝 Homework:
 * Write a Java program that:
 * - Takes the user's age as input.
 * - Checks if the person is 18 or older.
 * - If yes, prints "Adult".
 * - If not, prints "Not Adult".
*/

import java.util.*; // Import the Scanner class for input

public class AgeChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner for user input

        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // Read age as an integer

        // Check if the age is 18 or more
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }

        sc.close(); // Close the Scanner to prevent memory leaks
    }
}
