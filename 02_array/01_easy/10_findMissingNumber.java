/*
 📌 Problem Statement:
 You are given an array containing n distinct integers taken from the range 1 to n+1.
 The array is missing exactly one number from this range.  
 Your task is to find and return the missing number.

 🔹 Example:
 Input: arr = [1, 2, 4, 5, 6]
 Output: 3
 Explanation: The numbers should be 1, 2, 3, 4, 5, 6. Here, 3 is missing.

 🔹 Constraints:
 1 <= n <= 10^6
 Array contains distinct positive integers.
*/



// Method-1: Brute Force
// Time Complexity: O(n^2)
// Space Complexity: O(1)
import java.util.*;

public class MissingNumber {
    
    // 🔹 Brute force method to find the missing number
    static int missingNumber(int[] arr, int n) {
        // Check every number from 1 to n
        for (int i = 1; i <= n; i++) {
            boolean found = false; // flag to track if number exists in array
            
            // Search for i in the array
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == i) {
                    found = true; // number is found
                    break;
                }
            }
            
            // If number is not found, return it
            if (!found) {
                return i;
            }
        }
        return -1; // should never happen if input is valid
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input size of range (n numbers from 1 to n, but array has n-1 numbers)
        int n = sc.nextInt();
        
        // Input array of size n-1
        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Output missing number
        System.out.println(missingNumber(arr, n));
        
        sc.close();
    }
}




// Method-2: Using HashMap
// Time Complexity: O(2n)
// Space Complexity: O(n)
import java.util.*;

public class MissingNumber {
    
    // Function to find the missing number using HashMap
    static int missingNumber(int[] arr, int n) {
        // Create a hashmap to store the numbers present in the array
        HashMap<Integer, Boolean> map = new HashMap<>();
        
        // Put each element of array into the map
        for (int num : arr) {
            map.put(num, true);
        }
        
        // Check from 1 to n, which number is missing
        for (int i = 1; i <= n; i++) {
            if (!map.containsKey(i)) {
                return i;  // Found the missing number
            }
        }
        
        // If not found (theoretically shouldn't happen), return -1
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input size n (1 to n with one number missing)
        int n = sc.nextInt();
        
        // Array will contain n-1 elements
        int[] arr = new int[n-1];
        
        // Input elements
        for (int i = 0; i < n-1; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Print the missing number
        System.out.println(missingNumber(arr, n));
        
        sc.close();
    }
}



// Method-3: Optimal Approach (Using Sum)
// Time Complexity: O(n)
// Space Complexity: O(1)
import java.util.*;

public class MissingNumber {
    
    // Function to find the missing number using sum formula
    static int missingNumber(int[] arr, int n) {
        // Sum of first n natural numbers
        int expectedSum = (n * (n + 1)) / 2;
        
        // Sum of elements in the given array
        int actualSum = 0;
        for (int i = 0; i < n - 1; i++) {
            actualSum += arr[i];
        }
        
        // The missing number will be the difference
        return expectedSum - actualSum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the size n
        int n = sc.nextInt();
        
        // The array will have n-1 elements
        int[] arr = new int[n - 1];
        
        // Input array elements
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Print the missing number
        System.out.println(missingNumber(arr, n));
        
        sc.close();
    }
}


// Method-3: Optimal Approach (Using XOR)
// Time Complexity: O(n)
// Space Complexity: O(1)
import java.util.*;

public class MissingNumber {
    
    // Function to find the missing number using XOR approach
    static int missingNumber(int[] arr, int n) {
        int xor1 = 0; // XOR of numbers 1..n
        int xor2 = 0; // XOR of array elements
        
        // XOR numbers from 1 to n-1 and array elements simultaneously
        for (int i = 0; i < n - 1; i++) {
            xor1 ^= (i + 1);  // numbers from 1..(n-1)
            xor2 ^= arr[i];   // array values
        }
        
        // Finally include 'n' in xor1
        xor1 ^= n;
        
        // Missing number = xor1 ^ xor2
        return xor1 ^ xor2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input n (range is 1..n with one missing number)
        int n = sc.nextInt();
        
        // Array will have only (n-1) elements
        int[] arr = new int[n - 1];
        
        // Input array elements
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Print the missing number
        System.out.println(missingNumber(arr, n));
        
        sc.close();
    }
}
