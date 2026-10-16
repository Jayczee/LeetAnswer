package leet251_300.leet274;

import java.util.Arrays;

/**
 * Author: Jayczee
 * Date: 2025/3/6
 */
public class Leet274 {
    public int hIndex(int[] citations) {
        int time = 0;
        Arrays.sort(citations);
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] >= time + 1) {
                time++;
            } else {
                break;
            }
        }
        return time;
    }
}
