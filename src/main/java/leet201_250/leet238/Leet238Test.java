package leet201_250.leet238;

import java.util.Arrays;

/**
 * Author: Jayczee
 * Date: 2025/3/10
 */
public class Leet238Test {
    public static void main(String[] args) {
        int[] res = new Leet238().productExceptSelf(new int[]{1, 2, 3, 4});
        System.out.println(String.join(",", Arrays.stream(res).mapToObj(String::valueOf).toList()));
    }
}
