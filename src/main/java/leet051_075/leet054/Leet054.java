package leet051_075.leet054;

import java.util.ArrayList;
import java.util.List;

public class Leet054 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int direct = 0;//0: right 1:down 2:left 3:up

        int totalLength = 0;
        for (int[] ints : matrix) {
            if (ints != null) {
                totalLength += ints.length;
            }
        }

        int rightBoard = matrix[0].length - 1;
        int downBoard = totalLength / (rightBoard + 1) - 1;
        int leftBoard = 0, upBoard = 1;

        int count = 1, i = 0, j = 0;
        List<Integer> ans = new ArrayList<>();
        ans.add(matrix[0][0]);
        while (count < totalLength) {
            switch (direct) {
                case 0 -> {
                    if (j == rightBoard) {
                        direct = 1;
                        rightBoard--;
                    } else {
                        count++;
                        j++;
                        ans.add(matrix[i][j]);
                    }
                }
                case 1 -> {
                    if (i == downBoard) {
                        direct = 2;
                        downBoard--;
                    } else {
                        count++;
                        i++;
                        ans.add(matrix[i][j]);
                    }
                }
                case 2 -> {
                    if (j == leftBoard) {
                        direct = 3;
                        leftBoard++;
                    } else {
                        count++;
                        j--;
                        ans.add(matrix[i][j]);
                    }
                }
                case 3 -> {
                    if (i == upBoard) {
                        direct = 0;
                        upBoard++;
                    } else {
                        count++;
                        i--;
                        ans.add(matrix[i][j]);
                    }
                }
                default -> {
                }
            }
        }
        return ans;
    }
}
