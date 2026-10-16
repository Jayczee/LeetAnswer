package leet001_025.leet006;

/**
 * Author: Jayczee
 * Date: 2024/8/29
 */
public class Leet006 {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            int pos = i;
            boolean direct = false;
            while (pos < s.length()) {
                if (i == 0) {
                    direct = true;
                } else if (i == numRows - 1) {
                    direct = false;
                } else {
                    direct = !direct;
                }
                sb.append(s.charAt(pos));
                int step = countStep(numRows, i, direct);
                pos += step;
            }
        }
        return sb.toString();
    }

    public int countStep(int numRows, int rowNum, Boolean direct) {
        return direct ? (numRows - rowNum - 1) * 2 : (rowNum + 1 - 1) * 2;
    }
}
