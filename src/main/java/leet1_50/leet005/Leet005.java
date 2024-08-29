package leet1_50.leet005;

/**
 * Author: Jayczee
 * Date: 2024/8/29
 */
public class Leet005 {
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
        }
        String maxStr = String.valueOf(s.charAt(0));
        int maxSize = 1;
        for (int len = 2; len <= s.length(); len++) {
            for (int i = 0; i < s.length() - len + 1; i++) {
                int j = i + len - 1;

                if (s.charAt(i) != s.charAt(j)) {
                    dp[i][j] = false;
                } else {
                    if (len < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if (dp[i][j]) {
                    if (len > maxSize) {
                        maxStr = s.substring(i, j + 1);
                    }
                }
            }
        }
        return maxStr;
    }
}
