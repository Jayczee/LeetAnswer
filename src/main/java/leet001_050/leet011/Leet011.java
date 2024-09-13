package leet001_050.leet011;

/**
 * Author: Jayczee
 * Date: 2024/9/9
 */
public class Leet011 {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int area = 0;
        while (i < j) {
            int tmpArea = Math.min(height[i], height[j]) * (j - i);
            if (tmpArea > area) {
                area = tmpArea;
            }
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return area;
    }
}
