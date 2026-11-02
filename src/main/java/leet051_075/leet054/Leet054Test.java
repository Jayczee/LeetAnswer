package leet051_075.leet054;

import java.util.List;

public class Leet054Test {
    public static void main(String[] args) {
        int[][] arr = new int[][]{new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9}};
        List<Integer> ans = new Leet054().spiralOrder(arr);
        for (Integer num : ans) {
            System.out.println(num);
        }
    }
}
