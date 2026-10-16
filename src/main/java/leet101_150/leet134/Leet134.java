package leet101_150.leet134;

import java.util.Arrays;

/**
 * Author: Jayczee
 * Date: 2025/3/10
 */
public class Leet134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (Arrays.stream(gas).sum() < Arrays.stream(cost).sum()) {
            return -1;
        }
        if (gas.length == 1) {
            return gas[0] >= cost[0] ? 0 : -1;
        }
        int left = 0, right = 0, totalGas = 0;
        while (left < gas.length) {
            while (left < gas.length && gas[left] - cost[left] < 0) {
                left++;
            }
            if (left < gas.length) {
                totalGas = gas[left];
                right = (left + 1) % gas.length;
                totalGas -= cost[left];
                while (totalGas >= 0 && right != left) {
                    totalGas += gas[right];
                    totalGas -= cost[right];
                    right = (right + 1) % gas.length;
                }
                if (right == left && totalGas >= 0) {
                    return left;
                } else {
                    left = right;
                }

            }
        }
        return -1;
    }
}
