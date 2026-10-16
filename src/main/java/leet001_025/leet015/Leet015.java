package leet001_025.leet015;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Author: Jayczee
 * Date: 2024/9/12
 */
public class Leet015 {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (nums[i] + sum > 0) {
                    right--;
                } else if (nums[i] + sum < 0) {
                    left++;
                } else {
                    ans.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }
            }

        }
        return ans.stream().toList();
    }
}
