package leet001_025.leet022;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Jayczee
 * Date: 2024/10/18
 */
public class Leet022 {
    public List<String> generateParenthesis(int n) {
        String[] arr = new String[]{"(", ")"};
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < n * 2; i++) {
            List<String> tempList = new ArrayList<>();
            if (i == 0) {
                tempList.add("(");
            } else {
                for (int j = 0; j < ans.size(); j++) {
                    final String validStr = ans.get(j);
                    for (String s : arr) {
                        String temp = validStr + s;
                        if (isValid(temp, n)) {
                            tempList.add(temp);
                        }
                    }
                }
            }
            ans = tempList;
        }
        return ans;
    }

    public boolean isValid(String s, int n) {
        int val = 0;
        int left = 0;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == '(') {
                val++;
                left++;
            } else {
                val--;
            }
            if (val < 0) return false;
            if (left > n) return false;
        }
        return true;
    }
}
