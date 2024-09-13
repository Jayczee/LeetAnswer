package leet001_050.leet014;

/**
 * Author: Jayczee
 * Date: 2024/9/12
 */
public class Leet014 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();
        int charIndex = 0;
        while (true) {
            boolean flag = true;
            for (int i = 1; i < strs.length; i++) {
                if (!(charIndex < strs[i].length() && charIndex < strs[0].length() && strs[i].charAt(charIndex) == strs[0].charAt(charIndex))) {
                    flag = false;
                }
            }
            if (flag) {
                sb.append(strs[0].charAt(charIndex));
            } else {
                break;
            }
            charIndex++;
        }
        return sb.toString();
    }
}
