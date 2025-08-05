// 01_PrintNameFunction.java
// JavaJuice - Function to print your name

/*
 * 🧠 Function 01: Print Your Name using a Function
 *
 * Write a Java program to print the user's name using a custom function.
 * - Define a method named `myName` that takes a string and prints it.
 * - In `main()`, read the name from user input and call `myName()` to print it.
 *
 * Example:
 * Input: Varun
 * Output: Varun
 *
 * ✅ This program helps you learn:
 * - How to define and call a method (function)
 * - How to pass parameters to a method
 * - How to use `Scanner` to take string input
 */


import java.util.*;

public class Main {

    // ✅ This function takes a string argument and prints it
    public static void myName(String name) {
        System.out.println(name);
        return; // Optional here, since void type ends automatically
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();  // Read full line input

        // ✅ Call the function with the input name
        myName(name);

        sc.close(); // Close scanner
    } 
}
