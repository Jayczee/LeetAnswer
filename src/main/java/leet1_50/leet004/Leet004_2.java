package leet1_50.leet004;

/**
 * Author: Jayczee
 * Date: 2024/8/27
 */
public class Leet004_2 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        if (m > n) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int iMin = 0, iMax = m;
        while (iMin <= iMax) {
            // 长度和为偶：i + j = m- i + n - j ----> 2j = m + n - 2i ----> j = (m + n)/2 - i。 长度和为奇： i + j = m - i  + n - j  + 1 ----> j = ( m + n + 1) / 2 - i
            // 上面合并为 j = ( m + n + 1) / 2 - i ， 因为若长度和m+n为偶数，即便+1，其整除2的结果也不变
            int i = (iMin + iMax) / 2;
            int j = (m + n + 1) / 2 - i;

            // 当没有达到中位数条件时，执行前两个if，通过控制iMin和iMax的大小控制i的大小。
            if (i != 0 && j != n && nums1[i - 1] > nums2[j]) {
                iMax = i - 1;
            } else if (i != m && j != 0 && nums2[j - 1] > nums1[i]) {
                iMin = i + 1;
            } else { // 满足条件后， 找出左边最大和右边最小数，计算其和除以2，即为中位数。
                int maxLeft;
                if (i == 0) {
                    maxLeft = nums2[j - 1];
                } else if (j == 0) {
                    maxLeft = nums1[i - 1];
                } else {
                    maxLeft = Math.max(nums1[i - 1], nums2[j - 1]);
                }
                if ((m + n) % 2 == 1) { //若是奇数则不用考虑右边
                    return maxLeft;
                }

                int minRight;
                if (i == m) {
                    minRight = nums2[j];
                } else if (j == n) {
                    minRight = nums1[i];
                } else {
                    minRight = Math.min(nums1[i], nums2[j]);
                }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }
}
