package leet001_025.leet019;

import pojo.ListNode;

/**
 * Author: Jayczee
 * Date: 2024/10/17
 */
public class Leet019Test {
    public static void main(String[] args) {
        Leet019 leet019 = new Leet019();
        ListNode head = new ListNode(1);
        ListNode lastNode = head;
        for (int i = 2; i < 6; i++) {
            ListNode newNode = new ListNode(i);
            lastNode.next = newNode;
            lastNode = newNode;
        }
        ListNode ans = leet019.removeNthFromEnd(head, 2);
        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}
