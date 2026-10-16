package leet201_250.leet238;

import java.util.Arrays;

/**
 * Author: Jayczee
 * Date: 2025/3/10
 */
public class Leet238 {
    public int[] productExceptSelf(int[] nums) {
        // 1 2 3 4 5 6
        if (nums.length == 1) return new int[0];
        int[] ans = new int[nums.length];
        Arrays.fill(ans, 1);
        int prefix = 1, suffix = 1;
        for (int i = 0; i < nums.length; i++) {
            prefix *= nums[i];
            suffix *= nums[nums.length - 1 - i];
            if (i + 1 < nums.length) {
                ans[i + 1] *= prefix;
            }
            if (nums.length - 1 - i - 1 >= 0) {
                ans[nums.length - 1 - i - 1] *= suffix;
            }
        }
        return ans;
    }
}
