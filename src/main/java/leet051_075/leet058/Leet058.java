package leet051_075.leet058;

/**
 * Author: Jayczee
 * Date: 2025/5/22
 */
public class Leet058 {
    public int lengthOfLastWord(String s) {
        int start = -1, index = s.length() - 1;
        while (index >= 0) {
            if (start == -1 && s.charAt(index) != ' ') {
                start = index;
            } else if (start != -1 && s.charAt(index) == ' ') {
                return start - index;
            }
            index--;
        }
        if (start != -1) {
            return start + 1;
        } else {
            return 1;
        }
    }
}
