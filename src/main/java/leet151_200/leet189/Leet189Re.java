package leet151_200.leet189;

public class Leet189Re {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int actualStep = k % n;
        int count = 0;

        for (int start = 0; count < n; start++) {
            int current = start;
            int prev = nums[start];

            do {
                int next = (current + actualStep) % n;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;

                current = next;
                count++;
            } while (start != current);
        }
    }
}
