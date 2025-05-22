package leet051_075.leet058;

/**
 * Author: Jayczee
 * Date: 2025/5/22
 */
public class Leet058 {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        boolean flag = false;
        int res = 0;
        for (int i = len - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (!flag && c != ' ') {
                flag = true;
                res = 1;
            } else if (flag && c != ' ') {
                res++;
            } else if (flag) {
                return res;
            }
        }
        return res;
    }
}
