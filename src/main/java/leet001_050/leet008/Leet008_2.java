package leet001_050.leet008;

/**
 * Author: Jayczee
 * Date: 2024/9/2
 */
public class Leet008_2 {
    public int myAtoi(String s) {
        long res = 0;
        String currentState = "start";
        boolean negative = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            currentState = getState(currentState, c);
            switch (currentState) {
                case "start" -> {
                }
                case "number" -> {
                    res = res * 10 + Integer.parseInt(String.valueOf(c));
                    if (negative && res * -1 < Integer.MIN_VALUE) {
                        return Integer.MIN_VALUE;
                    } else if (!negative && res > Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                }
                case "signed" -> {
                    negative = c == '-';
                }
                case "end" -> {
                    return (int) res * (negative ? -1 : 1);
                }
            }
        }
        return (int) res * (negative ? -1 : 1);
    }

    private String getState(String currentStart, char c) {
        switch (currentStart) {
            case "start" -> {
                if (c == ' ') {
                    return "start";
                } else if (c >= '0' && c <= '9') {
                    return "number";
                } else if (c == '+' || c == '-') {
                    return "signed";
                } else {
                    return "end";
                }
            }
            case "number", "signed" -> {
                if (c >= '0' && c <= '9') {
                    return "number";
                } else {
                    return "end";
                }
            }
        }
        return "";
    }
}
