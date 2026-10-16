package leet026_050.leet045;

/**
 * Author: Jayczee
 * Date: 2025/3/5
 */
public class Leet045 {
    public int jump(int[] nums) {
        // 3 3 1 1 1
        // 0 1 1 1 0
        if (nums.length == 1) return 0;
        int[] steps = new int[nums.length];
        for (int i = 0; i <= nums[0] && i < nums.length; i++) {
            steps[i] = 1;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 1; j <= nums[i] && i + j < nums.length; j++) {
                if (steps[i + j] == 0) {
                    steps[i + j] = steps[i] + 1;
                } else {
                    steps[i + j] = Math.min(steps[i] + 1, steps[i + j]);
                }
            }
        }
        return steps[nums.length - 1];
    }
}
