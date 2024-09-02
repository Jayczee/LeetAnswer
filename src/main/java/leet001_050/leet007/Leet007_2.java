package leet001_050.leet007;

/**
 * Author: Jayczee
 * Date: 2024/8/30
 */
public class Leet007_2 {
    public int reverse(int x) {
        int res = 0;
        int borderVal = Integer.MAX_VALUE / 10;
        ;
        while (x != 0) {
            int tmp = x % 10;
            if (res > borderVal || res == borderVal && tmp > 7) {
                return 0;
            } else if (res < -borderVal || res == -borderVal && tmp < -8) {
                return 0;
            }
            res = res * 10 + tmp;
            x /= 10;
        }
        return res;
    }
}
