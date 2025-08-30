/*
Problem: Longest Consecutive Sequence in an Unsorted Array

Description:
You are given an unsorted array of integers. 
Your task is to find the length of the longest sequence of consecutive integers 
present in the array.

Rules:
- The consecutive numbers can appear in any order in the array.
- The sequence should be formed by incrementing values by 1.
- Duplicate numbers should not break the sequence (they can be ignored).
- The solution should work efficiently even for large inputs.

Example 1:
Input:  [100, 4, 200, 1, 3, 2]
Output: 4
Explanation: The longest consecutive sequence is [1, 2, 3, 4].

Example 2:
Input:  [0, 3, 7, 2, 5, 8, 4, 6, 0, 1]
Output: 9
Explanation: The longest consecutive sequence is [0, 1, 2, 3, 4, 5, 6, 7, 8].

Constraints:
- 1 <= n <= 10^5  (size of array)
- -10^9 <= arr[i] <= 10^9
*/



// Method-1: Brute Force
// Time Complexity: O(n^2)
// Space Complexity: O(1)

import java.util.*;

public class LongestConsecutiveBruteForce {

    // Helper function to check if a number exists in the array
    static boolean contains(int[] arr, int num) {
        for (int value : arr) {
            if (value == num) return true;   // found the number
        }
        return false;   // number not found
    }

    // Function to find the longest consecutive sequence
    static int longestConsecutive(int[] arr, int n) {
        int longest = 0;   // stores the longest sequence length

        // Try to start a sequence from each element
        for (int i = 0; i < n; i++) {
            int currentNum = arr[i];
            int count = 1;   // current sequence length starts at 1

            // Keep checking for next consecutive numbers
            while (contains(arr, currentNum + 1)) {
                currentNum++;   // move to the next number
                count++;        // increase the sequence length
            }

            // Update longest sequence found so far
            longest = Math.max(longest, count);
        }

        return longest;
    }

    // Main method to take input and run the function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();       // size of the array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // input array elements
        }

        System.out.println(longestConsecutive(arr, n));

        sc.close();
    }
}





// Method-2: Better Apprach
// Time Complexity: O(n x log n)
// Space Complexity: O(n)
import java.util.*;

public class LongestConsecutive {
    
    static int longestConsecutive(int[] arr, int n) {
        if (n == 0) return 0;
        
        Arrays.sort(arr);  // Step 1: Sort the array
        int longest = 1;   // At least one element exists
        int count = 1;     // Current streak count
        
        for (int i = 1; i < n; i++) {
            // If duplicate, skip
            if (arr[i] == arr[i - 1]) {
                continue;
            }
            // If consecutive, increase streak
            else if (arr[i] == arr[i - 1] + 1) {
                count++;
                longest = Math.max(longest, count);
            } 
            // If not consecutive, reset streak
            else {
                count = 1;
            }
        }
        
        return longest;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input size
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Input elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Output longest consecutive subsequence length
        System.out.println(longestConsecutive(arr, n));
        
        sc.close();
    }
}






// Method-3: Optimal Approach
// Time Complexity: O(n)
// Space Complexity: O(n)
/*
    Problem: Longest Consecutive Sequence in an Array

    Description:
    You are given an unsorted array of integers. 
    Your task is to find the length of the longest subsequence such that
    the numbers in the subsequence appear consecutively (in increasing order),
    but not necessarily contiguous in the array.

    Example:
    Input: [100, 4, 200, 1, 3, 2]
    Output: 4
    Explanation: The longest consecutive subsequence is [1, 2, 3, 4]

    Constraints:
    - The array may contain duplicates.
    - Works for positive and negative numbers as well.
*/

import java.util.*;

public class LongestConsecutiveSequence {
    static int longestConsecutive(int[] arr, int n) {
        // Step 1: Put all numbers in a HashSet for O(1) lookup
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int longest = 0;

        // Step 2: Traverse the array
        for (int num : set) {
            // Only start counting if 'num' is the beginning of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                // Count the consecutive sequence
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                // Update the longest sequence length
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Output
        System.out.println(longestConsecutive(arr, n));

        sc.close();
    }
}