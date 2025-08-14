/*
Write a Java program to implement the Linear Search algorithm.

Description:
You are given an array of integers and a number to search for. 
Your task is to find the index of the given number in the array 
using the linear search technique.

Requirements:
1. Read the size of the array (n) from the user.
2. Read the number to search for (num) from the user.
3. Read n integers as the array elements.
4. Search for num in the array using linear search.
5. If the number is found, print the index (0-based).
6. If the number is not found, print -1.

Constraints:
- 1 <= n <= 1000
- Array elements and num can be any integer.

Example:
Input:
5
3
1 3 5 7 9

Output:
1
*/


// Method-1: Brute Force
// Time Complexity: O(n)
// Space Complexity: O(1)
import java.util.*;

public class linearSearch {
    // Method to perform linear search
    static int linearSearch(int[] arr, int n, int num) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                return i; // index found
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read size of array
        int n = sc.nextInt();

        // Step 2: Read number to search
        int num = sc.nextInt();

        // Step 3: Read array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 4: Perform linear search and print result
        System.out.println(linearSearch(arr, n, num));

        sc.close();
    }
}
