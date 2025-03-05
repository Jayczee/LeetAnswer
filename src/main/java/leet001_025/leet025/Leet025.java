package leet001_025.leet025;

import pojo.ListNode;

import java.util.Stack;

/**
 * Author: Jayczee
 * Date: 2024/10/18
 */
public class Leet025 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) return head;
        ListNode pre = new ListNode(-1);
        pre.next = head;
        return reverse(pre, pre, head, k);
    }

    private ListNode reverse(ListNode realHead, ListNode pre, ListNode start, int k) {
        if (start == null) {
            return realHead.next;
        }
        ListNode end = start;
        for (int i = 0; i < k - 1; i++) {
            if (end != null) {
                end = end.next;
            }
        }
        if (end == null) {
            return realHead.next;
        }
        reverseBetweenK(pre, start, end, end.next);
        //递归
        return reverse(realHead, start, start.next, k); //此时start已经变成end了
    }

    private void reverseBetweenK(ListNode pre, ListNode start, ListNode end, ListNode endNext) {
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = start;
        while (cur != end) {
            stack.push(cur);
            cur = cur.next;
        }
        stack.push(end);
        cur = pre;
        while (!stack.isEmpty()) {
            cur.next = stack.pop();
            cur = cur.next;
        }
        cur.next = endNext;
    }
}
