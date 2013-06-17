public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (prices.length < 2) {
            return 0;
        }
        int max = 0, cur = 0;
        for (int i = 0; i < prices.length; ++i) {
            cur = maxProfitOne(prices, 0, i + 1) + maxProfitOne(prices, i + 1, prices.length);
            if (cur > max)
                max = cur;
        }
        return max;
    }
    
    public int maxProfitOne(int[] prices, int begin, int end) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (end - begin < 2) {
            return 0;
        }
        int length = end - begin;
        int[] localMaxs = new int[length];
        localMaxs[length - 1] = prices[begin + length - 1];
        for (int i = length - 2; i >= 0; --i) {
            if (prices[begin + i] > localMaxs[i + 1])
                localMaxs[i] = prices[begin + i];
            else
                localMaxs[i] = localMaxs[i + 1];
        }
        int max = 0;
        for (int i = 0; i < length - 1; ++i) {
            if (localMaxs[i + 1] - prices[begin + i] > max)
                max = localMaxs[i + 1] - prices[begin + i];
        }
        return max;
    }
}