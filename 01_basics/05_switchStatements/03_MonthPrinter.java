// 11_MonthPrinter.java
// JavaJuice - Homework: Print month name using switch-case

/*
 * 📝 Homework:
 * Write a program that:
 * - Asks the user to enter a number (1 to 12).
 * - Prints the name of the corresponding month.
 *   Example: 1 → January, 2 → February, ..., 12 → December
 *
 * ✅ Use switch-case to handle month selection.
*/


import java.util.*;

public class MonthPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for month number
        System.out.print("Enter a number (1 to 12): ");
        int month = sc.nextInt();

        // Print the month name using switch-case
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number!");
        }

        sc.close();
    }
}
