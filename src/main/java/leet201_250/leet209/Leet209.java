package leet201_250.leet209;

/**
 * Author: Jayczee
 * Date: 2025/5/26
 */
public class Leet209 {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 1; j <= ans && j + i - 1 < nums.length; j++) {
                sum += nums[i + j - 1];
                if (sum >= target) {
                    ans = j;
                }
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
