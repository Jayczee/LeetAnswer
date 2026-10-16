package leet351_400.leet392;

public class Leet392_2 {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        if (t.isEmpty()) {
            return false;
        }
        if (s.length() > t.length()) {
            return false;
        }

        int[][] dp = new int[t.length()][26];

        char lastTChar = t.charAt(t.length() - 1);
        for (int i = 0; i < 26; i++) {
            if ((char) (97 + i) == lastTChar) {
                dp[t.length() - 1][i] = t.length() - 1;
            } else {
                dp[t.length() - 1][i] = -1;
            }
        }

        for (int i = t.length() - 2; i >= 0; i--) {
            char tChar = t.charAt(i);
            for (int j = 0; j < 26; j++) {
                if ((char) (97 + j) == tChar) {
                    dp[i][j] = i;
                } else {
                    dp[i][j] = dp[i + 1][j];
                }
            }
        }

        int tPos = 0;
        for (int i = 0; i < s.length(); i++) {
            if (tPos >= t.length()) {
                return false;
            }
            int cCur = s.charAt(i) - 97;
            int nextPos = dp[tPos][cCur];
            if (nextPos == -1) {
                return false;
            }
            tPos = nextPos + 1;
        }

        return true;
    }
}
