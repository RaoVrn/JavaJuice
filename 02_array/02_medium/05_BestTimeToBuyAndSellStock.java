/*
    Question:
    You are given an array prices where prices[i] is the price of a given stock on the i-th day.
    You want to maximize your profit by choosing a single day to buy one stock 
    and choosing a different day in the future to sell that stock.

    Return the maximum profit you can achieve from this transaction.
    If you cannot achieve any profit, return 0.

    Example 1:
    Input: prices = [7,1,5,3,6,4]
    Output: 5
    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
    Note: You cannot sell on day 2 before buying on day 2.

    Example 2:
    Input: prices = [7,6,4,3,1]
    Output: 0
    Explanation: In this case, no transaction is done and the max profit = 0.

    Constraints:
    - 1 <= prices.length <= 10^5
    - 0 <= prices[i] <= 10^4
*/




// Method-2: Brute Force Approach
// Time Complexity: O(n^2)
// Space Complexity: O(1)
class Solution {

    // Function to calculate the maximum profit using brute force
    public int stockBuySell(int[] arr, int n) {
        int maxProfit = 0;

        // Try every possible buy day
        for (int i = 0; i < n; i++) {
            // Try every possible sell day after i
            for (int j = i + 1; j < n; j++) {
                int profit = arr[j] - arr[i];        // profit if bought at i and sold at j
                maxProfit = Math.max(maxProfit, profit); // update max profit
            }
        }

        return maxProfit;
    }

    // Example run
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int n = prices.length;
        System.out.println("Maximum Profit (Brute Force): " + sol.stockBuySell(prices, n));
        // Output: 5
    }
}




// Method-2: Optimal Approach {Dynamic Programming}
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {

    // Function to calculate the maximum profit
    public int stockBuySell(int[] arr, int n) {
        int minPrice = arr[0]; // initialize with the price on day 0
        int maxProfit = 0;     // no profit initially

        // Traverse from day 1 onwards
        for (int i = 1; i < n; i++) {
            int cost = arr[i] - minPrice;       // profit if we sell today
            maxProfit = Math.max(maxProfit, cost); // update max profit
            minPrice = Math.min(minPrice, arr[i]); // update min price if lower found
        }

        return maxProfit;
    }

    // Example run
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int n = prices.length;
        System.out.println("Maximum Profit (Optimal): " + sol.stockBuySell(prices, n));
        // Output: 5
    }
}