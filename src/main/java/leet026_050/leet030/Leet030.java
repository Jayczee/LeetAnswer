package leet026_050.leet030;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: Jayczee
 * Date: 2025/5/27
 */
public class Leet030 {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();

        int wordLen = words[0].length(), totalLen = wordLen * words.length;

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            int count = map.getOrDefault(word, 0);
            map.put(word, count + 1);
        }

        for (int i = 0; i < wordLen; i++) {
            Map<String, Integer> windowMap = new HashMap<>();
            int left = i, right = i;
            while (right + wordLen <= s.length()) {
                String word = s.substring(right, right + wordLen);
                if (map.containsKey(word)) {
                    windowMap.put(word, windowMap.getOrDefault(word, 0) + 1);
                    while (windowMap.get(word) > map.getOrDefault(word, 0)) {
                        removeWord(windowMap, s, left, wordLen);
                        left += wordLen;
                    }
                    right += wordLen;
                    if (right - left == totalLen) {
                        ans.add(left);
                        removeWord(windowMap, s, left, wordLen);
                        left += wordLen;
                    }
                } else {
                    windowMap.clear();
                    right += wordLen;
                    left = right;
                }
            }
        }

        return ans;
    }

    public void removeWord(Map<String, Integer> map, String s, int start, int wordLen) {
        String word = s.substring(start, start + wordLen);
        map.put(word, Math.max(map.getOrDefault(word, 0) - 1, 0));
    }
}
