package leet101_150.leet122;

/**
 * Author: Jayczee
 * Date: 2025/3/4
 */
public class Leet122_2 {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            int res = prices[i] - prices[i - 1];
            if (res > 0) {
                sum += res;
            }
        }
        return sum;
    }
}
