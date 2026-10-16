package leet351_400.leet392;

public class Leet392 {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        int p1 = 0, p2 = 0;
        while (p1 < s.length() && p2 < t.length()) {
            char sCur = s.charAt(p1);
            char tCur = t.charAt(p2);
            if (sCur == tCur) {
                p1++;
                p2++;
            } else {
                p2++;
            }
        }
        return p1 >= s.length();
    }
}
