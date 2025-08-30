/*
    Problem: Rearrange Array in Alternating Positive and Negative Items

    Description:
    You are given an integer array containing both positive and negative numbers. 
    Your task is to rearrange the array such that positive and negative numbers 
    appear in an alternating fashion (one positive, then one negative, and so on).
    
    Rules:
    - The order of appearance of positive and negative numbers does NOT matter.
    - If there are extra positive numbers, they should be placed at the end.
    - If there are extra negative numbers, they should also be placed at the end.
    - Zero (0) can be treated as a positive number for this problem.

    Input:
    - An integer array, e.g. arr = {1, -2, 3, -4, 5, 6, -7, -8, 9}
    
    Output:
    - Rearranged array with alternating positive and negative integers.
    
    Example 1:
    Input:  [1, -2, 3, -4, 5, 6, -7, -8, 9]
    Output: [1, -2, 3, -4, 5, -7, 6, -8, 9]
    
    Example 2:
    Input:  [-5, -2, 5, 2, 4, 7, 1, 8, 0, -8]
    Output: [5, -5, 2, -2, 4, -8, 7, 1, 8, 0]
    
    Explanation:
    In the above example, positives and negatives alternate. 
    Extra positives are appended at the end.

    Your Task:
    Write a Java program with a function:
        void rearrange(int[] arr, int n)
    that rearranges the array in-place or using extra space 
    to achieve the alternating arrangement.
*/




//Method-1: Brute Force
//Time Complexity: O(2n)
//Space Complexity: O(n)
import java.util.*;

public class RearrangeArray {
    
    // Function to rearrange the array in alternating positive and negative order
    static void rearrange(int[] arr, int n) {
        // Step 1: Create two lists to store positives and negatives
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        
        // Step 2: Separate numbers into positives and negatives
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {   // Treat zero as positive
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }

        // Step 3: Merge them back into the original array
        int i = 0, p = 0, ng = 0;
        
        // Alternate positive and negative until one list runs out
        while (p < pos.size() && ng < neg.size()) {
            arr[i++] = pos.get(p++);  // place a positive number
            arr[i++] = neg.get(ng++); // place a negative number
        }

        // Step 4: If positives remain, put them at the end
        while (p < pos.size()) {
            arr[i++] = pos.get(p++);
        }

        // Step 5: If negatives remain, put them at the end
        while (ng < neg.size()) {
            arr[i++] = neg.get(ng++);
        }
    }

    // Driver code to test
    public static void main(String[] args) {
        int[] arr1 = {1, -2, 3, -4, 5, 6, -7, -8, 9};
        int[] arr2 = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};

        rearrange(arr1, arr1.length);
        System.out.println("Example 1 Output: " + Arrays.toString(arr1));

        rearrange(arr2, arr2.length);
        System.out.println("Example 2 Output: " + Arrays.toString(arr2));
    }
}



// Optimal Apprach
// Time Complexity: O(n)
// Space Complexity: O(1)
import java.util.*;

public class RearrangeEqual {
    static void rearrange(int[] arr, int n) {
        // Output array (brute force but clean approach)
        int[] ans = new int[n];

        int pos = 0; // start filling positives at even indices
        int neg = 1; // start filling negatives at odd indices

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                // place positive at even index
                ans[pos] = arr[i];
                pos += 2; // move to next even index
            } else {
                // place negative at odd index
                ans[neg] = arr[i];
                neg += 2; // move to next odd index
            }
        }

        // Copy back into original array
        for (int i = 0; i < n; i++) {
            arr[i] = ans[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, -2, 5, -7, 1, -4};
        rearrange(arr, arr.length);
        System.out.println("Rearranged: " + Arrays.toString(arr));
    }
}
