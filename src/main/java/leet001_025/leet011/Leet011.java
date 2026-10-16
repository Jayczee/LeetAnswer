package leet001_025.leet011;

/**
 * Author: Jayczee
 * Date: 2024/9/9
 */
public class Leet011 {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, max = 0;
        while (left < right) {
            int heightL = height[left], heightR = height[right];
            max = Math.max(max, (right - left) * Math.min(heightL, heightR));
            if (heightL > heightR) {
                right--;
            } else {
                left++;
            }
        }
        return max;
    }
}
