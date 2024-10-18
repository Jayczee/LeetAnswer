package leet001_050.leet019;

import pojo.ListNode;

/**
 * Author: Jayczee
 * Date: 2024/10/17
 */
public class Leet019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode endNode = null;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                endNode = head.next;
            } else {
                if (endNode != null) {
                    endNode = endNode.next;
                }
            }
        }
        ListNode cur = head;
        ListNode pre = new ListNode(-1);
        pre.next = cur;
        while (cur != null) {
            if (endNode == null) {
                if (cur == head) {
                    return head.next;
                } else {
                    pre.next = cur.next;
                    return head;
                }
            } else {
                pre = cur;
                cur = cur.next;
                endNode = endNode.next;
            }
        }
        return head;
    }
}
