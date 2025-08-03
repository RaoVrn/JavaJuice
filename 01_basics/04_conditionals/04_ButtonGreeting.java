// 08_ButtonGreeting.java
// JavaJuice - Homework: Print greetings based on button press

/*
 * 📝 Homework:
 * Take a number as input from the user.
 * Print a different greeting based on the number:
 * 1 → Namaste
 * 2 → Hello
 * 3 → Bonjour
*/

import java.util.*; // Import Scanner for taking input

public class ButtonGreeting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner to take user input

        System.out.print("Press a button (1, 2, or 3): ");
        int button = sc.nextInt(); // Read integer input

        // Use if-else-if to print different greetings
        if (button == 1) {
            System.out.println("Namaste");
        } else if (button == 2) {
            System.out.println("Hello");
        } else if (button == 3) {
            System.out.println("Bonjour");
        }

        sc.close(); // Close the scanner after use
    }
}
