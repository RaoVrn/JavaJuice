// 01_PrintNumbersWhile.java
// JavaJuice - Homework: Print numbers from 0 to 10 using a while loop

/*
 * 📝 Homework:
 * Write a Java program that:
 * - Uses a `while` loop to print numbers from 0 to 10.
 *
 * ✅ Use only one println() inside the loop.
 * ✅ Initialize and update the loop variable properly.
 */

import java.util.*;

public class Print {
    public static void main(String[] args) {
       int i = 0; // Initialization

        // Run the loop as long as i is less than or equal to 10
        while (i <= 10) {
            System.out.println(i); // Print current value of i
            i++; // Increment i by 1
        }
    }
}
