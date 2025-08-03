// 09_SwitchGreeting.java
// JavaJuice - Homework: Use switch-case to print greetings based on button press

/*
 * 📝 Homework:
 * Use switch-case to handle button presses.
 * 1 → Namaste
 * 2 → Hello
 * 3 → Bonjour
 * Anything else → Invalid
*/

import java.util.*; // Import Scanner class

public class SwitchGreeting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create Scanner for user input

        System.out.print("Press a button (1, 2, or 3): ");
        int button = sc.nextInt(); // Read the button number

        // switch-case to handle multiple options cleanly
        switch(button) {
            case 1:
                System.out.println("Namaste");
                break;

            case 2:
                System.out.println("Hello");
                break;

            case 3:
                System.out.println("Bonjour");
                break;

            default:
                System.out.println("Invalid");
        }

        sc.close(); // Close the scanner to prevent memory leaks
    }
}
