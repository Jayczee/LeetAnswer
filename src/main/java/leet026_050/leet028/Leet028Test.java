package leet026_050.leet028;

/**
 * Author: Jayczee
 * Date: 2024/10/21
 */
public class Leet028Test {
    public static void main(String[] args) {
        Leet028_2 leet028_2 = new Leet028_2();
        String s1 = "aacaabmvkamfbmafkbmfamriemb";
        String s2 = "fkb";
        System.out.println(leet028_2.strStr(s1, s2) == s1.indexOf(s2));
    }
}
