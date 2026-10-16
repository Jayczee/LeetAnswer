package leet001_025.leet013;

import java.util.Map;

/**
 * Author: Jayczee
 * Date: 2024/9/9
 */
public class Leet013 {
    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'I' -> {
                    if (i < s.length() - 1) {
                        char nextChar = s.charAt(i + 1);
                        if (nextChar == 'V' || nextChar == 'X') {
                            sum += map.get(nextChar) - 1;
                            i++;
                        } else {
                            sum += 1;
                        }
                    } else {
                        sum += 1;
                    }
                }
                case 'X' -> {
                    if (i < s.length() - 1) {
                        char nextChar = s.charAt(i + 1);
                        if (nextChar == 'L' || nextChar == 'C') {
                            sum += map.get(nextChar) - 10;
                            i++;
                        } else {
                            sum += 10;
                        }
                    } else {
                        sum += 10;
                    }
                }
                case 'C' -> {
                    if (i < s.length() - 1) {
                        char nextChar = s.charAt(i + 1);
                        if (nextChar == 'D' || nextChar == 'M') {
                            sum += map.get(nextChar) - 100;
                            i++;
                        } else {
                            sum += 100;
                        }
                    } else {
                        sum += 100;
                    }
                }
                default -> sum += map.get(c);
            }
        }
        return sum;
    }
}
