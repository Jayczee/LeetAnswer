package leet001_050.leet017;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Author: Jayczee
 * Date: 2024/9/13
 */
public class Leet017 {
    String[] numberStrArr = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return Collections.emptyList();
        Set<String> ans = new HashSet<>();
        backtrack(ans, digits, 0, new StringBuilder());
        return ans.stream().toList();
    }

    private void backtrack(Set<String> ans, String digits, int index, StringBuilder sb) {
        if (index == digits.length()) {
            ans.add(sb.toString());
        } else {
            String val = numberStrArr[Integer.parseInt(String.valueOf(digits.charAt(index)))];
            for (int i = 0; i < val.length(); i++) {
                sb.append(val.charAt(i));
                backtrack(ans, digits, index + 1, sb);
                sb.deleteCharAt(index);
            }
        }
    }
}
