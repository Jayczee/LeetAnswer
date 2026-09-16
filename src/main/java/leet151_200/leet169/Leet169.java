package leet151_200.leet169;

/**
 * Author: Jayczee
 * Date: 2025/2/26
 */
public class Leet169 {
    public int majorityElement(int[] nums) {
        int majorNum = nums[0];
        int majorCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != majorNum) {
                majorCount--;
            } else {
                majorCount++;
            }
            if (majorCount < 0) {
                majorNum = nums[i];
                majorCount = 1;
            }
        }
        return majorNum;
    }
}
