/*
    Problem: Maximum Subarray Sum (Kadane's Algorithm)

    Given an integer array, find the contiguous subarray (containing at least one number)
    which has the largest sum and return that sum.

    Example:
    Input: [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: [4,-1,2,1] has the largest sum = 6

    Constraints:
    - Array length >= 1
    - Elements can be positive, negative, or zero

    Task:
    Implement an efficient algorithm to calculate the maximum subarray sum.
    Explore both brute force and optimized approaches (Kadane's Algorithm).
*/




// Method-1: Brute Force Solution
// Time Complexity: O(n^3)
// Space Complexity: O(1)
public class MaximumSubarrayBruteForce {

    // Function to find maximum subarray sum using O(n^3) brute force
    static int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE; // store the maximum sum

        // Outer loop -> starting index of subarray
        for (int i = 0; i < n; i++) {
            // Inner loop -> ending index of subarray
            for (int j = i; j < n; j++) {
                int currentSum = 0; // reset sum for each subarray

                // Third loop -> calculate sum of subarray from i to j
                for (int k = i; k <= j; k++) {
                    currentSum += nums[k];
                }

                // Update maxSum if current subarray sum is greater
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum (O(n^3)): " + maxSubArray(nums));
    }
}



// Method-1: BBetter Approach
// Time Complexity: O(n^2)
// Space Complexity: O(1)
public class MaximumSubarrayBetter {

    // Function to find maximum subarray sum using O(n^2) approach
    static int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE; // store the maximum sum

        // Outer loop -> starting index of subarray
        for (int i = 0; i < n; i++) {
            int currentSum = 0; // reset sum for each new starting point

            // Inner loop -> ending index of subarray
            for (int j = i; j < n; j++) {
                // Add nums[j] to the running sum
                currentSum += nums[j];

                // Update maxSum if needed
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum (O(n^2)): " + maxSubArray(nums));
    }
}




// Method-3: Optimal Approach {Kandane's Algorithm}
// Time Complexity: O(n)
// Space Complexity: O(1)
public class MaximumSubarrayKadane {

    // Function to find maximum subarray sum using Kadane's Algorithm
    static int maxSubArray(int[] nums) {
        int currentSum = nums[0]; // max sum ending at current index
        int maxSum = nums[0];     // overall max sum so far

        // Traverse from the 2nd element
        for (int i = 1; i < nums.length; i++) {
            // Either extend the current subarray or start new from nums[i]
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update maxSum if currentSum is larger
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum (Kadane's O(n)): " + maxSubArray(nums));
    }
}