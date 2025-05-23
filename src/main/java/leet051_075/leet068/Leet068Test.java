package leet051_075.leet068;

import java.util.List;

/**
 * Author: Jayczee
 * Date: 2025/5/23
 */
public class Leet068Test {
    public static void main(String[] args) {
        List<String> res = new Leet068().fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16);
        for (String s : res) {
            System.out.println(s);
        }
    }
}
