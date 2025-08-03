// 03_MultiplicationTableWhile.java
// JavaJuice - Homework: Multiplication table using while loop

/*
 * 📝 Homework:
 * Write a Java program that:
 * - Takes a number as input.
 * - Uses a `while` loop to print its multiplication table from 1 to 10.
 * 
 * Example:
 * Input: 5
 * Output:
 * 5
 * 10
 * 15
 * ...
 * 50
 *
 * ✅ Use only one println() and a loop.
 */


import java.util.*;

public class Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for a number
        System.out.print("Enter a number to print its multiplication table: ");
        int num = sc.nextInt();

        int i = 1; // Start multiplier from 1

        // Loop from 1 to 10 and print num * i each time
        while (i <= 10) {
            System.out.println(num * i);
            i++;
        }

        sc.close(); // Close the scanner
    }
}
