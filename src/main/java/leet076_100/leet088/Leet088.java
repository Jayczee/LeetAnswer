package leet076_100.leet088;

/**
 * Author: Jayczee
 * Date: 2025/2/25
 */
public class Leet088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = m - 1, r = n - 1, cur = m + n - 1;
        while (l >= 0 && r >= 0) {
            if (nums1[l] >= nums2[r]) {
                nums1[cur] = nums1[l];
                l--;
            } else {
                nums1[cur] = nums2[r];
                r--;
            }
            cur--;
        }
        while (r >= 0) {
            nums1[cur] = nums2[r];
            r--;
            cur--;
        }
    }
}
