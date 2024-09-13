package leet001_050.leet013;

import java.util.Map;

/**
 * Author: Jayczee
 * Date: 2024/9/9
 */
public class Leet013 {
    public int romanToInt(String s) {
        final Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int cVal = map.get(c);
            if (i + 1 < s.length()) {
                char nextC = s.charAt(i + 1);
                if (map.get(nextC) > cVal) {
                    res -= cVal;
                } else {
                    res += cVal;
                }
            } else {
                res += cVal;
            }
        }
        return res;
    }
}
