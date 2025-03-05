package leet151_200.leet189;

import java.util.Arrays;

/**
 * Author: Jayczee
 * Date: 2025/2/28
 */
public class Leet189 {
    public void rotate(int[] nums, int k) {
        int[] arr = Arrays.copyOf(nums, nums.length);
        for (int i = 0; i < arr.length; i++) {
            int index = i + k >= nums.length ? (i + k) % nums.length : i + k;
            nums[index] = arr[i];
        }
        System.out.println(String.join(",", Arrays.stream(nums).mapToObj(String::valueOf).toList()));
    }
}
