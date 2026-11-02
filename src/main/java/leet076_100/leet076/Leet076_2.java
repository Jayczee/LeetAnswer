package leet076_100.leet076;

import java.util.HashMap;
import java.util.Map;

public class Leet076_2 {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        String ans = "";

        int left = 0, right = 0;
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        while (right < s.length()) {

            char sRight = s.charAt(right);
            if (tMap.containsKey(sRight)) {
                int tCharCount = tMap.getOrDefault(sRight, 0);
                tMap.put(sRight, tCharCount - 1);
            }
            right++;

            while (left < right && right - left >= t.length() && tMap.values().stream().allMatch(v -> v <= 0)) {
                if (right - left < (ans.isEmpty() ? Integer.MAX_VALUE : ans.length())) {
                    ans = s.substring(left, right);
                }
                char sLeft = s.charAt(left);
                if (tMap.containsKey(sLeft)) {
                    tMap.put(sLeft, tMap.get(sLeft) + 1);
                }
                left++;
            }
        }

        return ans;
    }
}
