package leet076_100.leet088;

/**
 * Author: Jayczee
 * Date: 2025/2/25
 */
public class Leet088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, cur = m + n - 1;
        while (p1 >= 0 || p2 >= 0) {
            if (p1 >= 0 && p2 >= 0) {
                if (nums1[p1] >= nums2[p2]) {
                    nums1[cur] = nums1[p1];
                    p1--;
                } else {
                    nums1[cur] = nums2[p2];
                    p2--;
                }
            } else if (p1 < 0) {
                nums1[cur] = nums2[p2];
                p2--;
            } else {
                nums1[cur] = nums1[p1];
                p1--;
            }
            cur--;
        }
    }
}
