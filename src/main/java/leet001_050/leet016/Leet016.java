package leet001_050.leet016;

import java.util.Arrays;

/**
 * Author: Jayczee
 * Date: 2024/9/13
 */
public class Leet016 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDiff = 11111111;
        int minSum = 1111111;
        for (int i = 0; i < nums.length; i++) {
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int currentSum = nums[i] + nums[l] + nums[r];
                int diff = Math.abs(currentSum - target);
                if (diff < minDiff) {
                    minDiff = diff;
                    minSum = currentSum;
                }
                if (currentSum > target) {
                    r--;
                } else if (currentSum < target) {
                    l++;
                } else {
                    return target;
                }
            }
        }
        return minSum;
    }
}
