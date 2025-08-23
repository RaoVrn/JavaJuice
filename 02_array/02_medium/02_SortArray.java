/*
Problem Statement:
------------------
Given an array consisting only of 0s, 1s, and 2s, 
write a program to sort the array in ascending order.

Requirements:
-------------
- The program should correctly rearrange all 0s, 1s, and 2s 
  such that the final array is sorted.
- Multiple approaches can be used to solve this problem:
    1. Brute Force (using any simple sorting algorithm).
    2. Counting approach (count 0s, 1s, and 2s, then overwrite).
    3. Dutch National Flag algorithm (optimized in-place approach).
    4. Built-in sort function.

Input:
------
- An integer n representing the size of the array.
- n integers where each integer is either 0, 1, or 2.

Output:
-------
- The sorted array in ascending order.
*/



// Method-1: Brute Force Approach
// Time Complexity: O(n x log n) -> worst {merge sort}
// but here it is O(n^2) -> average and worst {bubble sort}
// Space Complexity: O(n)
import java.util.*;

public class SortArray {
    // Brute force sorting function (Bubble Sort)
    static void sortArray(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {  // outer loop for passes
            for (int j = 0; j < n - i - 1; j++) {  // inner loop for comparisons
                if (arr[j] > arr[j + 1]) {  // if out of order, swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // read size of array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // read elements
        }

        sortArray(arr, n); // call brute force sort

        // print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}




// Method-2: Better Approach {Counting}
// Time Complexity: O(2n)
// Space Complexity: O(1)
import java.util.*;

public class SortArray {
    // Better approach: Counting 0s, 1s, and 2s
    static void sortArray(int[] arr, int n) {
        int count0 = 0, count1 = 0, count2 = 0;

        // Step 1: Count occurrences of 0, 1, and 2
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) count0++;
            else if (arr[i] == 1) count1++;
            else count2++;
        }

        // Step 2: Overwrite the array in sorted order
        int index = 0;
        while (count0-- > 0) arr[index++] = 0;
        while (count1-- > 0) arr[index++] = 1;
        while (count2-- > 0) arr[index++] = 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // read size of array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // read elements
        }

        sortArray(arr, n); // call counting sort

        // print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}




// Method-3: Optimal Approach {Dutch National Flag}
// Time Complexity: O(n)
// Space Complexity: O(1)
import java.util.*;

public class SortArray {
    // Most optimal approach: Dutch National Flag Algorithm
    static void sortArray(int[] arr, int n) {
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                // swap arr[low] and arr[mid]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++; // leave 1 in the middle
            } else { // arr[mid] == 2
                // swap arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // read size of array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // read elements
        }

        sortArray(arr, n); // call optimal sort

        // print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}