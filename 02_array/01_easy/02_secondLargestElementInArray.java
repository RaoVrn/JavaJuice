/*
📝 Question:
Given an array of integers, find the second largest element in the array.

Requirements:
1. Implement multiple approaches:
   - Brute Force approach
   - Better approach (if applicable)
   - Optimal approach
2. The array may contain duplicate elements.
3. If the second largest element does not exist (e.g., all elements are same), handle appropriately.
4. Time and Space complexities for each approach should be mentioned.

Example 1:
Input: arr = [3, 2, 1, 5, 2]
Output: 3

Example 2:
Input: arr = [10, 10, 10]
Output: No second largest element

Constraints:
- 1 <= n <= 10^5
- -10^9 <= arr[i] <= 10^9
*/


// Method-1: Brute Force
// Time Complexity: O(n logn + n)
// Space Complexity: O(1)
import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElementInArray {

    static int secondLargestBruteForce(int[] arr, int n) {
        Arrays.sort(arr); // Sort in ascending order
        int largest = arr[n - 1]; // Store largest element
        for (int i = n - 2; i >= 0; i--) { // Traverse from second last element
            if (arr[i] != largest) {
                return arr[i]; // Found the second largest
            }
        }
        return -1; // All elements are equal
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Output result
        int secondLargest = secondLargestBruteForce(arr, n);
        if (secondLargest == -1) {
            System.out.println("No second largest element exists.");
        } else {
            System.out.println("Second largest element (Brute Force): " + secondLargest);
        }

        sc.close();
    }
}


// Method-2: Better Approach
// Time Complexity: O(2n)
// Space Complexity: O(1)
import java.util.Scanner;

public class SecondLargestElementInArray {

    static int secondLargestOptimal(int[] arr, int n) {
        int largest = arr[0];
        int secondLargest = -1;

        // Pass 1: Find the largest element
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Pass 2: Find the largest element that is not equal to 'largest'
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Input elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Output
        int result = secondLargestOptimal(arr, n);
        if (result == -1) {
            System.out.println("No second largest element exists.");
        } else {
            System.out.println("Second largest element (Optimal): " + result);
        }

        sc.close();
    }
}



// Method-3: Optimal Approach
// Time Complexity: O(n)
// Space Complexity: O(1)
import java.util.Scanner;

public class SecondLargestElementInArray {

    static int secondLargestSinglePass(int[] arr, int n) {
        int largest = arr[0];
        int secondLargest = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } 
            else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Input elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Output
        int result = secondLargestSinglePass(arr, n);
        if (result == -1) {
            System.out.println("No second largest element exists.");
        } else {
            System.out.println("Second largest element (Single-Pass Optimal): " + result);
        }

        sc.close();
    }
}