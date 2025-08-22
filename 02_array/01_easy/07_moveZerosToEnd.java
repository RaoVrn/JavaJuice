/*
Problem Statement:
------------------
Given an integer array `arr` of size `n`, write a program to move all the zeros present in the array 
to the end while maintaining the relative order of the non-zero elements.

Example:
--------
Input:
n = 7
arr = [0, 1, 0, 3, 12, 0, 5]

Output:
[1, 3, 12, 5, 0, 0, 0]

Explanation:
- All non-zero elements are moved to the front in their original order.
- All zeros are shifted to the end of the array.

Constraints:
------------
1 <= n <= 10^5
-10^9 <= arr[i] <= 10^9

Note:
-----
- The operation should be done in-place (without using extra array if possible).
- Try to solve it in O(n) time complexity.
*/



// Method-1: Brute Force
// Time Complexity: O(2n)
// Space Complexity: O(n)
import java.util.*;

public class MoveZerosToEnd {

    /**
     * Moves all zeros in the array to the end while maintaining the order
     * of non-zero elements.
     * 
     * @param arr the input array
     * @param n   size of the array
     */
    static void moveZerosToEnd(int[] arr, int n) {
        // Temporary list to store non-zero elements
        ArrayList<Integer> temp = new ArrayList<>();

        // Step 1: Add all non-zero elements to temp list
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        // Step 2: Fill remaining positions in temp with zeros
        for (int i = temp.size(); i < n; i++) {
            temp.add(0);
        }

        // Step 3: Copy elements from temp back to arr
        for (int i = 0; i < n; i++) {
            arr[i] = temp.get(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: array size
        int n = sc.nextInt();

        // Input: array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Process: Move zeros to the end
        moveZerosToEnd(arr, n);

        // Output: Modified array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}




// Method-2: Optimal Approach
// Time Complexity: O(n)
// Space Complexity: O(1)
import java.util.*;

public class ZerosToEnd {

    /**
     * Moves all zeros in the array to the end while keeping the
     * order of non-zero elements the same (in-place).
     * 
     * @param arr the array of integers
     * @param n   the size of the array
     */
    static void zerosToEnd(int[] arr, int n) {
        int i = -1;

        // Step 1: Find index of first zero
        for (int j = 0; j < n; j++) {
            if (arr[j] == 0) {
                i = j;
                break;
            }
        }

        // If no zero found, no need to proceed
        if (i == -1) return;

        // Step 2: Traverse from the next element after first zero
        for (int j = i + 1; j < n; j++) {
            if (arr[j] != 0) {
                // Swap the non-zero element with the zero at index i
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

                // Move i to the next zero position
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: size of array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input: array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Process: Move zeros to end
        zerosToEnd(arr, n);

        // Output: Modified array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
