package leet001_025.leet014;

import java.util.Arrays;
import java.util.List;

/**
 * Author: Jayczee
 * Date: 2024/9/12
 */
public class Leet014 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        List<String> list = Arrays.stream(strs).sorted().toList();
        String s1 = list.getFirst();
        String s2 = list.getLast();

        for (int i = 0; i < s1.length(); i++) {
            String subStr1 = s1.substring(0, i + 1);
            if (!s2.startsWith(subStr1)) {
                return s1.substring(0, i);
            }
        }
        return s1;
    }
}
