package leet151_200.leet189;

import java.util.Arrays;

/**
 * Author: Jayczee
 * Date: 2025/2/28
 */
public class Leet189_2 {
    public void rotate(int[] nums, int k) {
        int length = 0;
        for (int startLeft = 0; length < nums.length; startLeft++) {
            int left = startLeft;
            int right = (left + k) % nums.length;
            int tmp1 = nums[left];
            int tmp2 = nums[right];
            do {
                nums[right] = tmp1;
                tmp1 = tmp2;
                left = right;
                right = (left + k) % nums.length;
                tmp2 = nums[right];
                length++;
            } while (left != startLeft);
        }
        System.out.println(String.join(",", Arrays.stream(nums).mapToObj(String::valueOf).toList()));
    }
}
