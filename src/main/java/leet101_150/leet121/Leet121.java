package leet101_150.leet121;

/**
 * Author: Jayczee
 * Date: 2025/2/28
 */
public class Leet121 {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        int min = prices[0];
        int max = 0;
        for (int price : prices) {
            if (min > price) {
                min = price;
            }
            max = Math.max(price - min, max);

        }
        return max;
    }
}
