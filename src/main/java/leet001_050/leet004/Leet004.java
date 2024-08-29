package leet001_050.leet004;

/**
 * Author: Jayczee
 * Date: 2024/8/27
 */
public class Leet004 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int k1 = (m + n + 1) / 2;
        int k2 = (m + n + 2) / 2;
        return (findK(nums1, 0, m - 1, nums2, 0, n - 1, k1) + findK(nums1, 0, m - 1, nums2, 0, n - 1, k2)) * 0.5;
    }

    private int findK(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k) {
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;

        if (len1 > len2) {
            // 切换nums1和nums2的位置，保证nums1总比nums2小，使出现空数组时一定是nums1为空
            return findK(nums2, start2, end2, nums1, start1, end1, k);
        }

        if (len1 == 0) {
            // 第一个数组为空时，直接从第二个数组中找出答案
            return nums2[start2 + k -1];
        }

        if (k == 1){
            // 如果k为1（找出第一个数），则比较返回nums1和nums2开头更小那个数
            return Math.min(nums1[start1], nums2[start2]);
        }

        int i = Math.min(end1 - start1 + 1, k / 2);
        int j = Math.min(end2 - start2 + 1, k / 2);
        if (nums1[start1 + i - 1] > nums2[start2 + j - 1]) {
            return findK(nums1, start1, end1, nums2, start2 + j, end2, k - j);
        }else{
            return findK(nums1, start1 + i, end1, nums2, start2, end2, k-i);
        }
    }
}
