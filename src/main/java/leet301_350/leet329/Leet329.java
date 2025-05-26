package leet301_350.leet329;

/**
 * Author: Jayczee
 * Date: 2025/5/26
 */
public class Leet329 {
    public boolean isSubsequence(String s, String t) {
        int[][] arr = new int[t.length() + 1][26];

        for (int i = 0; i < 26; i++) {
            arr[t.length()][i] = -1;
        }
        for (int i = t.length() - 1; i >= 0; i--) {
            int charIndex = t.charAt(i) - 97;
            arr[i][charIndex] = i;
            for (int j = 0; j < 26; j++) {
                if (charIndex == j) {
                    arr[i][j] = i;
                } else {
                    arr[i][j] = arr[i + 1][j];
                }
            }
        }

        int currentPos = 0;
        for (int i = 0; i < s.length(); i++) {
            int charIndex = s.charAt(i) - 97;
            int nextPos = arr[currentPos][charIndex];
            if (nextPos == -1) {
                return false;
            } else {
                currentPos = nextPos + 1;
            }
        }

        return true;
    }
}
