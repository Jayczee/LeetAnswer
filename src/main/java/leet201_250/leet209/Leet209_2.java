package leet201_250.leet209;

import java.util.Arrays;

/**
 * Author: Jayczee
 * Date: 2025/5/26
 */
public class Leet209_2 {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int[] sums = new int[nums.length + 1];
        sums[0] = 0;
        for (int i = 1; i <= nums.length; i++) {
            sums[i] = sums[i - 1] + nums[i - 1];    // 计算前缀和数组  通过前缀和数组之间的相减可以得到原数组任意区间的累加和
        }
        //所以要做到sum[j] - sum[i-1] >= target
        //下面的bound就是j，通过二分查找找到j的位置
        for (int i = 1; i <= nums.length; i++) {
            int bound = Arrays.binarySearch(sums, sums[i - 1] + target);
            if (bound < 0) {
                bound = -bound - 1;
            }
            if (bound <= nums.length) {
                ans = Math.min(ans, bound - (i - 1));
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
