class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int minBuy = prices[0];
        for (int sell : prices) {
            if ((sell - minBuy) > maxP)
                maxP = sell - minBuy;
            if (sell < minBuy)
                minBuy = sell;
        }
        return maxP;
    }
}
