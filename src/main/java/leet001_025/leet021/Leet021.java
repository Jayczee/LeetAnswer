package leet001_025.leet021;

import pojo.ListNode;

/**
 * Author: Jayczee
 * Date: 2024/10/17
 */
public class Leet021 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        while (cur1 != null || cur2 != null) {
            if (cur1 == null) {
                cur.next = cur2;
                cur2 = cur2.next;
            } else if (cur2 == null) {
                cur.next = cur1;
                cur1 = cur1.next;
            } else if (cur1.val < cur2.val) {
                cur.next = cur1;
                cur1 = cur1.next;
            } else if (cur1.val > cur2.val) {
                cur.next = cur2;
                cur2 = cur2.next;
            } else { // equal
                cur.next = cur1;
                cur1 = cur1.next;
            }
            cur = cur.next;
        }
        return head.next;
    }
}
