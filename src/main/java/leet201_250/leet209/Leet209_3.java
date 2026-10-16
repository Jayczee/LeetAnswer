package leet201_250.leet209;

/**
 * Author: Jayczee
 * Date: 2025/5/26
 */
public class Leet209_3 {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0, j = 0, minLen = Integer.MAX_VALUE, sum = nums[0];
        while (i <= j && j < nums.length) {
            if (sum < target) {
                j++;
                if (j < nums.length) {
                    sum += nums[j];
                }
            } else {
                minLen = Math.min(minLen, j - i + 1);
                i++;
                sum -= nums[i - 1];
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
