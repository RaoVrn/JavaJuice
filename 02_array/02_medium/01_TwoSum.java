/*
 Problem: Two Sum

 Given an array of integers and a target value, 
 find two numbers (or their indices) in the array such that their sum equals the target.

 Approaches to solve:
 1. Brute Force (O(n^2)):
    - Try every pair and check if their sum equals the target.

 2. HashMap (O(n)):
    - Use a HashMap to store numbers and their indices.
    - For each number, check if (target - number) exists in the map.

 3. Two-Pointer (O(n log n)):
    - Sort the array.
    - Use two pointers (one from start, one from end) and move them inward based on the sum.
    - Note: Sorting changes indices, so this approach is usually for checking existence of a pair 
      rather than returning original indices.

 Input:
   n = 6, target = 9
   arr = [1, 2, 3, 4, 5, 6]

 Example Output:
   Indices: 2 and 5   // arr[2] = 3, arr[5] = 6 → 3 + 6 = 9
   or
   Pair: 3 and 6      // if only values are required
*/



// Method-1: Brute Force Approach
// Time Complexity: O(n^2)
// Space Complexity: O(1)
import java.util.*;`

public class TwoSum {
    static void twoSumBruteForce(int[] arr, int n, int target) {
        // Loop through every element
        for (int i = 0; i < n; i++) {
            // For each i, check every element after it
            for (int j = i + 1; j < n; j++) {
                // Check if the pair sums up to target
                if (arr[i] + arr[j] == target) {
                    System.out.println("Indices: " + i + " and " + j);
                    System.out.println("Values: " + arr[i] + " and " + arr[j]);
                    return; // stop after finding the first valid pair
                }
            }
        }
        // If loop finishes, no pair was found
        System.out.println("No pair found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size and target value
        int n = sc.nextInt();     
        int target = sc.nextInt(); 

        // Take array input
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call brute force method
        twoSumBruteForce(arr, n, target);
    }
}



// Method-2: Better Approach {HashMap}
// Time Complexity: O(n x log n)
// Space Complexity: O(n)
import java.util.*;

public class TwoSum {
    static void twoSumHashMap(int[] arr, int n, int target) {
        // Create a HashMap to store value → index
        Map<Integer, Integer> map = new HashMap<>();
        
        // Traverse the array
        for (int i = 0; i < n; i++) {
            int complement = target - arr[i]; // the number we need
            
            // Check if complement is already in map
            if (map.containsKey(complement)) {
                System.out.println("Indices: " + map.get(complement) + " and " + i);
                System.out.println("Values: " + complement + " and " + arr[i]);
                return;
            }
            
            // Otherwise, store the current number with its index
            map.put(arr[i], i);
        }
        
        // If loop ends without finding a pair
        System.out.println("No pair found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size and target value
        int n = sc.nextInt();     
        int target = sc.nextInt(); 

        // Take array input
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call HashMap method
        twoSumHashMap(arr, n, target);
    }
}



// Method-2: Optimal Approach {2-Pointer}
// Time Complexity: O(n x log n)
// Space Complexity: O(1)
import java.util.*;

public class TwoSum {
    static void twoSumTwoPointer(int[] arr, int n, int target) {
        Arrays.sort(arr); // Sort the array first → O(n log n)
        int left = 0, right = n - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            
            if (sum == target) {
                System.out.println("Pair: " + arr[left] + " and " + arr[right]);
                return;
            } else if (sum < target) {
                left++;  // increase sum by moving left pointer
            } else {
                right--; // decrease sum by moving right pointer
            }
        }

        System.out.println("No pair found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size and target value
        int n = sc.nextInt();     
        int target = sc.nextInt(); 

        // Take array input
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call Two-Pointer method
        twoSumTwoPointer(arr, n, target);
    }
}