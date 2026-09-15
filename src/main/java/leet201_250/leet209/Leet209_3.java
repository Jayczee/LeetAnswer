package leet201_250.leet209;

/**
 * Author: Jayczee
 * Date: 2025/5/26
 */
public class Leet209_3 {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0, end = 0, sum = nums[start], ans = Integer.MAX_VALUE;
        while (start <= end && end < nums.length) {
            if (sum >= target) {
                ans = Math.min(ans, end - start + 1);
            }
            if (start == end) {
                end++;
                if (end < nums.length) {
                    sum += nums[end];
                }
            } else if (sum >= target) {
                sum -= nums[start];
                start++;
            } else {
                end++;
                if (end < nums.length) {
                    sum += nums[end];
                }
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
