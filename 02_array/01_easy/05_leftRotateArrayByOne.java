/*
    📌 Problem: Left Rotate an Array by One Place

    🔹 Description:
    Write a Java program that performs a left rotation on an array by one position.
    In a left rotation, the first element of the array moves to the last position,
    and every other element shifts one position to the left.

    🔹 Requirements:
    1. Input:
       - First line: an integer 'n' representing the number of elements in the array.
       - Second line: 'n' space-separated integers representing the array elements.
    2. Output:
       - Print the array after it has been left rotated by one position.
    
    🔹 Example:
       Input:
       5
       1 2 3 4 5
       
       Output:
       2 3 4 5 1

    🔹 Constraints:
       - 1 <= n <= 10^6
       - -10^9 <= array[i] <= 10^9
       - Program should work efficiently for large inputs.

    🔹 Hints:
       - Store the first element in a temporary variable.
       - Shift all elements one position to the left.
       - Assign the temporary variable to the last position of the array.

    💡 Try to implement it in the most optimal way.
*/



// Method-1: Optimal Approach
// Time Complexity: O(n)
// Space Complexity: O(1)
import java.util.*;

public class leftRotateArrayByOne {

    // 🔹 Method to perform left rotation by one place
    static void leftRotate(int[] arr, int n) {
        // Store the first element in a temporary variable
        int temp = arr[0];
        
        // Shift all elements to the left by one position
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        
        // Place the first element at the end
        arr[n - 1] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 📝 Step 1: Read the size of the array
        int n = sc.nextInt();

        // 📝 Step 2: Initialize the array
        int[] arr = new int[n];

        // 📝 Step 3: Take array input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 📝 Step 4: Call the rotation function
        leftRotate(arr, n);

        // 📝 Step 5: Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
