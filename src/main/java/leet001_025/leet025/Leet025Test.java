package leet001_025.leet025;

import pojo.ListNode;

/**
 * Author: Jayczee
 * Date: 2024/10/18
 */
public class Leet025Test {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        ListNode node5 = new ListNode(5);
        node4.next = node5;
        Leet025 leet025 = new Leet025();
        ListNode res = leet025.reverseKGroup(node1, 3);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
