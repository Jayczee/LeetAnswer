package leet251_300.leet274;

/**
 * Author: Jayczee
 * Date: 2025/3/6
 */
public class Leet274 {
    public int hIndex(int[] citations) {
//        for (int i = 1000;i>=0;i--){
//            int finalI = i;
//            int res = (int)Arrays.stream(citations).filter(num -> num >= finalI).count();
//            if (res >= finalI){
//                return i;
//            }
//        }
//        return 0;

        int left = 0, right = citations.length;
        while (left < right) {
            int mid = (left + right + 1) >> 1;
            int times = 0;
            for (int citation : citations) {
                if (citation >= mid) {
                    times++;
                }
            }
            if (times >= mid) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
