package leet1_50.leet005;

/**
 * Author: Jayczee
 * Date: 2024/8/29
 */
public class Leet005_2 {
    public String longestPalindrome(String s) {
        int startIndex = 0;
        int endIndex = 0;
        int maxLen = 1;
        for (int i = 0; i < s.length(); i++) {
            int len1 = findLen(s, i, i);
            int len2 = findLen(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > maxLen) {
                maxLen = len;
                startIndex = i - (len - 1) / 2;
                endIndex = i + len / 2;
            }
        }
        return s.substring(startIndex, endIndex + 1);
    }

    private int findLen(String s, int leftIndex, int rightIndex) {
        while (leftIndex >= 0 && rightIndex < s.length() && s.charAt(leftIndex) == s.charAt(rightIndex)) {
            leftIndex--;
            rightIndex++;
        }
        return rightIndex - leftIndex - 1;
    }
}
