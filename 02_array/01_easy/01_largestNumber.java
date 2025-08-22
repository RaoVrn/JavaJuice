/*
📝 Question:
Given an array of integers, find the largest element in the array.

Requirements:
1. Implement **all possible approaches**:
   - Brute Force approach
   - Better approach (if applicable)
   - Optimal approach
2. Consider both positive and negative integers in the array.
3. Assume array length `n` ≥ 1.
4. Time and Space complexities for each approach should be mentioned.
5. Use clear variable names for better readability.

Example:
Input: arr = [3, 2, 1, 5, 2]
Output: 5

Constraints:
- 1 <= n <= 10^5
- -10^9 <= arr[i] <= 10^9
*/


// Method-1: Brute Force Approach
// Time Complexity: O(n log n)
// Space Complexity: O(1)
import java.util.Arrays;
import java.util.Scanner;

public class LargestElementInArray {
    static int largestBruteForce(int[] arr) {
        Arrays.sort(arr); // Sort in ascending order
        return arr[arr.length - 1]; // Last element is largest
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Creating array and taking elements input
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Output result
        System.out.println("Largest element (Brute Force): " + largestBruteForce(arr));

        sc.close();
    }
}



// Method-2: Optimal Approach
// Time Complexity: O(n)
// Space Complexity: O(1)
import java.util.Scanner;

public class LargestElementInArray {
    static int largestOptimal(int[] arr, int n) {
        int maxElement = arr[0]; // Assume first element is max
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Creating array and taking elements input
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Output result
        System.out.println("Largest element (Optimal): " + largestOptimal(arr, n));

        sc.close();
    }
}
