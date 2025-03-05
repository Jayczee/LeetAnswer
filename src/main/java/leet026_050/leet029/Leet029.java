package leet026_050.leet029;

/**
 * Author: Jayczee
 * Date: 2024/10/21
 */
public class Leet029 {
    public int divide(int dividend, int divisor) {
        boolean flag = dividend > 0 && divisor > 0 || dividend < 0 && divisor < 0;
        long dividendAbs = Math.abs((long) dividend);
        long divisorAbs = Math.abs((long) divisor);
        long res = 0;
        while (dividendAbs > 0) {
            if (dividendAbs >= divisorAbs) {
                res++;
            }
            dividendAbs -= divisorAbs;
        }
        res = flag ? res : -res;
        if (res > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (res < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) res;
    }
}
