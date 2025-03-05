package leet026_050.leet026;

/**
 * Author: Jayczee
 * Date: 2024/10/18
 */
public class Leet026 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        boolean[] flag = new boolean[20001];
        int scanIndex = 0;
        int currentIndex = 0;
        int length = 0;
        while (scanIndex < nums.length) {
            if (!flag[nums[scanIndex] + 10000]) {
                nums[currentIndex] = nums[scanIndex];
                flag[nums[scanIndex] + 10000] = true;
                length++;
                currentIndex++;
            }
            scanIndex++;
        }
        return length;
    }
}
