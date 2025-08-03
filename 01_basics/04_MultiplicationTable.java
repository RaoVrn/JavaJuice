// MultiplicationTable.java
// JavaJuice - Homework 3: Print table of a number (no loop)


/*
 * 📝 Homework 3:
 * Write a program that:
 * - Takes a number as input from user.
 * - Prints its multiplication table up to 10.
 * 
 * 🔔 Hint:
 * You'll write 10 separate print statements for now.
 * Later, you will learn how to use loops to do this easily!
 */



import java.util.Scanner; // Import Scanner to take input from the user

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number to print its table: ");
        int num = sc.nextInt(); // Read the integer entered by the user

        // Print the multiplication table manually (without using loops)
        System.out.println("Multiplication Table of " + num + ":");
        System.out.println(num + " x 1 = " + (num * 1));
        System.out.println(num + " x 2 = " + (num * 2));
        System.out.println(num + " x 3 = " + (num * 3));
        System.out.println(num + " x 4 = " + (num * 4));
        System.out.println(num + " x 5 = " + (num * 5));
        System.out.println(num + " x 6 = " + (num * 6));
        System.out.println(num + " x 7 = " + (num * 7));
        System.out.println(num + " x 8 = " + (num * 8));
        System.out.println(num + " x 9 = " + (num * 9));
        System.out.println(num + " x 10 = " + (num * 10));

        // Close the Scanner object to free up system resources
        sc.close();
    }
}