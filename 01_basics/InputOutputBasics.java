// InputOutputBasics.java
// JavaJuice - Basics: Input and Output in Java

import java.util.Scanner; // Import the Scanner class for input

public class InputOutputBasics {
    public static void main(String[] args) {

        // OUTPUT SECTION
        System.out.println("Welcome to JavaJuice!");
        System.out.println("This is how we display output in Java.");
        System.out.print("This will stay on the same line ");
        System.out.print("- see?\n");

        // INPUT SECTION
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Take integer input
        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // Reads an integer from user

        // Take decimal input
        System.out.print("Enter your GPA: ");
        float gpa = sc.nextFloat(); // Reads a float from user

        // Fix newline issue before taking string input
        sc.nextLine(); // Clears the leftover newline~

        // Take a full line of text input
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // Reads a full line (name)

        // Displaying the input values
        System.out.println("\n--- Your Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);

        // Close the scanner (good practice)
        sc.close();
    }
}
