package leet101_150.leet122;

/**
 * Author: Jayczee
 * Date: 2025/3/4
 */
public class Leet122_2 {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;
        int[][] dp = new int[prices.length][2];

        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][0] - prices[i], dp[i - 1][1]);
            maxProfit = Math.max(maxProfit, Math.max(dp[i][0], dp[i][1]));
        }

        return maxProfit;
    }
}
