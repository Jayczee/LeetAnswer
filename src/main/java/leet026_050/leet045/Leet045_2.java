package leet026_050.leet045;

public class Leet045_2 {
    public int jump(int[] nums) {
        int steps = 0, end = 0, maxReach = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxReach = Math.max(i + nums[i], maxReach);

            if (i == end) {
                steps++;
                end = maxReach;
            }
        }
        return steps;
    }
}
