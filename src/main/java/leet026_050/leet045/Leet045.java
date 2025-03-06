package leet026_050.leet045;

import java.util.Arrays;

/**
 * Author: Jayczee
 * Date: 2025/3/5
 */
public class Leet045 {
    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int[] steps = new int[nums.length];
        Arrays.fill(steps, 10001);
        steps[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            int range = nums[i];
            if (i + range >= nums.length - 1) {
                return steps[i] + 1;
            }
            for (int j = i + 1; j <= Math.min(i + range, nums.length - 1); j++) {
                if (steps[j] > steps[i] + 1) {
                    steps[j] = steps[i] + 1;
                }
            }
        }
        return steps[nums.length - 1];
    }
}
