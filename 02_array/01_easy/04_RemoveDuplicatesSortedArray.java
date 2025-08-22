/*
Problem: Remove Duplicates from Sorted Array
--------------------------------------------
Given a sorted array, remove the duplicates in-place such that each unique element appears only once.
Return the number of unique elements (length of the modified array).

The relative order of the elements should be kept the same.

You must do this with O(1) extra space (in-place modification).

Example:
--------
Input:
n = 6
arr = [1, 1, 2, 2, 3, 4]

Output:
Number of unique elements: 4
Array after removing duplicates: [1, 2, 3, 4]

Constraints:
------------
1 <= n <= 10^4
-10^4 <= arr[i] <= 10^4
Array is sorted in non-decreasing order.
*/




// Method-1: Brute Force
// Time Complexity: O(n)
// Space Complexity: O(n)
import java.util.*;

public class RemoveDuplicatesSortedArray {
    static int removeDuplicates(int[] arr, int n) {
        // Step 1: Use LinkedHashSet to maintain order and remove duplicates
        Set<Integer> set = new LinkedHashSet<>();
        
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        
        // Step 2: Copy unique elements back to array
        int index = 0;
        for (int num : set) {
            arr[index++] = num;
        }
        
        // Step 3: Return size of set (number of unique elements)
        return set.size();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input size
        int n = sc.nextInt();
        
        // Input array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Get new length after removing duplicates
        int newLength = removeDuplicates(arr, n);
        System.out.println("Length: " + newLength);
        
        // Print modified array up to new length
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
        
        sc.close();
    }
}





// Method-2: Optimal Approach (2 Pointer)
// Time Complexity: O(n)
// Space Complexity: O(1)
import java.util.*;

public class RemoveDuplicatesTwoPointer {
    static int removeDuplicates(int[] arr, int n) {
        if (n == 0) return 0; // Edge case: empty array

        int i = 0; // Pointer for the place to insert unique elements
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) { // Found a new unique element
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1; // New length = index + 1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Processing
        int newLength = removeDuplicates(arr, n);

        // Output
        System.out.println("New length: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}