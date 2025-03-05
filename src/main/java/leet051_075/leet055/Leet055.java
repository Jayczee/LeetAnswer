package leet051_075.leet055;

/**
 * Author: Jayczee
 * Date: 2025/3/4
 */
public class Leet055 {
    public boolean canJump(int[] nums) {
        boolean[] arr = new boolean[nums.length];
        arr[0] = true;
        for (int i = 0; i < nums.length; i++) {
            if (!arr[i]) {
                continue;
            }
            int range = nums[i];
            if (i + range >= nums.length - 1) {
                return true;
            }
            for (int j = i; j <= Math.min(i + range, nums.length - 1); j++) {
                arr[j] = true;
            }
        }
        return arr[nums.length - 1];
    }
}
