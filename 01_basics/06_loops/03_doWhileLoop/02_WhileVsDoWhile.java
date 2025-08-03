// 02_WhileVsDoWhile.java
// JavaJuice - Concept Demo: Difference between while and do-while loop

/*
 * 📝 Concept Practice:
 * Demonstrate the difference between `while` and `do-while` loops.
 * 
 * Instructions:
 * - Set i = 12 initially.
 * - Use a `while` loop that checks if i < 11 → it won’t run.
 * - Then use a `do-while` loop with i = 12 → it will run once.
 *
 * ✅ Purpose: Show that `do-while` runs the loop at least once, even if the condition is false.
 */

import java.util.*;

public class Print {
    public static void main(String[] args) {
        int i = 12;

        /*
         * While loop checks the condition before executing.
         * Since i = 12 and condition is i < 11 (false), this loop won't run.
         */
        while (i < 11) {
            System.out.println("While Loop: " + i);
            i++;
        }

        /*
         * Do-while loop runs the block first and checks condition later.
         * So this will run once even though i > 10.
         */
        do {
            System.out.println("Do-While Loop: " + i);
            i++;
        } while (i <= 10);
    }
}
