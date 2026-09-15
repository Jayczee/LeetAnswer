package leet001_025.leet003;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Jayczee
 * Date: 2024/8/27
 */
public class Leet003 {
    public int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList<>();
        int l = 0, r = 0, ans = 0;
        while (l <= r && r < s.length()) {
            if (l == r) {
                list.add(s.charAt(l));
                ans = Math.max(ans, list.size());
                r++;
            }else{
                Character c = s.charAt(r);
                if (list.contains(c)) {
                    list.removeFirst();
                    l++;
                } else {
                    list.add(s.charAt(r));
                    ans = Math.max(ans, list.size());
                    r++;
                }
            }

        }
        return ans;
    }
}
