package leet026_050.leet030;

import java.util.*;

/**
 * Author: Jayczee
 * Date: 2025/5/27
 */
public class Leet030 {
    public List<Integer> findSubstring(String s, String[] words) {
        int wordLen = words[0].length();
        int groupLen = wordLen * words.length;
        if (s.length() < groupLen) {
            return Collections.emptyList();
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < wordLen; i++) {
            Map<String, Integer> map = new HashMap<>();
            for (String word : words) {
                int val = map.getOrDefault(word, 0);
                map.put(word, val - 1);
            }
            int left = i, r = left + groupLen - 1;
            while (r < s.length()) {
                String subStr = s.substring(left, r + 1);
                if (left == i) {
                    for (int j = 0; j < subStr.length(); j += wordLen) {
                        String word = subStr.substring(j, j + wordLen);
                        if (map.containsKey(word)) {
                            map.put(word, map.get(word) + 1);
                        }
                    }
                } else {
                    String formerWord = s.substring(left - wordLen, left);
                    String newWord = s.substring(left + groupLen - wordLen, left + groupLen);
                    if (map.containsKey(formerWord)) {
                        map.put(formerWord, map.get(formerWord) - 1);
                    }
                    if (map.containsKey(newWord)) {
                        map.put(newWord, map.get(newWord) + 1);
                    }
                }
                if (map.values().stream().allMatch(v -> v == 0)) {
                    ans.add(left);
                }
                left += wordLen;
                r = left + groupLen - 1;
            }
        }
        return ans;
    }
}
