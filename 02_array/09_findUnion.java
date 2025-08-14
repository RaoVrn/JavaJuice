/*
💻 Java Juice Series – Question

📌 Problem:
Given two integer arrays `arr1` and `arr2` of sizes `n1` and `n2` respectively, 
write a program to find the Union of the two arrays.

📝 Definition:
The Union of two arrays is a collection of all distinct elements 
present in either `arr1` or `arr2`.

⚡ Example:
Input:
arr1 = [1, 2, 3, 4]
arr2 = [3, 4, 5, 6]

Output:
[1, 2, 3, 4, 5, 6]

🎯 Task:
- Read both arrays.
- Store all unique elements from both arrays.
- Output the union as an array.

*/



// Method-1: Brute Force
// Time Complexity: O(n1 log n1 + n2 log n2) + O(n1 + n2)
// Space Complexity: O(n1 + n2) + [ O(n1 + n2) ] -> to return/show
import java.util.*;

public class UnionOfArrays {
    
    // Function to find union using brute force (HashSet)
    static int[] findUnion(int[] arr1, int[] arr2, int n1, int n2) {
        Set<Integer> st = new HashSet<>();
        
        // Add all elements from arr1
        for (int i = 0; i < n1; i++) {
            st.add(arr1[i]);
        }
        
        // Add all elements from arr2
        for (int i = 0; i < n2; i++) {
            st.add(arr2[i]);
        }
        
        // Convert set to array
        int[] union = new int[st.size()];
        int j = 0;
        for (int it : st) {
            union[j++] = it;
        }
        
        return union;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input sizes
        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2: ");
        int n2 = sc.nextInt();
        
        // Input first array
        System.out.print("Enter the 1st array: ");
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        
        // Input second array
        System.out.print("Enter the 2nd array: ");
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        
        // Find union
        int[] union = findUnion(arr1, arr2, n1, n2);
        
        // Output result
        System.out.print("Union: ");
        for (int it : union) {
            System.out.print(it + " ");
        }
        
        sc.close();
    }
}





// Method-2: Two Pointer
// Time Complexity: O(n1 + n2)
// Space Complexity: O(n1 + n2) -> to return/show
import java.util.*;

public class UnionOfArraysTwoPointer {
    
    static List<Integer> findUnion(int[] arr1, int[] arr2, int n1, int n2) {
        List<Integer> union = new ArrayList<>();
        
        int i = 0, j = 0;
        
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i])
                    union.add(arr1[i]);
                i++;
            } 
            else if (arr1[i] > arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j])
                    union.add(arr2[j]);
                j++;
            } 
            else { // arr1[i] == arr2[j]
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i])
                    union.add(arr1[i]);
                i++;
                j++;
            }
        }
        
        // Add remaining elements from arr1
        while (i < n1) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i])
                union.add(arr1[i]);
            i++;
        }
        
        // Add remaining elements from arr2
        while (j < n2) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j])
                union.add(arr2[j]);
            j++;
        }
        
        return union;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input sizes
        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2: ");
        int n2 = sc.nextInt();
        
        // Input first sorted array
        System.out.print("Enter the 1st sorted array: ");
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        
        // Input second sorted array
        System.out.print("Enter the 2nd sorted array: ");
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        
        // Find union
        List<Integer> union = findUnion(arr1, arr2, n1, n2);
        
        // Output result
        System.out.print("Union: ");
        for (int it : union) {
            System.out.print(it + " ");
        }
        
        sc.close();
    }
}