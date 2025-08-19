/*
📌 Question: Find the number that appears once, and other numbers twice.
-----------------------------------------------------------------------
Given an array of integers where every element appears twice except for one, 
find that single element.

Example 1:
Input: [2, 2, 1]
Output: 1

Example 2:
Input: [4, 1, 2, 1, 2]
Output: 4

Constraints:
- The array will always contain exactly one element that appears once.
- All other elements appear twice.
- Time Complexity should be O(n).
- Space Complexity should be O(1).
*/


// Method-1: Brute Force
// Time Complexity: O(n^2)
// Space Complexity: O(1)
import java.util.*;

public class UniqueNumber {
    
    // Function to find the number that appears only once
    static int findUniqueNumber(int[] arr, int n) {
        // Loop through each element of the array
        for (int i = 0; i < n; i++) {
            int count = 0;   // To count frequency of current number
            int num = arr[i]; // Current number to check
            
            // Compare current number with all other numbers
            for (int j = 0; j < n; j++) {
                if (arr[j] == num) {
                    count++; // Increase count if match found
                }
            }
            
            // If this number occurs only once, return it
            if (count == 1) {
                return num;
            }
        }
        
        // If no unique number is found
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array size
        int n = sc.nextInt();
        
        // Input array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Output the unique number
        System.out.println(findUniqueNumber(arr, n));
        
        sc.close();
    }
}




// Method-1: Better Approach (Using HashMap)
// Time Complexity: O(2n)
// Space Complexity: O(n)
import java.util.*;

public class SingleNumber {
    static int findSingleNumber(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Store frequency of each number
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find the number with frequency 1
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1; // in case no such element exists
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findSingleNumber(arr, n));
        sc.close();
    }
}


// Method-1: Optimal Approach (Using XOR)
// Time Complexity: O(n)
// Space Complexity: O(1)
import java.util.*;

public class MissingNumber {
    
    // Function to find the number that appears only once
    static int missingNumber(int[] arr, int n) {
        int xor = 0; // Initialize XOR result as 0
        
        // Step 1: XOR all numbers in the array
        // ✅ Property of XOR:
        //     a ^ a = 0  (same numbers cancel out)
        //     a ^ 0 = a  (number with zero remains same)
        // So, all duplicate numbers will cancel each other,
        // and the number that appears once will remain.
        for (int num : arr) {
            xor ^= num;
        }
        
        // Step 2: Return the single unique number
        return xor;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input size of array
        int n = sc.nextInt();
        
        // Input array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Output the number that appears once
        System.out.println(missingNumber(arr, n));
        
        sc.close();
    }
}
