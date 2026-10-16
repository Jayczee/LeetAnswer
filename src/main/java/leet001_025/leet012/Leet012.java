package leet001_025.leet012;

/**
 * Author: Jayczee
 * Date: 2024/9/9
 */
public class Leet012 {
    public String intToRoman(int num) { // num <= 3999
        int[] arr = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strArr = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (num > 0) {
            int cur = arr[index];
            if (num >= cur) {
                num -= cur;
                sb.append(strArr[index]);
            } else {
                index++;
            }
        }
        return sb.toString();
    }
}
