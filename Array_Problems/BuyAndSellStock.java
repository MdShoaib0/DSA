class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            }
            profit = Math.max(profit, (prices[i] - buyPrice));
        }

        return profit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit for prices1: " + solution.maxProfit(prices1)); // Expected: 5

        // Test case 2
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Max Profit for prices2: " + solution.maxProfit(prices2)); // Expected: 0

        // Test case 3
        int[] prices3 = {2, 4, 1};
        System.out.println("Max Profit for prices3: " + solution.maxProfit(prices3)); // Expected: 2

        // Test case 4
        int[] prices4 = {3, 2, 6, 5, 0, 3};
        System.out.println("Max Profit for prices4: " + solution.maxProfit(prices4)); // Expected: 4
    }
}