package leet001_025.leet024;

import pojo.ListNode;

/**
 * Author: Jayczee
 * Date: 2024/10/18
 */
public class Leet024 {
    public ListNode swapPairs(ListNode head) {
        ListNode realHead = new ListNode(-1);
        realHead.next = head;
        return swap(realHead, realHead, head);
    }

    public ListNode swap(ListNode realHead, ListNode pre, ListNode cur) {
        if (cur == null || cur.next == null) {
            return realHead.next;
        } else {
            ListNode nextNode = cur.next;
            ListNode next2Node = nextNode.next;
            pre.next = nextNode;
            nextNode.next = cur;
            cur.next = next2Node;
            return swap(realHead, cur, next2Node);
        }
    }
}
