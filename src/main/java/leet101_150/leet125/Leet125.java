package leet101_150.leet125;

/**
 * Author: Jayczee
 * Date: 2025/5/26
 */
public class Leet125 {
    public boolean isPalindrome(String s) {
        int left = -1, right = s.length();
        s = s.toLowerCase();
        while (left < right) {
            do {
                left++;
            } while (left < right && !isLetterOrNumber(s.charAt(left)));

            do {
                right--;
            } while (left < right && !isLetterOrNumber(s.charAt(right)));
            if (left < right && s.charAt(left) != s.charAt(right)) {
                return false;
            }
        }

        return true;
    }

    public boolean isLetterOrNumber(char a) {
        return a >= 'a' && a <= 'z' || a >= '0' && a <= '9';
    }
}
