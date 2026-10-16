package leet101_150.leet122;

/**
 * Author: Jayczee
 * Date: 2025/3/4
 */
public class Leet122 {
    public int maxProfit(int[] prices) {
        // 1 2 3 4 5
        // 3 1 2 4 5
        if (prices.length == 1) return 0;
        int slow = 0, fast = 1, totalProfit = 0;
        while (fast < prices.length) {
            if (prices[fast] >= prices[slow]) {
                totalProfit += prices[fast] - prices[slow];
            }
            slow = fast;
            fast++;
        }
        return totalProfit;
    }
}
