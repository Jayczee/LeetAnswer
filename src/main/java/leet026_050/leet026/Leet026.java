package leet026_050.leet026;

/**
 * Author: Jayczee
 * Date: 2024/10/18
 */
public class Leet026 {
    // 1 2 3 3 3 4 4 5
    // 1 2 3 4 4 5 4 5
    // 1 2 3 4 5 5 4 5
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
}
