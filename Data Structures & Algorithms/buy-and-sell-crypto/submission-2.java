class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxP = 0;
        for (; right < prices.length; right++) {
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                if (profit > maxP)
                    maxP = profit;
            } else {
                left = right;
            }
        }
        return maxP;
    }
}
