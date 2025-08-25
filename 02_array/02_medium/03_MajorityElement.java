/*
    Problem Statement:
    ------------------
    Given an array of integers of size n, find the majority element.
    The majority element is the element that appears more than n/2 times.

    If such an element exists, print it.
    Otherwise, print "No majority element".

    Example 1:
    Input:  [3, 3, 4, 2, 3, 3, 3]
    Output: 3

    Example 2:
    Input:  [1, 2, 3, 4, 5]
    Output: No majority element

    Constraints:
    - Array size n ≥ 1
    - Array elements can be positive, negative, or zero
    - Only one element can be a valid majority
*/



// Method-1: Brute Force
// Time Complexity: O(n^2)
// Space Complexity: O(1)
public class MajorityElementBruteForce {

    // Function to find majority element using brute force
    public static int findMajorityElement(int[] nums) {
        int n = nums.length;

        // Outer loop: pick each element one by one
        for (int i = 0; i < n; i++) {
            int count = 0;

            // Inner loop: count occurrences of nums[i]
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            // If count is greater than n/2, return the element
            if (count > n / 2) {
                return nums[i];
            }
        }

        // Problem guarantees majority element exists, so this won't execute
        return -1;
    }

    // Driver code to test the function
    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 3, 3, 3};

        int majority = findMajorityElement(nums);
        System.out.println("Majority Element: " + majority);
    }
}





// Method-2: Better Approach {Hashing}
// Time Complexity: O(n)
// Space Complexity: O(n)
import java.util.HashMap;

public class MajorityElementHashMap {

    // Function to find majority element using HashMap
    public static int findMajorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies of each element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            // Check if this element is majority
            if (map.get(num) > n / 2) {
                return num;
            }
        }

        // Problem guarantees majority element exists, so this won't execute
        return -1;
    }

    // Driver code
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 2, 2, 2};

        int majority = findMajorityElement(nums);
        System.out.println("Majority Element: " + majority);
    }
}






// Method-3: Optimal Apprach {Boyer-Moore Voting Algorithm}
// Time Complexity: O(2n)
// Space Complexity: O(1)
public class MajorityElementBoyerMoore {

    // Function to find majority element using Boyer-Moore Voting Algorithm
    public static int findMajorityElement(int[] nums) {
        int count = 0;
        int element = 0;  // initialize element

        // Step 1: Find candidate
        for (int num : nums) {
            if (count == 0) {
                element = num;
                count = 1;
            } else if (num == element) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify candidate
        int cnt = 0;
        for (int num : nums) {
            if (num == element) {
                cnt++;
            }
        }

        if (cnt > nums.length / 2) {
            return element;
        }

        return -1; // though problem guarantees existence
    }

    // Driver code
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 2, 2, 2};

        int majority = findMajorityElement(nums);
        System.out.println("Majority Element: " + majority);
    }
}
