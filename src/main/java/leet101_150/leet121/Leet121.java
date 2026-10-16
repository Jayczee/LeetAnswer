package leet101_150.leet121;

/**
 * Author: Jayczee
 * Date: 2025/2/28
 */
public class Leet121 {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;
        int maxProfit = 0;
        int[] minPrice = new int[prices.length];
        minPrice[0] = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int curProfit = prices[i] - minPrice[i - 1];
            maxProfit = Math.max(maxProfit, curProfit);
            minPrice[i] = Math.min(minPrice[i - 1], prices[i]);
        }
        return maxProfit;
    }
}
