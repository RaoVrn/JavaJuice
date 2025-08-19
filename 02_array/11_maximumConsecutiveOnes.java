/*
📌 Question: Maximum Consecutive Ones
--------------------------------------
Given a binary array (containing only 0s and 1s), 
find the maximum number of consecutive 1s present in the array.

Example 1:
Input: [1, 1, 0, 1, 1, 1]
Output: 3
Explanation: The longest sequence of consecutive 1s is of length 3.

Example 2:
Input: [1, 0, 1, 1, 0, 1]
Output: 2

Constraints:
- The array consists only of 0s and 1s.
- Time Complexity should be O(n).
- Space Complexity should be O(1).
*/



// Optimal Approach
// Time Complexity: O(n)
// Space Complexity: O(1)
import java.util.*;

public class MaximumConsecutiveOnes {
    
    // Function to find maximum consecutive 1s
    static int maxConsecutiveOnes(int[] arr, int n) {
        int maxCount = 0; // stores the maximum consecutive 1s found so far
        int count = 0;    // current consecutive 1s
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++; 
                maxCount = Math.max(maxCount, count); // update max
            } else {
                count = 0; // reset count when 0 appears
            }
        }
        
        return maxCount;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // array size
        
        int[] arr = new int[n];
        
        // input all n elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(maxConsecutiveOnes(arr, n));
        
        sc.close();
    }
}
