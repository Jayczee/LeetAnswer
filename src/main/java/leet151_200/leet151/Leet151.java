package leet151_200.leet151;

/**
 * Author: Jayczee
 * Date: 2025/5/22
 */
public class Leet151 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s.trim());
        if (sb.indexOf(" ") == -1) {
            return sb.toString();
        }
        sb.reverse();
        int start = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                while (sb.charAt(i + 1) == ' ') {
                    sb.deleteCharAt(i + 1);
                }
                reverse(sb, start, i - 1);
                start = i + 1;
            }
        }
        if (start < sb.length() - 1) {
            reverse(sb, start, sb.length() - 1);
        }

        return sb.toString();
    }

    public void reverse(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }
}
