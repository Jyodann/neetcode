class Solution {
    public int maxProfit(int[] prices) {
        // use of two pointers
        // init left pointer as 0, 
        // right pointer has 1

        // set max profit as 0

        int l = 0; 
        int r = 1;

        int max = 0;

        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                max = Math.max(profit, max);
            } else {
                l = r;
            }

            r++;
        }

        return max;
    }
}
