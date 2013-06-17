public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (prices.length == 0) {
            return 0;
        }
        int[] localMaxs = new int[prices.length];
        localMaxs[prices.length - 1] = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; --i) {
            if (prices[i] > localMaxs[i + 1])
                localMaxs[i] = prices[i];
            else
                localMaxs[i] = localMaxs[i + 1];
        }
        int max = 0;
        for (int i = 0; i < prices.length - 1; ++i) {
            if (localMaxs[i + 1] - prices[i] > max)
                max = localMaxs[i + 1] - prices[i];
        }
        return max;
    }
}