/*
 * ✅ Function 13: Check Voting Eligibility
 *
 * Write a function `isEligibleToVote(int age)` that returns `true` if the person is eligible to vote.
 * - A person is eligible if their age is 18 or more.
 * - Take the age as input from the user.
 * - Display: "Eligible to vote." or "Not eligible to vote."
 */

import java.util.*;

public class Function {

    // ✅ Function to check if age is eligible for voting
    public static boolean isEligibleToVote(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🔢 Input age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // ✅ Call function and check result
        if (isEligibleToVote(age)) {
            System.out.println("✅ Eligible to vote.");
        } else {
            System.out.println("❌ Not eligible to vote.");
        }

        sc.close();
    }
}
