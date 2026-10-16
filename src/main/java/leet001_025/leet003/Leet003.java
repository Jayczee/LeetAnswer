package leet001_025.leet003;

/**
 * Author: Jayczee
 * Date: 2024/8/27
 */
public class Leet003 {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        int maxLen = 0, i = 0, j = 0;
        int[] arr = new int[128];
        for (j = 0; j < s.length(); j++) {
            arr[s.charAt(j)]++;
            while (i <= j && arr[s.charAt(j)] > 1) {
                i++;
                arr[s.charAt(i - 1)]--;
            }

            maxLen = Math.max(j - i + 1, maxLen);
        }

        return maxLen;
    }
}
