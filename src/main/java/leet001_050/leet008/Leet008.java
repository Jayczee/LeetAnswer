package leet001_050.leet008;

/**
 * Author: Jayczee
 * Date: 2024/8/30
 */
public class Leet008 {
    public int myAtoi(String s) {
        String newStr = s.replaceFirst("^\\s+", "");
        int res = 0;
        int borderVal = Integer.MAX_VALUE / 10;
        boolean negative = false;
        for (int i = 0; i < newStr.length(); i++) {
            int tmp;
            char c = newStr.charAt(i);
            if (i == 0) {
                if (c == '-') {
                    negative = true;
                    continue;
                } else if (c == '+') {
                    continue;
                } else if (c >= '0' && c <= '9') {
                    tmp = Integer.parseInt(String.valueOf(c));
                } else {
                    return 0;
                }
            } else {
                if (c >= '0' && c <= '9') {
                    tmp = Integer.parseInt(String.valueOf(c)) * (negative ? -1 : 1);
                } else {
                    return res;
                }
            }
            if (res > borderVal || res == borderVal && tmp > 7) {
                return Integer.MAX_VALUE;
            } else if (res < -borderVal || res == -borderVal && tmp < -8) {
                return Integer.MIN_VALUE;
            }
            res = res * 10 + tmp;
        }
        return res;
    }
}
