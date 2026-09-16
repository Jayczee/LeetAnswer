package leet026_050.leet027;


/**
 * Author: Jayczee
 * Date: 2024/10/18
 */
public class Leet027 {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int slow = 0, fast = 0; slow < nums.length && fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                k++;
                slow++;
            }
        }
        return k;
    }
}
