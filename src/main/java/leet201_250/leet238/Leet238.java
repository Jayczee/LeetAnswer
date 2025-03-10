package leet201_250.leet238;

/**
 * Author: Jayczee
 * Date: 2025/3/10
 */
public class Leet238 {
    public int[] productExceptSelf(int[] nums) {
        if (nums.length == 2) {
            return new int[]{nums[1], nums[0]};
        }

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                ans[i] = 1;
            } else {
                ans[i] = ans[i - 1] * nums[i - 1];
            }
        }

        int R = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= R;
            R *= nums[i];
        }


        return ans;
    }
}
