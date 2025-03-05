package leet001_025.leet018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Author: Jayczee
 * Date: 2024/10/17
 */
public class Leet018 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        if (nums.length < 4) {
            return Collections.emptyList();
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int l = 0; l < nums.length - 3; l++) {
            if (l > 0 && nums[l] == nums[l - 1]) continue;
            for (int r = nums.length - 1; r > 2; r--) {
                if (r < nums.length - 1 && nums[r] == nums[r + 1]) continue;
                int j = l + 1, k = r - 1;
                while (j < k) {
                    long sum = (long) nums[l] + nums[j] + nums[k] + nums[r];
                    if (sum > target) {
                        k--;
                    } else if (sum < target) {
                        j++;
                    } else {
                        ans.add(List.of(nums[l], nums[j], nums[k], nums[r]));
                        while (j < k && nums[j] == nums[j + 1]) j++;
                        while (j < k && nums[k] == nums[k - 1]) k--;
                        j++;
                        k--;
                    }
                }
            }
        }
        return ans;
    }
}
