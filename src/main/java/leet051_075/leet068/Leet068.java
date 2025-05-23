package leet051_075.leet068;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Jayczee
 * Date: 2025/5/23
 */
public class Leet068 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < words.length) {
            String word = words[i];
            if (sb.isEmpty()) {
                if (maxWidth >= word.length()) {
                    sb.append(word);
                    i++;
                }
            } else {
                if (maxWidth >= sb.length() + word.length() + 1) {
                    sb.append(" ").append(word);
                    i++;
                } else {
                    res.add(sb.toString());
                    sb = new StringBuilder();
                }
            }
            if (i >= words.length) {
                res.add(sb.toString());
            }
        }
        for (int j = 0; j < res.size(); j++) {
            String s = res.get(j);
            if (j == res.size() - 1 && s.length() < maxWidth) {
                res.set(j, s + " ".repeat(maxWidth - s.length()));
            } else if (j < res.size() - 1) {
                if (s.length() < maxWidth) {
                    res.set(j, adjustSpaces(s, maxWidth));
                }
            }
        }
        return res;
    }

    public String adjustSpaces(String s, int maxWidth) {
        String[] words = s.split(" ");
        int wordCount = words.length;

        if (wordCount == 1) {
            StringBuilder single = new StringBuilder(words[0]);
            while (single.length() < maxWidth) {
                single.append(' ');
            }
            return single.toString();
        }

        int sumWordLengths = 0;
        for (String w : words) {
            sumWordLengths += w.length();
        }

        int totalSpaces = maxWidth - sumWordLengths;
        int gaps = wordCount - 1;

        int extraPerGap = totalSpaces / gaps;
        int remainder = totalSpaces % gaps;

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < gaps; i++) {
            result.append(words[i]);
            int spacesToAdd = extraPerGap;
            if (i < remainder) {
                spacesToAdd++;
            }
            for (int k = 0; k < spacesToAdd; k++) {
                result.append(' ');
            }
        }
        result.append(words[gaps]);

        return result.toString();
    }
}
