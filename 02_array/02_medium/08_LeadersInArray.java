/*
    Problem: Leaders in an Array

    Description:
    Given an array of integers, an element is called a "leader" 
    if it is greater than or equal to all the elements to its right side 
    in the array.

    Your task:
    - Find all the leaders in the given array.
    - Return or print them in the order they appear from left to right.

    Example 1:
    Input:  [16, 17, 4, 3, 5, 2]
    Output: [17, 5, 2]
    Explanation: 
        - 17 is greater than all elements to its right.
        - 5 is greater than all elements to its right.
        - 2 is the last element, so it is always a leader.

    Example 2:
    Input:  [1, 2, 3, 4, 0]
    Output: [4, 0]

    Constraints:
    - 1 <= array length <= 10^5
    - -10^6 <= array element <= 10^6
*/





// Brute Force
// Time Complexity: O(n^2)
// Space Complexity: O(n)
import java.util.*;

public class LeadersInArray {

    static List<Integer> findLeaders(int[] arr) {
        int n = arr.length;
        List<Integer> leaders = new ArrayList<>();

        // Traverse each element
        for (int i = 0; i < n; i++) {
            boolean isLeader = true;

            // Check all elements to the right of arr[i]
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    isLeader = false; // Not a leader if any right element is greater
                    break;
                }
            }

            // If still leader, add to result
            if (isLeader) {
                leaders.add(arr[i]);
            }
        }

        return leaders;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find leaders
        List<Integer> leaders = findLeaders(arr);

        // Output
        System.out.println("Leaders in the array are: " + leaders);
    }
}







// Optimal Approach
// Time Complexity: O(n)
// Space Complexity: O(n)
import java.util.*;

public class LeadersInArrayOptimal {

    // Function to find leaders using O(n) approach
    static ArrayList<Integer> leaderArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> leaders = new ArrayList<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] >= max) {
                leaders.add(nums[i]); // current element is a leader
                max = nums[i];        // update max so far
            }
        }

        // Reverse to maintain left-to-right order
        Collections.reverse(leaders);
        return leaders;
    }

    // Main function to handle input and output
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Input elements
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Get leaders
        ArrayList<Integer> leaders = leaderArray(arr);

        // Print result
        System.out.println("Leaders in the array are:");
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }

        sc.close();
    }
}