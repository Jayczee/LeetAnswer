package leet001_050.leet009;

import java.util.Objects;

/**
 * Author: Jayczee
 * Date: 2024/9/4
 */
public class Leet009 {
    public boolean isPalindrome(int x) {
        return x >= 0 && Objects.equals(String.valueOf(x), new StringBuilder(String.valueOf(x)).reverse().toString());
    }
}
