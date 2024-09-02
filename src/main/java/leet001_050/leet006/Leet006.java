package leet001_050.leet006;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Jayczee
 * Date: 2024/8/29
 */
public class Leet006 {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        final List<StringBuilder> sbList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            sbList.add(new StringBuilder());
        }
        int flag = 1;
        int currentRow = 0;
        for (int i = 0; i < s.length(); i++) {
            sbList.get(currentRow).append(s.charAt(i));
            if (currentRow == 0) {
                flag = 1;
            } else if (currentRow == numRows - 1) {
                flag = -1;
            }
            currentRow += flag;
        }
        StringBuilder totalBuilder = new StringBuilder();
        for (StringBuilder sb : sbList) {
            totalBuilder.append(sb);
        }
        return totalBuilder.toString();
    }
}
