// CircleCalculator.java
// JavaJuice - Homework 2: Calculate Area & Circumference

/*
 * 📝 Homework 2:
 * Create a program that:
 * - Takes radius of a circle as input from user.
 * - Calculates area and circumference.
 * - Displays both to the user.
 * 
 * Formulas:
 * Area = π * r²
 * Circumference = 2 * π * r
 */


import java.util.Scanner; // Import Scanner class to take user input

public class CircleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        float radius = sc.nextFloat(); // Read the radius as a float

        /*
         * Area of a circle = π × r²
         * Math.PI gives the value of π (3.14159...)
         * Use double for more precise calculations
         */
        double area = Math.PI * radius * radius;

        /*
         * Circumference of a circle = 2 × π × r
         */
        double circumference = 2 * Math.PI * radius;

        // Display the results to the user
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);

        // Close the scanner to avoid memory leaks
        sc.close();
    }
}