package leet026_050.leet030;

import java.util.List;

/**
 * Author: Jayczee
 * Date: 2025/5/27
 */
public class Leet030Test {
    public static void main(String[] args) {
        String input = "lingmindraboofooowingdingbarrwingmonkeypoundcake";
        String[] arr = new String[]{"fooo", "barr", "wing", "ding", "wing"};
        List<Integer> ans = new Leet030().findSubstring(input, arr);
        for (Integer i : ans) {
            System.out.println(i);
        }
    }
}
