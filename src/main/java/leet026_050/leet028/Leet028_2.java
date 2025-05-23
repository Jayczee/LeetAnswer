package leet026_050.leet028;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Jayczee
 * Date: 2024/10/21
 */
public class Leet028_2 {
    public int strStr(String haystack, String needle) {
//        aacaab
//        aab a:2 - 1 + 1 b:1 - 1 + 1
        int scanIndex = 0, hayStackIndex = 0, needleIndex = 0, hayLen = haystack.length(), needleLen = needle.length();
        Map<Character, Integer> offsetMap = new HashMap<>();
        for (int i = 0; i < needleLen; i++) {
            offsetMap.put(needle.charAt(i), needle.length() - i);
        }
        while (scanIndex + needleLen <= hayLen) {
            hayStackIndex = scanIndex;
            needleIndex = 0;
            // 字符匹配时，两个指针持续向后移动
            while (hayStackIndex < hayLen && needleIndex < needleLen && haystack.charAt(hayStackIndex) == needle.charAt(needleIndex)) {
                hayStackIndex++;
                needleIndex++;
            }
            // 跳出循环时，检查情况
            if (needleIndex == needleLen) { //若模式串扫描完了，说明全匹配，返回起始index
                return scanIndex;
            } else { //否则进行偏移
                if (scanIndex + needleLen >= hayLen) { //超出边界
                    return -1;
                }
                boolean flag = false;
                char nextChar = haystack.charAt(scanIndex + needleLen);
                for (int i = 0; i < needleLen; i++) { //若下一个字符存在于模式串中
                    if (needle.charAt(i) == nextChar) {
                        scanIndex += offsetMap.get(nextChar);
                        flag = true;
                        break;
                    }
                }
                //否则偏移量为needleLen + 1
                if (!flag) {
                    scanIndex += needleLen;
                }
            }
        }
        return -1;
    }
}
