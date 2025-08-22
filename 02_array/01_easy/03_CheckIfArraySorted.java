/*
📝 Question:
Given an array of integers, check if the array is sorted in non-decreasing order.

Requirements:
1. Return true if the array is sorted, otherwise false.
2. Consider arrays with 0 or 1 element as sorted.
3. Implement an optimal approach with O(n) time and O(1) space.

Example 1:
Input: arr = [1, 2, 2, 3]
Output: true

Example 2:
Input: arr = [5, 3, 1]
Output: false

Constraints:
- 1 <= n <= 10^5
- -10^9 <= arr[i] <= 10^9
*/



// Method-1: Brute Force
// Time Complexity: O(n)
// Space Complexity: O(1)
import java.util.Scanner;

public class CheckIfArraySorted {

    static boolean isSorted(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) { // If any element is smaller than previous
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Output
        if (isSorted(arr, n)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is NOT sorted.");
        }

        sc.close();
    }
}
