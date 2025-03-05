package leet001_025.leet022;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Jayczee
 * Date: 2024/10/18
 */
public class Leet022_2 {
    List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        dfs("", n, n);
        return ans;
    }

    private void dfs(String temp, int left, int right) {
        if (left == 0 && right == 0) {
            ans.add(temp);
            return;
        }
        if (left > 0) {
            dfs(temp + "(", left - 1, right);
        }
        if (left < right) {
            dfs(temp + ")", left, right - 1);
        }
    }
}
