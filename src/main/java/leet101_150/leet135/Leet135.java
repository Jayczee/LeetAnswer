package leet101_150.leet135;

import java.util.Arrays;

/**
 * Author: Jayczee
 * Date: 2025/3/14
 */
public class Leet135 {
    public int candy(int[] ratings) {
        int[] left = new int[ratings.length];
        Arrays.fill(left, 1);
        int ans = 0;
        for (int i = 0; i < ratings.length; i++) {
            if (i == 0) {
                left[i] = 1;
            } else if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }
        }
        int cur = 0;
        for (int i = ratings.length - 1; i >= 0; i--) {
            if (i < ratings.length - 1 && ratings[i] > ratings[i + 1]) {
                cur++;
            } else {
                cur = 1;
            }
            ans += Math.max(left[i], cur);

        }
        return ans;
    }
}
