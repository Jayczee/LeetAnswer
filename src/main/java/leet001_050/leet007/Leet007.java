package leet001_050.leet007;

/**
 * Author: Jayczee
 * Date: 2024/8/30
 */
public class Leet007 {
    public int reverse(int x) {
        String xStr = String.valueOf(x);
        boolean negative = xStr.startsWith("-");
        String valStr = negative ? new StringBuilder(xStr.substring(1)).reverse().toString() : new StringBuilder(xStr).reverse().toString();
        String boarderValStr = negative ? String.valueOf(Integer.MAX_VALUE) : String.valueOf(Integer.MIN_VALUE).substring(1);
        if (valStr.length() >= boarderValStr.length() && valStr.compareTo(boarderValStr) > 0) {
            return 0;
        } else {
            return (negative ? -1 : 1) * Integer.parseInt(valStr);
        }
    }
}
