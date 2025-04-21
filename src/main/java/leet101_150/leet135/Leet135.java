package leet101_150.leet135;

/**
 * Author: Jayczee
 * Date: 2025/3/14
 */
public class Leet135 {
    public int candy(int[] ratings) {
        int[] left = new int[ratings.length];
        for (int i = 0; i < ratings.length; i++) {
            if (i > 0 && ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }
        }
        int right = 0, sum = 0;
        for (int i = ratings.length - 1; i >= 0; i--) {
            if (i < ratings.length - 1 && ratings[i] > ratings[i + 1]) {
                right++;
            } else {
                right = 1;
            }
            sum += Math.max(left[i], right);
        }
        return sum;
    }
}
