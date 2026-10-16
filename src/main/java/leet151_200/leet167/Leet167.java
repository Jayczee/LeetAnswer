package leet151_200.leet167;

/**
 * Author: Jayczee
 * Date: 2025/5/26
 */
public class Leet167 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        int sum;
        do {
            sum = numbers[left] + numbers[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            }
        } while (sum != target);
        return new int[]{left + 1, right + 1};
    }
}
