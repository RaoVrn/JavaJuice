/*
 * 🔁 Function 14: Infinite Loop using do-while
 *
 * Write a Java program that runs an infinite loop using the `do-while` condition.
 * - A `do-while` loop always runs at least once.
 * - The condition is intentionally set to `true` to make the loop infinite.
 * - Use this only for learning purposes — be cautious while running!
 */

public class InfiniteLoop {

    public static void main(String[] args) {
        do {
            System.out.println("This will run forever! 🔁");
        } while (true); // condition is always true → infinite loop
    }
}
