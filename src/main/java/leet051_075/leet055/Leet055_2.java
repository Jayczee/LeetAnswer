package leet051_075.leet055;

public class Leet055_2 {
    // 2 3 1 1 4
    // 3 4 1 0 4
    public boolean canJump(int[] nums) {
        int maxLen = nums[0];
        for (int i = 1; i < nums.length && i <= maxLen; i++) {
            maxLen = Math.max(maxLen, i + nums[i]);
        }
        return maxLen >= nums.length - 1;
    }
}
