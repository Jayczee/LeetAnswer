package leet001_050.leet009;


/**
 * Author: Jayczee
 * Date: 2024/9/4
 */
public class Leet009_2 {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        else if (x < 10) return true;
        else if (x % 10 == 0) return false;
        int x2 = 0;
        while (x > x2) {
            x2 = x2 * 10 + x % 10;
            if (x == x2) return true;
            x = x / 10;
        }
        return x == x2;
    }
}
