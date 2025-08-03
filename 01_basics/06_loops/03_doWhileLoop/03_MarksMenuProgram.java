/*
 * 📝 Homework:
 * Menu-Driven Program using do-while loop.
 * - User enters 1 or 0.
 * - If 1 → take marks input (0–100) and print based on conditions:
 *     ≥90 → "This is Good"
 *     60–89 → "This is also Good"
 *     0–59 → "This is Good as well"
 * - If 0 → stop.
 *
 * ✅ Use `do-while` to keep asking until user exits.
 */

import java.util.*;

public class MarksMenuProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        do {
            System.out.print("Enter 1 to input marks, 0 to exit: ");
            input = sc.nextInt();

            if (input == 1) {
                System.out.print("Enter marks (0–100): ");
                int marks = sc.nextInt();

                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks >= 60) {
                    System.out.println("This is also Good");
                } else if (marks >= 0) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid Marks");
                }
            }

        } while (input != 0);

        sc.close();
    }
}
