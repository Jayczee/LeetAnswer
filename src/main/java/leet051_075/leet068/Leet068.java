package leet051_075.leet068;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Jayczee
 * Date: 2025/5/23
 */
public class Leet068 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();

        List<String> temp = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            if (sb.length() + s.length() + (sb.isEmpty() ? 0 : 1) <= maxWidth) {
                sb.append(sb.isEmpty() ? s : " " + s);
                temp.add(s);

                if (i == words.length - 1) {
                    int restBlank = maxWidth - sb.length();
                    sb.append(" ".repeat(restBlank));
                    ans.add(sb.toString());
                }
            } else {
                if (temp.size() == 1) {
                    int restBlank = maxWidth - temp.getFirst().length();
                    sb.append(" ".repeat(Math.max(0, restBlank)));
                    ans.add(sb.toString());
                } else if (i - 1 == words.length - 1) {
                    int totalLen = 0;
                    for (String str : temp) {
                        totalLen += str.length();
                    }
                    int restBlank = maxWidth - totalLen - (temp.size() - 1);
                    sb.append(" ".repeat(Math.max(0, restBlank)));
                    ans.add(sb.toString());
                } else {
                    int totalLen = 0;
                    for (String str : temp) {
                        totalLen += str.length();
                    }
                    int restBlank = maxWidth - totalLen;
                    int gap = temp.size() - 1;
                    int avgBlank = restBlank / gap;
                    int modBlank = restBlank % gap;

                    sb.setLength(0);
                    for (String str : temp) {

                        if (sb.isEmpty()) {
                            sb.append(str);
                        } else {
                            int blankCount = avgBlank + (modBlank > 0 ? 1 : 0);
                            sb.append(" ".repeat(blankCount)).append(str);
                            modBlank--;
                        }
                    }
                    ans.add(sb.toString());
                }
                sb.setLength(0);
                temp.clear();
                i--;
            }
        }
        return ans;
    }
}
