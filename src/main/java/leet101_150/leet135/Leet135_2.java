package leet101_150.leet135;

/**
 * Author: Jayczee
 * Date: 2025/4/29
 */
public class Leet135_2 {
    public int candy(int[] ratings) {
        int cur = 1, pre = 1, incLen = 1, decLen = 0, sum = 1;
        while (cur < ratings.length) {
            if (ratings[cur] >= ratings[cur - 1]) {
                pre = ratings[cur] == ratings[cur - 1] ? 1 : pre + 1;
                sum += pre;
                incLen = pre;
                decLen = 0;
            } else if (ratings[cur] < ratings[cur - 1]) {
                pre = 1;
                decLen++;
                if (decLen == incLen) {
                    decLen++;
                }
                sum += decLen;
            }
            cur++;
        }
        return sum;
    }
}
