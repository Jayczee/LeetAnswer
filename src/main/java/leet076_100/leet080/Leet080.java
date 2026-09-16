package leet076_100.leet080;

/**
 * Author: Jayczee
 * Date: 2025/2/25
 */
public class Leet080 {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int slow = 1;
        for (int fast = 2; fast < nums.length; fast++) {
            if (nums[slow] != nums[fast] || nums[slow] != nums[slow - 1]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
}
