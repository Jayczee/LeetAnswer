package leet151_200.leet189;

import java.util.Arrays;

/**
 * Author: Jayczee
 * Date: 2025/2/28
 */
public class Leet189_3 {
    public void rotate(int[] nums, int k) {
        int actualK = k % nums.length;
        if (k == 0) {
            return;
        }
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, actualK - 1);
        reverse(nums, actualK, nums.length - 1);
        System.out.println(String.join(",", Arrays.stream(nums).mapToObj(String::valueOf).toList()));
    }

    void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
