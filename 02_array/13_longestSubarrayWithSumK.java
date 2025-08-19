/*
Question: Longest Subarray with Given Sum K (positives)

Given an array of positive integers and a target sum K,
find the length of the longest subarray whose elements add up to exactly K.

Example:
Input: arr = [1, 2, 1, 1, 1, 3, 2], K = 5
Output: 4
Explanation: The longest subarray with sum 5 is [1, 1, 1, 2] or [2, 1, 1, 1].
*/



// Method-1: Brute Force
// Time Complexity: O(n)
// Space Complexity: O(1)
import java.util.*;
public class longestSubarrayWithSumK {
    
    // Function to find the longest subarray length with sum equal to K
    static int longestSubarray(int[] arr, int n, int k) {
        int maxLen = 0; // stores the maximum length found so far
        
        // Outer loop: fix the starting index of subarray
        for(int i = 0; i < n; i++) {
            long sum = 0; // sum of elements in the current subarray
            
            // Inner loop: fix the ending index of subarray
            for(int j = i; j < n; j++) {
                sum += arr[j]; // add current element to sum
                
                // Check if sum equals K
                if(sum == k) {
                    // update maxLen with length of current subarray (j - i + 1)
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        
        return maxLen; // return the maximum length found
    }
    
    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array size
        int n = sc.nextInt();
        
        // Input required sum K
        int k = sc.nextInt();
        
        // Input array
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Output the length of longest subarray
        System.out.println(longestSubarray(arr, n, k));
        
        sc.close();
    }
}



// Method-2: Better Approach (HashMap)
// Time Complexity: O(n * log n)
// Space Complexity: O(n)
import java.util.*;

public class longestSubarraySumK {
    
    // Function to find the length of the longest subarray with sum = k
    static int longestSubarray(int[] arr, int n, int k) {
        // Map to store prefix sum and its earliest index
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;       // prefix sum
        int maxLen = 0;    // answer (longest length)
        
        for (int i = 0; i < n; i++) {
            sum += arr[i];  // add current element to prefix sum
            
            // ✅ Case 1: If total sum itself is equal to k
            if (sum == k) {
                maxLen = i + 1;  // length = from index 0 to i
            }
            
            // ✅ Case 2: If (sum - k) exists in map
            // It means subarray (map.get(sum - k) + 1 → i) has sum = k
            if (map.containsKey(sum - k)) {
                int len = i - map.get(sum - k);
                maxLen = Math.max(maxLen, len);
            }
            
            // ✅ Case 3: Store the prefix sum if not already present
            // (We only store the first occurrence to maximize subarray length)
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        
        return maxLen;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input: size of array
        int n = sc.nextInt();
        // Input: target sum K
        int k = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Output: longest subarray length
        System.out.println(longestSubarray(arr, n, k));
        
        sc.close();
    }
}




// Method-3: Optimal Approach (2-Pointer)
// Time Complexity: O(n)
// Space Complexity: O(1)
import java.util.*;

public class longestSubarraySumK {
    static int longestSubarray(int[] arr, int n, int k) {
        int left = 0, right = 0;   // Two pointers
        int sum = arr[0];          // Current window sum
        int maxLen = 0;            // Stores maximum length found

        // Traverse the array using right pointer
        while (right < n) {
            // If current sum > k, shrink window from left
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            // If current sum == k, update maxLen
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move right pointer to expand window
            right++;
            if (right < n) {
                sum += arr[right];
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input size and target sum
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        // Input array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Output the result
        System.out.println(longestSubarray(arr, n, k));
        
        sc.close();
    }
}