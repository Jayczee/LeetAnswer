package leet101_150.leet134;

/**
 * Author: Jayczee
 * Date: 2025/3/10
 */
public class Leet134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int i = 0, n = gas.length;
        while (i < n) {
            int cur = 0;
            int sumOfGas = 0, sumOfCost = 0;
            while (cur < n) {
                int pos = (i + cur) % n;
                sumOfGas += gas[pos];
                sumOfCost += cost[pos];
                if (sumOfGas < sumOfCost) {
                    i += cur;
                    break;
                }
                cur++;
            }
            if (cur == n) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
