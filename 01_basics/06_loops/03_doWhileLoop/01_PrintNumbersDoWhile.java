// 04_PrintNumbersDoWhile.java
// JavaJuice - Homework: Print numbers from 0 to 10 using a do-while loop

/*
 * 📝 Homework:
 * Write a Java program that:
 * - Uses a `do-while` loop to print numbers from 0 to 10.
 *
 * ✅ Use only one println() inside the loop.
 * ✅ Make sure the loop prints at least once.
 */

import java.util.*;

public class Print {
    public static void main(String[] args) {
        int i = 0; // Start from 0

        // Loop body runs first, condition checked after
        do {
            System.out.println(i); // Print current value of i
            i++;                   // Increment i
        } while (i <= 10); // Check condition at the end
    }
}
