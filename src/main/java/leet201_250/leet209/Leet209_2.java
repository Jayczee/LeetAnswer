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
            sums[i] = sums[i - 1] + nums[i - 1];
        }
        for (int i = 1; i <= nums.length; i++) {
            int bound = Arrays.binarySearch(sums, sums[i - 1] + target);
            if (bound < 0) {
                bound = -bound - 1; // Arrays.binarySearch特性
            }
            if (bound <= nums.length) {
                ans = Math.min(ans, bound - (i - 1));
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
