package leet051_075.leet055;

/**
 * Author: Jayczee
 * Date: 2025/3/4
 */
public class Leet055 {
    // 2 3 1 1 4
    // 3 2 0 0 4
    public boolean canJump(int[] nums) {
        boolean[] flag = new boolean[nums.length];
        flag[0] = true;
        for (int i = 0; i < nums.length && flag[i]; i++) {
            int step = nums[i];
            for (int j = 1; j <= step && i + j < nums.length; j++) {
                flag[i + j] = true;
            }
        }
        return flag[nums.length - 1];
    }
}
