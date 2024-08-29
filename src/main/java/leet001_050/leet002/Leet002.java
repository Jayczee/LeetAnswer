package leet001_050.leet002;

import pojo.ListNode;

/**
 * Author: Jayczee
 * Date: 2024/8/26
 */
public class Leet002 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        final ListNode ansHead = new ListNode();
        ListNode cur = ansHead;
        int up = 0;
        while (l1 != null || l2 != null) {
            int v1 = l1 == null ? 0 : l1.val;
            int v2 = l2 == null ? 0 : l2.val;
            int res = (v1 + v2 + up) % 10;
            up = (v1 + v2 + up) / 10;
            cur.val = res;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            if (l1 == null && l2 == null) {
                if (up > 0) {
                    cur.next = new ListNode(up);
                }
                break;
            }
            cur.next = new ListNode();
            cur = cur.next;
        }
        return ansHead;
    }
}
