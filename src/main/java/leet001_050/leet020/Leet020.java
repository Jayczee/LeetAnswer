package leet001_050.leet020;

import java.util.List;
import java.util.Stack;

/**
 * Author: Jayczee
 * Date: 2024/10/17
 */
public class Leet020 {
    public boolean isValid(String s) {
        if (s.length() < 2) return false;
        List<Character> left = List.of('(', '{', '[');
        List<Character> right = List.of(')', '}', ']');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (left.contains(c)) {
                stack.push(c);
            } else if (right.contains(c)) {
                if (stack.isEmpty()) {
                    return false;
                }
                char leftChar = stack.pop();
                if (!valid(leftChar, c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean valid(char a, char b) {
        return a == '(' && b == ')' || a == '[' && b == ']' || a == '{' && b == '}';
    }
}
