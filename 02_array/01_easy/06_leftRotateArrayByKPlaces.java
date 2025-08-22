/*
===========================================
📌 Problem: Left Rotate an Array by K Places
===========================================

📝 Description:
Given an array of integers and a number 'k', your task is to rotate the array to the left by 'k' positions.
The rotation should be done in-place, meaning no extra array should be used for shifting elements
(except for a temporary variable or small helper space).

💡 Example:
-----------
Input:
    n = 7
    arr = [1, 2, 3, 4, 5, 6, 7]
    k = 2

Output:
    [3, 4, 5, 6, 7, 1, 2]

Explanation:
    - After 1st rotation: [2, 3, 4, 5, 6, 7, 1]
    - After 2nd rotation: [3, 4, 5, 6, 7, 1, 2]

🔹 Constraints:
---------------
1 ≤ n ≤ 10^5
0 ≤ k ≤ n
-10^9 ≤ arr[i] ≤ 10^9

🎯 Objective:
-------------
Write a program to:
    1. Read the size of the array (n) and its elements.
    2. Read the value of k.
    3. Rotate the array left by k positions.
    4. Print the updated array.

⏱️ Expected Time Complexity:
O(n)

📦 Expected Space Complexity:
O(1) — in-place modification allowed
*/



// Method-1: Brute Force
// Time Complexity: O(n + k) ~ O(n)
// Space Complexity: O(n)
import java.util.*;

/*
Brute Force Approach:
1. Store the first k elements in a temporary list.
2. Shift the remaining elements of the array to the left by k places.
3. Place the stored elements at the end of the array.
*/

public class LeftRotateArrayByKPlaces {
    
    // Function to rotate the array to the left by k positions
    static void leftRotate(int[] arr, int n, int k) {
        // Step 1: Handle cases where k >= n
        k %= n;
        if (k == 0) return; // No rotation needed

        // Step 2: Store first k elements in temp
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // Step 3: Shift remaining elements to the left
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        // Step 4: Place temp elements at the end
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: size of array and k
        int n = sc.nextInt();
        int k = sc.nextInt();

        // Input: array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Perform left rotation
        leftRotate(arr, n, k);

        // Output: rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}


// Method-2: Optimal Approach
// Time Complexity: O(n)
// Space Complexity: O(1)
import java.util.*;

public class LeftRotateArrayByOne {
    
    // Reverse elements between two indices
    static void rotate(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    
    // Rotate array left by k places using reversal algorithm
    static int[] leftRotate(int[] arr, int n, int k) {
        k %= n; // handle k > n
        if (k == 0) return arr; // no rotation needed
        
        rotate(arr, 0, k - 1);     // reverse first k elements
        rotate(arr, k, n - 1);     // reverse remaining n-k elements
        rotate(arr, 0, n - 1);     // reverse whole array
        
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // size of array
        int k = sc.nextInt(); // rotation count
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        leftRotate(arr, n, k);
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        sc.close();
    }
}
