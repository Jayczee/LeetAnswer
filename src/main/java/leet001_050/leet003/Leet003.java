package leet001_050.leet003;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Jayczee
 * Date: 2024/8/27
 */
public class Leet003 {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0, left = 0, right = 0;
        Set<Character> set = new HashSet<>();
        while(right < s.length()){
            char cur = s.charAt(right);
            if (set.contains(cur)){
                set.remove(s.charAt(left));
                left++;
            }else{
                set.add(cur);
                right++;
            }
            ans = Math.max(ans, right-left);
        }
        return ans;
    }
}
