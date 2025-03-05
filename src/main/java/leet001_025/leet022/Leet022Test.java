package leet001_025.leet022;

/**
 * Author: Jayczee
 * Date: 2024/10/18
 */
public class Leet022Test {
    public static void main(String[] args) {
        Leet022 leet022 = new Leet022();
        Leet022_2 leet022_2 = new Leet022_2();
        for (int i = 1; i <= 8; i++) {
            System.out.println(leet022_2.generateParenthesis(i));
        }

    }
}
