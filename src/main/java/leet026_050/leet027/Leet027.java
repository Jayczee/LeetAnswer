package leet026_050.leet027;


/**
 * Author: Jayczee
 * Date: 2024/10/18
 */
public class Leet027 {
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        int fast = 0;
        int length = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                length++;
                slow++;
            }
            fast++;
        }
        return length;
    }
}
