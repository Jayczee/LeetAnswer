package leet151_200.leet169;

/**
 * Author: Jayczee
 * Date: 2025/2/26
 */
public class Leet169 {
    public int majorityElement(int[] nums) {
        int cur = 0, count = 0;
        for (int num : nums) {
            if (count == 0) {
                cur = num;
                count = 1;
            } else if (count > 0 && cur == num) {
                count++;
            } else if (count > 0) {
                count--;
            }
        }
        return cur;
    }
}
