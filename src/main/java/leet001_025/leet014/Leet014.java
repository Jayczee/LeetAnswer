package leet001_025.leet014;

/**
 * Author: Jayczee
 * Date: 2024/9/12
 */
public class Leet014 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        String s0 = strs[0];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s0.length(); i++) {
            Character c = s0.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                String tmpS = strs[j];
                if (i >= tmpS.length() || c != tmpS.charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
