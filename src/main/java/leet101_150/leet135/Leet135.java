package leet101_150.leet135;

/**
 * Author: Jayczee
 * Date: 2025/3/14
 */
public class Leet135 {
    public int candy(int[] ratings) {
        int i = 0, sum = 0, pre = 0, inc = 0, dec = 0;
        while (i < ratings.length) {
            if (i == 0) {
                pre = 1;
                sum += pre;
                inc = 1;
                dec = 0;
            } else if (ratings[i] >= ratings[i - 1]) {
                pre = ratings[i] > ratings[i - 1] ? pre + 1 : 1;
                sum += pre;
                inc = pre;
                dec = 0;
            } else {
                dec++;
                if (dec == inc) {
                    dec++;
                }
                sum += dec;
                pre = 1;
            }
            i++;
        }
        return sum;
    }
}
