package leet001_025.leet024;

import pojo.ListNode;

/**
 * Author: Jayczee
 * Date: 2024/10/18
 */
public class Leet024Test {
    public static void main(String[] args) {
        Leet024 leet024 = new Leet024();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        ListNode res = leet024.swapPairs(node1);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }

    }
}
