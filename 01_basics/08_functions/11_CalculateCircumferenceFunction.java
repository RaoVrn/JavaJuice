/*
 * 🧮 Function 12: Calculate Circumference of a Circle
 *
 * Write a function `calculateCircumference(float radius)` that returns the circumference of a circle.
 * - Circumference formula: 2 * π * radius
 * - Use `Math.PI` for accuracy.
 * - Take radius as input from the user.
 * - Return the calculated value and print it in `main()`.
 */

import java.util.*;

public class Function {

    // 🧮 Function to calculate circumference of a circle using radius
    public static double calculateCircumference(float rad) {
        // Use Math.PI for better precision
        double c = 2 * Math.PI * rad;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🔢 Input radius from user
        System.out.print("Enter radius of the circle: ");
        float rad = sc.nextFloat();

        // 📞 Call function to calculate circumference
        double circumference = calculateCircumference(rad);

        // 📤 Print the result
        System.out.println("Circumference = " + circumference);

        sc.close();
    }
}
