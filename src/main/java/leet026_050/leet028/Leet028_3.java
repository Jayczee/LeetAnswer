package leet026_050.leet028;

/**
 * Author: Jayczee
 * Date: 2025/5/23
 */
public class Leet028_3 {

    public int strStr(String haystack, String needle) {
        int[] next = buildNextArr(needle);

        int i = 0, j = 0;

        while (i < haystack.length() && j < needle.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else if (j == 0) {
                i++;
            } else {
                j = next[j - 1];
            }
        }

        if (j == needle.length()) {
            return i - j;
        } else {
            return -1;
        }
    }

    private int[] buildNextArr(String pattern) {
        int len = pattern.length();
        int[] next = new int[len];
        next[0] = 0;
        for (int i = 1, j = 0; i < len; i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = next[j - 1];
            }
            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}
