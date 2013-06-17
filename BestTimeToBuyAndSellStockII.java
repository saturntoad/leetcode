public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (prices.length < 2)
            return 0;
        int profit = 0;
        int curBuy = prices[0];
        boolean bought = false;
        for (int i = 1; i < prices.length; ++i) {
            if (prices[i] > prices[i - 1]) {
                bought = true;
                continue;
            }
            //prices[i] <= prices[i - 1]
            if (bought == true) {
                profit += prices[i - 1] - curBuy;
                bought = false;
            }
            curBuy = prices[i];
        }
        if (bought == true)
            profit += prices[prices.length - 1] - curBuy;
        return profit;
        
    }
}