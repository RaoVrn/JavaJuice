/*
    Problem: Next Permutation

    Difficulty: Medium

    Description:
    A permutation of an array of integers is an arrangement of its elements 
    into a sequence or linear order.

    For example, for nums = [1,2,3], the following are permutations:
    [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1].

    The "next permutation" of an array of integers is the next 
    lexicographically greater permutation of its integers.

    More formally:
    - If all permutations of the array are sorted in lexicographical order, 
      the next permutation is the one that comes immediately after the 
      current arrangement.
    - If the current arrangement is the last permutation, 
      rearrange the array into the lowest possible order 
      (i.e., sorted in ascending order).

    Requirements:
    - Modify the array in-place.
    - Use only constant extra memory.

    Examples:
    Input: nums = [1,2,3]
    Output: [1,3,2]
    Explanation: The next permutation of [1,2,3] is [1,3,2].

    Input: nums = [3,2,1]
    Output: [1,2,3]
    Explanation: [3,2,1] is the last permutation. 
                 So we rearrange it into the lowest order [1,2,3].

    Input: nums = [1,1,5]
    Output: [1,5,1]
*/



// Brute Force
// Time Complexity: O(n! x n)
// Space Complexity: O(n)

/*
    - Generate all permutations of the array.
    - Sort all permutations in lexicographical order.
    - Find the current permutation's index using linear search.
    - Return the next index permutation (or first if at the end).
*/




// Optimal Approach
// Time Complexity: O(n)
// Space Complexity: O(1)

/*
    - longer prefix match
    - find greater than i but the smallest one (to stay close)
    - try to place remaining numbers in sorted order
*/

import java.util.*;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Step 1: Find the first decreasing element from right
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: If found, find the number just larger and swap
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        // Step 3: Reverse the part after i
        reverse(nums, i + 1, n - 1);
    }

    // Swap helper
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Reverse helper
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    // Main function to take input from user
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Find next permutation
        nextPermutation(nums);

        // Print result
        System.out.println("Next Permutation: " + Arrays.toString(nums));

        sc.close();
    }
}
