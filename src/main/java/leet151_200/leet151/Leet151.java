package leet151_200.leet151;

/**
 * Author: Jayczee
 * Date: 2025/5/22
 */
public class Leet151 {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        int start = -1, len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ' && start == -1) {
                start = i;
                len++;
            } else if (s.charAt(i) != ' ' && start != -1) {
                len++;

            } else if (s.charAt(i) == ' ' && start != -1) {
                sb.append(s, start - len + 1, start + 1);
                start = -1;
                len = 0;
                if (i != 0) {
                    sb.append(" ");
                }
            }
        }
        if (start != -1) {
            sb.append(s, start - len + 1, start + 1);
        }
        return sb.toString();
    }
}
