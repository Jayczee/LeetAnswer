package leet026_050.leet026;

/**
 * Author: Jayczee
 * Date: 2024/10/18
 */
public class Leet026Test {
    public static void main(String[] args) {
        Leet026 leet026 = new Leet026();
        int[] input = new int[]{0, 0, 0, 1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 7, 7};
        int k = leet026.removeDuplicates(input);
        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.println(input[i]);
        }
    }
}
